package GestionEmpleados;

import GestionEmpleados.Enum.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import Interfaz.IGestionGenerica;

public class Supervisor extends Empleado implements IGestionGenerica <Operario> {

    // Lista de IDs de operarios a cargo del supervisor
    private final List<Integer> listaOperarioIds = new ArrayList<>();
    // Identificador del jefe responsable
    private int idJefe;

    // Constructor principal.
    public Supervisor(int idArea,
                      double tarifaPorHora,
                      int id,
                      String nombre,
                      String apellido,
                      String email,
                      String dni,
                      LocalDateTime fechaIngreso,
                      LocalDateTime fechaTermino,
                      LocalDateTime fechaRenovacion,
                      TipoContrato tipoContrato,
                      int idJefe) {
        super(idArea, tarifaPorHora, id, nombre, apellido, email, dni,
              fechaIngreso, fechaTermino, fechaRenovacion, tipoContrato);
    }

    // Constructor alternativo: fechaIngreso al momento actual.
    public Supervisor(int idArea,
                      double tarifaPorHora,
                      int id,
                      String nombre,
                      String apellido,
                      String email,
                      String dni,
                      LocalDateTime fechaTermino,
                      LocalDateTime fechaRenovacion,
                      TipoContrato tipoContrato,
                      int idJefe) {
        this(idArea, tarifaPorHora, id, nombre, apellido, email, dni,
             LocalDateTime.now(), fechaTermino, fechaRenovacion, tipoContrato, idJefe);
    }
    
    //Agrega un Operario.
    @Override
    public void add(Operario operario) {
        listaOperarioIds.add(operario.getId());
    }

    // Elimina un operario por su identificador.
    @Override
    public void drop(int idOperario) {
        listaOperarioIds.remove(Integer.valueOf(idOperario));
    }

    // Elimina un operario por su objeto.
    @Override
    public void drop(Operario operario) {
        if (operario != null)
            drop(operario.getId());
    }

    // Obtiene la lista de IDs de operarios asignados (solo lectura), evitando enlazar las listas.
    public List<Integer> getListaOperarioIds() {
        return List.copyOf(listaOperarioIds);
    }
    
    // Obtiene el identificador del jefe.
    public int getIdJefe() {
        return idJefe;
    }

    // Establece el identificador del jefe.
    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }
}