package GestionEmpleados;

import Interfaz.*;
import GestionEmpleados.Enum.TipoContrato;
import GestionEmpleados.Enum.TipoIncidencia;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

// No se impleto una clase generica para los Gestores, ya que podrian comprometer la integridad del tipado
public class GestorEmpleados implements IGestionEmpleados, IGestionAreas, IGestionRegistros{
private static final String FILE_AREAS = "data/areas.dat";
    private static final String FILE_REGISTROS = "data/registros.dat";
    private static final String FILE_EMPLEADOS_CSV = "data/empleados.csv";

    // Listas
    private Set<Empleado> misEmpleados;
    private Set<Area> misAreas;
    private List<RegistroPago> misRegistros;

    public GestorEmpleados() {
        misEmpleados = new HashSet<>();
        misAreas = new HashSet<>();
        misRegistros = new ArrayList<>();
        cargarDatos();
    }

    public GestorEmpleados(Set<Empleado> misEmpleados, Set<Area> misAreas, List<RegistroPago> misRegistros) {
        this.misEmpleados = misEmpleados != null ? misEmpleados : new HashSet<>();
        this.misAreas = misAreas != null ? misAreas : new HashSet<>();
        this.misRegistros = misRegistros != null ? misRegistros : new ArrayList<>();
    }

