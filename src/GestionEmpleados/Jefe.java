package GestionEmpleados;

import GestionEmpleados.Enum.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import Interfaz.IGestionGenerica;
import java.time.LocalDate;

public class Jefe extends Empleado implements IGestionGenerica<Supervisor> {

    // ID de supervisores a cargo
    private final List<Integer> listaSupervisorIds = new ArrayList<>();

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
                LocalDate fechaIngreso,
                LocalDate fechaTermino,
                LocalDate fechaRenovacion,
                TipoContrato tipoContrato) {
        super(idArea, tarifaPorHora, id, nombre, apellido, email, dni,
              fechaIngreso, fechaTermino, fechaRenovacion, tipoContrato);
    }

    // Constructor alternativo: fechaIngreso al momento actual.
    public Jefe(int idArea,
                double tarifaPorHora,
                int id,
                String nombre,
                String apellido,
                String email,
                String dni,
                LocalDate fechaTermino,
                LocalDate fechaRenovacion,
                TipoContrato tipoContrato) {
        this(idArea, tarifaPorHora, id, nombre, apellido, email, dni,
             LocalDate.now(), fechaTermino, fechaRenovacion, tipoContrato);
    }

    // Calcula el salario semanal: tarifa por horas trabajadas más bono.
    @Override
    public double calcularSalario(int ultimosNdias) {
        return super.calcularSalario(ultimosNdias) + BONO_JEFE;
    }
    
    // Agrega un supervisor al jefe si no está ya presente.
    @Override
    public void add(Supervisor supervisor) {
        listaSupervisorIds.add(supervisor.getId());
    }
    // Agrega un supervisor al jefe si no está ya presente.
    @Override
    public void add(int IDsupervisor) {
        listaSupervisorIds.add(IDsupervisor);
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
