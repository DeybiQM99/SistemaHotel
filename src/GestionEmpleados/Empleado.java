package GestionEmpleados;

import GestionEmpleados.Enum.*;
import Interfaz.IAsistencia;
import java.time.LocalDate;
import java.util.*;

public abstract class Empleado extends Entidad implements IAsistencia {

    // Salario calculado
    protected double salario;
    
    // Fecha y hora de término de contrato
    protected LocalDate fechaTermino;

    // Fecha y hora de próxima renovación 
    protected LocalDate fechaRenovacion;
    
    // Tipo de contrato laboral
    protected TipoContrato tipoContrato;
    
    // Área o departamento del empleado
    protected int idArea;

    // Tarifa por hora para cálculo de salario
    protected double tarifaPorHora;

    // Horas trabajadas cada día de la semana
    protected final Map<LocalDate, List<Integer>> horasTrabajadasPorDia = new HashMap<>();

    // Mapa de asistencia: fecha -> presente (true) o falta (false)
    protected final Map<LocalDate, Boolean> listaAsistencias = new HashMap<>();

    // Tipo de Incidencia
    protected TipoIncidencia tipoIncidencia;
    
    // Descrp Incidencia
    protected String textIncidencia;
    
    // Observacion Incidencia
    protected String textObservacion;
    
    // Fecha Incidencia
    protected LocalDate fechaInc;
    
    // Constructor completo.
    public Empleado(int idArea,
                    double tarifaPorHora,
                    int id,
                    String nombre,
                    String apellido,
                    String email,
                    String dni,
                    LocalDate fechaIngreso,
                    LocalDate fechaTermino,
                    LocalDate fechaRenovacion,
                    TipoContrato tipoContrato) {
        super(id, nombre, apellido, email, dni, fechaIngreso);
        this.fechaTermino = fechaTermino;
        this.fechaRenovacion = fechaRenovacion;
        this.tipoContrato = tipoContrato;
        this.tipoIncidencia = TipoIncidencia.NINGUNA;
        this.idArea = idArea;
        this.tarifaPorHora = tarifaPorHora;
    }

    // Constructor alternativo sin fechaIngreso explícita (se toma el momento actual).
    public Empleado(int idArea,
                    double tarifaPorHora,
                    int id,
                    String nombre,
                    String apellido,
                    String email,
                    String dni,
                    LocalDate fechaTermino,
                    LocalDate fechaRenovacion,
                    TipoContrato tipoContrato) {
        super(id, nombre, apellido, email, dni);
        this.fechaTermino = fechaTermino;
        this.fechaRenovacion = fechaRenovacion;
        this.tipoContrato = tipoContrato;
        this.tipoIncidencia = TipoIncidencia.NINGUNA;
        this.idArea = idArea;
        this.tarifaPorHora = tarifaPorHora;
    }

    //Marca al empleado como despedido y actualiza la fecha de término.
    public void registrarDespido() {
        this.tipoContrato = TipoContrato.DESPEDIDO;
        fechaIngreso = null;
        fechaTermino = null;
        fechaRenovacion = null;
    }
    
    // Representación en texto de la entidad con formato legible.
    @Override
    public String toString() {
        return String.format(
            "ID: %d | %s %s | Email: %s | DNI: %s | Ingreso: %s | Término: %s | Salario: %.2f | Contrato: %s",
            id,
            nombre,
            apellido,
            email,
            dni,
            fechaIngreso.format(FORMATO_FECHA),
            fechaTermino.format(FORMATO_FECHA),
            salario,
            tipoContrato
        );
    }
    
    // Todavia no se implementa el metodo.
    @Override
    public double calcularSalario(int ultimosNdias) {
        int totalHoras = 0;
        LocalDate hoy = LocalDate.now();

        for (int d = 0; d < ultimosNdias; d++) {
            LocalDate fecha = hoy.minusDays(d);
            List<Integer> horasPares = horasTrabajadasPorDia.getOrDefault(fecha, List.of());
            for (int i = 0; i < horasPares.size() - 1; i += 2) {
                totalHoras += horasPares.get(i + 1) - horasPares.get(i);
            }
        }
        
        salario = totalHoras * tarifaPorHora;
        
        horasTrabajadasPorDia.clear();
        
        return salario;
    }
    
    // Registra las horas trabajadas en un día calculando la diferencia entre ingreso y salida.
    @Override
    public void registrarHorasDiarias(LocalDate fecha, List<Integer> horas) {
        horasTrabajadasPorDia.put(fecha, horas);
    }

    // Registra la asistencia en una fecha, evitando sobrescrituras.
    @Override
    public void registrarAsistencia(LocalDate fecha, boolean presente) {
        listaAsistencias.putIfAbsent(fecha, presente);
    }

    // Cuenta cuántas faltas (valores false) hay en los ultimos días
    @Override
    public int obtenerFaltas(int ultimosNdias) {
        int faltas = 0;
        LocalDate hoy = LocalDate.now();

        for (int i = 0; i < ultimosNdias; i++) {
            LocalDate dia = hoy.minusDays(i);
            Boolean presente = listaAsistencias.get(dia);
            if (presente == null || !presente) {
                faltas++;
            }
        }

        return faltas;
    }

    // Getters y setters

    public int getAreaLabor() { return idArea; }
    public void setAreaLabor(int idArea) { this.idArea = idArea; }

    public double getTarifaPorHora() { return tarifaPorHora; }
    public void setTarifaPorHora(double tarifaPorHora) { this.tarifaPorHora = tarifaPorHora; }

    // Obtiene las horas trabajadas por día (solo lectura), evitando enlazar las listas.
    public Map<LocalDate, List<Integer>> getHorasTrabajadasPorDia() { return Collections.unmodifiableMap(horasTrabajadasPorDia); }

    // Obtiene el registro de asistencias (solo lectura), evitando enlazar las listas.
    public Map<LocalDate, Boolean> getListaAsistencias() { return Map.copyOf(listaAsistencias); }
    
    public LocalDate getFechaTermino() { return fechaTermino; }
    public void setFechaTermino(LocalDate fechaTermino) { this.fechaTermino = fechaTermino;}

    public double getSalario() { return salario; }

    public LocalDate getFechaRenovacion() { return fechaRenovacion; }
    public void setFechaRenovacion(LocalDate fechaRenovacion) { this.fechaRenovacion = fechaRenovacion; }

    public TipoContrato getTipoContrato() { return tipoContrato; }
    public void setTipoContrato(TipoContrato tipoContrato) { this.tipoContrato = tipoContrato; }

    public TipoIncidencia getTipoIncidencia() { return tipoIncidencia; }
    public void setTipoIncidencia(TipoIncidencia tipoIncidencia) { this.tipoIncidencia = tipoIncidencia; }

    public String getTextIncidencia() { return textIncidencia; }
    public void setTextIncidencia(String textIncidencia) { this.textIncidencia = textIncidencia; }

    public String getTextObservacion() { return textObservacion; }
    public void setTextObservacion(String textObservacion) { this.textObservacion = textObservacion; }

    public LocalDate getFechaInc() { return fechaInc; }
    public void setFechaInc(LocalDate fechaInc) { this.fechaInc = fechaInc; }
}