    // Cargar datos
    public void cargarDatos() {
        // Cargar empleados desde CSV
        importEmpleadosCSV(FILE_EMPLEADOS_CSV);

        // Cargar áreas
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_AREAS))) {
            misAreas = (Set<Area>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            misAreas = new HashSet<>();
        }

        // Cargar registros
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_REGISTROS))) {
            misRegistros = (List<RegistroPago>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            misRegistros = new ArrayList<>();
        }
    }

    // Guardar datos
    public void guardarDatos() {
        exportEmpleadosCSV(FILE_EMPLEADOS_CSV);

        // Guardar áreas
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_AREAS))) {
            oos.writeObject(misAreas);
        } catch (IOException e) { e.printStackTrace(); }

        // Guardar registros
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_REGISTROS))) {
            oos.writeObject(misRegistros);
        } catch (IOException e) { e.printStackTrace(); }
    }

    // ===============================
    // IMPORTACIÓN CSV (SUPERFICIAL)
    // ===============================
    public void importEmpleadosCSV(String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("Archivo de empleados no encontrado: " + path);
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNum = 0;
            while ((line = br.readLine()) != null) {
                lineNum++;
                if (line.trim().isEmpty() || line.startsWith("#")) continue;

                String[] parts = line.split(",");
                if (parts.length < 19) {
                    System.out.println("⚠ Línea " + lineNum + " tiene menos columnas (" + parts.length + "). Se completarán por defecto.");
                }

                // Asegurar tamaño
                parts = Arrays.copyOf(parts, 19);
                for (int i = 0; i < parts.length; i++) if (parts[i] == null) parts[i] = "";

                try {
                    String tipo = parts[0].trim();
                    int id = parseIntSafe(parts[1]);
                    String nombre = parts[2].trim();
                    String apellido = parts[3].trim();
                    String email = parts[4].trim();
                    String dni = parts[5].trim();
                    double salario = parseDoubleSafe(parts[6]);
                    LocalDate fechaTermino = parseDateSafe(parts[7]);
                    LocalDate fechaRenovacion = parseDateSafe(parts[8]);
                    TipoContrato contrato = parseContratoSafe(parts[9]);
                    int idArea = parseIntSafe(parts[10]);
                    double tarifa = parseDoubleSafe(parts[11]);
                    Map<LocalDate, List<Integer>> horas = deserializeHoras(parts[12]);
                    Map<LocalDate, Boolean> asistencias = deserializeAsistencias(parts[13]);
                    TipoIncidencia tipoIncidencia = parseIncidenciaSafe(parts[14]);
                    String textIncidencia = parts[15].trim();
                    String textObservacion = parts[16].trim();
                    LocalDate fechaInc = parseDateSafe(parts[17]);
                    int extra = parseIntSafe(parts[18]);

                    Empleado emp = null;
                    switch (tipo.toUpperCase()) {
                        case "OPERARIO" -> emp = new Operario(extra, salario, fechaTermino, fechaRenovacion, contrato,
                                idArea, tarifa, horas, asistencias, tipoIncidencia, textIncidencia, textObservacion, fechaInc);
                        case "SUPERVISOR" -> emp = new Supervisor(extra, salario, fechaTermino, fechaRenovacion, contrato,
                                idArea, tarifa, horas, asistencias, tipoIncidencia, textIncidencia, textObservacion, fechaInc);
                        case "JEFE" -> emp = new Jefe(salario, fechaTermino, fechaRenovacion, contrato,
                                idArea, tarifa, horas, asistencias, tipoIncidencia, textIncidencia, textObservacion, fechaInc);
                        default -> {
                            System.out.println("⚠ Línea " + lineNum + " ignorada: tipo desconocido (" + tipo + ")");
                            continue;
                        }
                    }

                    emp.setId(id);
                    emp.setNombre(nombre);
                    emp.setApellido(apellido);
                    emp.setEmail(email);
                    emp.setDni(dni);
                    misEmpleados.add(emp);

                } catch (Exception ex) {
                    System.out.println("❌ Error procesando línea " + lineNum + ": " + ex.getMessage());
                }
            }
            System.out.println("Importación completada. Total empleados cargados: " + misEmpleados.size());
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo CSV: " + e.getMessage());
        }
    }

    // ===============================
    // EXPORTACIÓN CSV
    // ===============================
    public void exportEmpleadosCSV(String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (Empleado e : misEmpleados) {
                String tipo = e instanceof Operario ? "OPERARIO" :
                              e instanceof Supervisor ? "SUPERVISOR" :
                              "JEFE";
                int extra = e instanceof Operario ? ((Operario) e).getIdSupervisor() :
                            e instanceof Supervisor ? ((Supervisor) e).getIdJefe() : 0;
                bw.write(String.join(",",
                        tipo,
                        String.valueOf(e.getId()),
                        e.getNombre(),
                        e.getApellido(),
                        e.getEmail(),
                        e.getDni(),
                        String.valueOf(e.getSalario()),
                        serializeDate(e.getFechaTermino()),
                        serializeDate(e.getFechaRenovacion()),
                        e.getTipoContrato() != null ? e.getTipoContrato().name() : "",
                        String.valueOf(e.getAreaLabor()),
                        String.valueOf(e.getTarifaPorHora()),
                        serializeHoras(e.getHorasTrabajadasPorDia()),
                        serializeAsistencias(e.getListaAsistencias()),
                        e.getTipoIncidencia() != null ? e.getTipoIncidencia().name() : "",
                        e.getTextIncidencia() != null ? e.getTextIncidencia() : "",
                        e.getTextObservacion() != null ? e.getTextObservacion() : "",
                        serializeDate(e.getFechaInc()),
                        String.valueOf(extra)
                ));
                bw.newLine();
            }
            System.out.println("Empleados exportados correctamente en: " + path);
        } catch (IOException e) {
            System.out.println("❌ Error al escribir el archivo CSV: " + e.getMessage());
        }
    }

    // ===============================
    // AUXILIARES
    // ===============================
    private int parseIntSafe(String s) { try { return Integer.parseInt(s.trim()); } catch (Exception e) { return 0; } }
    private double parseDoubleSafe(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { return 0.0; } }
    private LocalDate parseDateSafe(String s) { try { return (s == null || s.trim().isEmpty()) ? null : LocalDate.parse(s.trim()); } catch (Exception e) { return null; } }
    private String serializeDate(LocalDate d) { return d != null ? d.toString() : ""; }
    private TipoContrato parseContratoSafe(String s) { try { return TipoContrato.valueOf(s.trim().toUpperCase()); } catch (Exception e) { return TipoContrato.TEMPORAL; } }
    private TipoIncidencia parseIncidenciaSafe(String s) { try { return TipoIncidencia.valueOf(s.trim().toUpperCase()); } catch (Exception e) { return TipoIncidencia.NINGUNA; } }

    private Map<LocalDate, List<Integer>> deserializeHoras(String s) {
        Map<LocalDate, List<Integer>> map = new HashMap<>();
        if (s == null || s.trim().isEmpty()) return map;
        String[] pairs = s.split(";");
        for (String p : pairs) {
            String[] kv = p.split(":");
            if (kv.length == 2) {
                LocalDate date = parseDateSafe(kv[0]);
                List<Integer> horas = new ArrayList<>();
                for (String h : kv[1].split("\\|")) horas.add(parseIntSafe(h));
                if (date != null) map.put(date, horas);
            }
        }
        return map;
    }

    private String serializeHoras(Map<LocalDate, List<Integer>> map) {
        StringBuilder sb = new StringBuilder();
        for (var entry : map.entrySet()) {
            sb.append(entry.getKey()).append(":");
            sb.append(String.join("|", entry.getValue().stream().map(String::valueOf).toList()));
            sb.append(";");
        }
        return sb.toString();
    }

    private Map<LocalDate, Boolean> deserializeAsistencias(String s) {
        Map<LocalDate, Boolean> map = new HashMap<>();
        if (s == null || s.trim().isEmpty()) return map;
        String[] pairs = s.split(";");
        for (String p : pairs) {
            String[] kv = p.split(":");
            if (kv.length == 2) {
                LocalDate date = parseDateSafe(kv[0]);
                boolean present = "true".equalsIgnoreCase(kv[1]);
                if (date != null) map.put(date, present);
            }
        }
        return map;
    }

    private String serializeAsistencias(Map<LocalDate, Boolean> map) {
        StringBuilder sb = new StringBuilder();
        for (var entry : map.entrySet()) {
            sb.append(entry.getKey()).append(":").append(entry.getValue()).append(";");
        }
        return sb.toString();
    }

    
    //Añadir elementos a las listas
    @Override
    public void addEmpleado(Empleado e){
        misEmpleados.add(e);
    }    
    
    @Override
    public void addArea(Area a){
        misAreas.add(a);
    }   
   
    @Override
    public void addRegistroPago(RegistroPago rp){
        misRegistros.add(rp);
    }
    
    // Elimina un supervisor a cargo por su identificador.
    @Override
    public void dropEmpleado(int idEmpleado) {
        if(!misEmpleados.isEmpty()){
            for(Empleado e: misEmpleados){
                if(e.getId() == idEmpleado){
                    misEmpleados.remove(e);
                }
            }
        }
    }

    // Elimina un supervisor a cargo por su objeto.
    @Override
    public void dropEmpleado(Empleado empleado) {
        if (empleado != null) {
            misEmpleados.remove(empleado);
        }
    }
    
    // Elimina un Area por su identificador.
    @Override
    public void dropArea(int idArea) {
        Iterator<Area> it = misAreas.iterator();
        while (it.hasNext()){
            Area a = it.next();
                if(a.getIdArea() == idArea)
                    it.remove();
       }   
    }

    // Elimina un Area por su objeto.
    @Override
    public void dropArea(Area area) {
        if (area != null && !misAreas.isEmpty()) {
            Iterator<Area> it = misAreas.iterator();
                while (it.hasNext()){
                    Area a = it.next();  
                    if(a.getIdArea() == area.getIdArea()){
                        it.remove();
                        break;    
                    }
                }
        }
    }
    
    // Elimina un Registro por su identificador.
    @Override
    public void dropRegistroPago(int idRegistro) {
        if(!misRegistros.isEmpty()){
            for(RegistroPago rg: misRegistros){
                if(rg.getIdPago() == idRegistro){
                    misRegistros.remove(rg);
                }
            }
        }
    }

    // Elimina un Registro por su objeto.
    @Override
    public void dropRegistroPago(RegistroPago registro) {
        if (registro != null) {
            misRegistros.remove(registro);
        }
    }    
    
    // Buscador de empleado por su id
    @Override
    public Empleado getEmpleado(int idEmpleado){
        Empleado empleado = null;

        if(!misEmpleados.isEmpty()){
            for(Empleado e : misEmpleados){
                if(e.getId() == idEmpleado){
                    empleado = e;
                    return empleado;
                }
            }
        }

        return empleado;
    }

    // Buscador de empleado por su objeto
    @Override
    public Empleado getEmpleado(Empleado empleado){
        Empleado resultado = null;

        if(empleado != null && !misEmpleados.isEmpty()){
            for(Empleado e : misEmpleados){
                if(e.equals(empleado)){
                    resultado = e;
                    return resultado;
                }
            }
        }

        return resultado;
    }

    // Buscador de área por su id
    @Override
    public Area getArea(int idArea){
        Area area = null;

        if(!misAreas.isEmpty()){
            for(Area a : misAreas){
                if(a.getIdArea() == idArea){
                    area = a;
                    return area;
                }
            }
        }

        return area;
    }

    // Buscador de área por su objeto
    @Override
    public Area getArea(Area area){
        Area resultado = null;

        if(area != null && !misAreas.isEmpty()){
            for(Area a : misAreas){
                if(a.equals(area)){
                    resultado = a;
                    return resultado;
                }
            }
        }

        return resultado;
    }

    // Buscador de registro por su id
    @Override
    public RegistroPago getRegistroPago(int idRegistro){
        RegistroPago registro = null;

        if(!misRegistros.isEmpty()){
            for(RegistroPago rp : misRegistros){
                if(rp.getIdPago() == idRegistro){
                    registro = rp;
                    return registro;
                }
            }
        }

        return registro;
    }

    // Buscador de registro por su objeto
    @Override
    public RegistroPago getRegistroPago(RegistroPago registro){
        RegistroPago resultado = null;

        if(registro != null && !misRegistros.isEmpty()){
            for(RegistroPago rp : misRegistros){
                if(rp.equals(registro)){
                    resultado = rp;
                    return resultado;
                }
            }
        }

        return resultado;
    }

    //Modificar datos de empleado
    @Override
    public void modificarEmpleado(int idEmpleado, String nombre, String apellido, String email,
                                  String dni, TipoContrato tipoContrato, int idArea, double tarifaHora){
        if(!misEmpleados.isEmpty()){
            for(Empleado e: misEmpleados){
                if(e.getId() == idEmpleado){
                    e.setNombre(nombre);
                    e.setApellido(apellido);
                    e.setEmail(email);
                    e.setDni(dni);
                    e.setTipoContrato(tipoContrato);
                    e.setAreaLabor(idArea);
                    e.setTarifaPorHora(tarifaHora);
                }
            }
        }
    }
    
    //Modificar valores de Area
    @Override
    public void modificarArea(int idArea, String nombre){
        
        if(!misAreas.isEmpty()){
            for(Area a: misAreas){
                if(a.getIdArea() == idArea){
                    a.setNombre(nombre);
                }
            }
        }
        
    }
    
    //Modificar valores Registro
    @Override
    public void modificarRegistroPago(int idRegistro, double montoBase){
        if(!misRegistros.isEmpty()){
            for(RegistroPago rp: misRegistros){
                if(rp.getIdPago() == idRegistro){
                    rp.setSueldoBase(montoBase);
                    rp.actualizarMonto();
                }
            }
        }
    }
    
    // Obtiene la listas (solo lectura), evitando enlazar las listas.
    @Override
    public List<Empleado> getMisEmpleados() { return List.copyOf(misEmpleados); }
    @Override
    public List<Area> getMisAreas() { return List.copyOf(misAreas); }
    @Override
    public List<RegistroPago> getMisRagistro() { return List.copyOf(misRegistros); }
}