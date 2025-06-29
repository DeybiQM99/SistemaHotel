package GestionEmpleados;

import GestionEmpleados.Enum.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import Interfaz.IGestionGenerica;

public class Jefe extends Empleado implements IGestionGenerica<Supervisor> {

    // ID de supervisores a cargo
    private final List<Integer> listaSupervisorIds;

    // Bono fijo que recibe el jefe por gestión
    private static final double BONO_JEFE = 380;

    // Constructor principal.
    public Jefe(int idArea,
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
                List<Integer> supervisorIds) {
        super(idArea, tarifaPorHora, id, nombre, apellido, email, dni,
              fechaIngreso, fechaTermino, fechaRenovacion, tipoContrato);
        this.listaSupervisorIds = new ArrayList<>();
    }

    // Constructor alternativo: fechaIngreso al momento actual.
    public Jefe(int idArea,
                double tarifaPorHora,
                int id,
                String nombre,
                String apellido,
                String email,
                String dni,
                LocalDateTime fechaTermino,
                LocalDateTime fechaRenovacion,
                TipoContrato tipoContrato,
                List<Integer> supervisorIds) {
        this(idArea, tarifaPorHora, id, nombre, apellido, email, dni,
             LocalDateTime.now(), fechaTermino, fechaRenovacion, tipoContrato,
             supervisorIds);
    }

    // Calcula el salario semanal: tarifa por horas trabajadas más bono.
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + BONO_JEFE;
    }
    
    // Agrega un supervisor al jefe si no está ya presente.
    @Override
    public void add(Supervisor supervisor) {
        listaSupervisorIds.add(supervisor.getId());
    }

    // Elimina un supervisor a cargo por su identificador.
    @Override
    public void drop(int idSupervisor) {
        listaSupervisorIds.remove(Integer.valueOf(idSupervisor));
    }

    // Elimina un supervisor a cargo por su objeto.
    @Override
    public void drop(Supervisor supervisor) {
        if (supervisor != null) {
            drop(supervisor.getId());
        }
    }

    // Obtiene la lista de IDs de supervisores asignados (solo lectura), evitando enlazar las listas.
    public List<Integer> getListaSupervisorIds() {
        return List.copyOf(listaSupervisorIds);
    }
}
