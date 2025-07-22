package GestionEmpleados;

import GestionEmpleados.Enum.TipoContrato;
import Interfaz.*;
import java.util.*;

// No se impleto una clase generica para los Gestores, ya que podrian comprometer la integridad del tipado
public class GestorEmpleados implements IGestionEmpleados, IGestionAreas, IGestionRegistros{
    //Lista de empleados, areas y registros
    private Set<Empleado> misEmpleados;
    private Set<Area> misAreas;
    private List<RegistroPago> misRegistros;

    //Constructor sin argumentos de entradas
    public GestorEmpleados() {
        misEmpleados = new HashSet<>();
        misAreas = new HashSet<>();
        misRegistros = new ArrayList<>();
    }

    //Contructor con argumentos de entrada
    public GestorEmpleados(Set<Empleado> misEmpleados, Set<Area> misAreas, List<RegistroPago> misRegistros) {
        this.misEmpleados = misEmpleados != null? misEmpleados: new HashSet<>();
        this.misAreas = misAreas != null? misAreas: new HashSet<>();
        this.misRegistros = misRegistros != null? misRegistros: new ArrayList<>();
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