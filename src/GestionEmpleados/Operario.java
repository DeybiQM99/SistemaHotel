package GestionEmpleados;

import GestionEmpleados.Enum.*;
import java.time.LocalDate;

public class Operario extends Empleado {
    // Identificador del supervisor responsable
    private int idSupervisor;

    // Constructor completo.
    public Operario(int idArea,
                    double tarifaPorHora,
                    int id,
                    String nombre,
                    String apellido,
                    String email,
                    String dni,
                    LocalDate fechaIngreso,
                    LocalDate fechaTermino,
                    LocalDate fechaRenovacion,
                    TipoContrato tipoContrato,
                    int idSupervisor) {
        super(idArea, tarifaPorHora, id, nombre, apellido, email, dni,
              fechaIngreso, fechaTermino, fechaRenovacion, tipoContrato);
        this.idSupervisor = idSupervisor;
    }

    // Constructor alternativo: fechaIngreso al momento actual.

    public Operario(int idArea,
                    double tarifaPorHora,
                    int id,
                    String nombre,
                    String apellido,
                    String email,
                    String dni,
                    LocalDate fechaTermino,
                    LocalDate fechaRenovacion,
                    TipoContrato tipoContrato,
                    int idSupervisor) {
        super(idArea, tarifaPorHora, id, nombre, apellido, email, dni,
              fechaTermino, fechaRenovacion, tipoContrato);
        this.idSupervisor = idSupervisor;
    }

    // Obtiene el identificador del supervisor.
    public int getIdSupervisor() {
        return idSupervisor;
    }

    // Establece el identificador del supervisor.
    public void setIdSupervisor(int idSupervisor) {
        this.idSupervisor = idSupervisor;
    }
}

