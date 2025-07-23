package GestionEmpleados;

import GestionEmpleados.Enum.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Operario extends Empleado implements Serializable{
    // Identificador del supervisor responsable
    private int idSupervisor;
    
    private static final long serialVersionUID = 1L;

    public Operario() { super(); }

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

    public Operario(int idSupervisor, double salario, LocalDate fechaTermino, LocalDate fechaRenovacion, TipoContrato tipoContrato, int idArea, double tarifaPorHora, Map<LocalDate, List<Integer>> horasTrabajadasPorDia, Map<LocalDate, Boolean> listaAsistencias, TipoIncidencia tipoIncidencia, String textIncidencia, String textObservacion, LocalDate fechaInc) {
        super(salario, fechaTermino, fechaRenovacion, tipoContrato, idArea, tarifaPorHora, horasTrabajadasPorDia, listaAsistencias, tipoIncidencia, textIncidencia, textObservacion, fechaInc);
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

