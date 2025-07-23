package GestionEmpleados;

import GestionEmpleados.Enum.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Supervisor extends Empleado implements Serializable{

    // Identificador del jefe responsable
    private int idJefe;

    public Supervisor() { super(); }

    // Constructor principal.
    public Supervisor(int idArea,
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
                      int idJefe) {
        super(idArea, tarifaPorHora, id, nombre, apellido, email, dni,
              fechaIngreso, fechaTermino, fechaRenovacion, tipoContrato);
    }

    public Supervisor(int idJefe, double salario, LocalDate fechaTermino, LocalDate fechaRenovacion, TipoContrato tipoContrato, int idArea, double tarifaPorHora, Map<LocalDate, List<Integer>> horasTrabajadasPorDia, Map<LocalDate, Boolean> listaAsistencias, TipoIncidencia tipoIncidencia, String textIncidencia, String textObservacion, LocalDate fechaInc) {
        super(salario, fechaTermino, fechaRenovacion, tipoContrato, idArea, tarifaPorHora, horasTrabajadasPorDia, listaAsistencias, tipoIncidencia, textIncidencia, textObservacion, fechaInc);
        this.idJefe = idJefe;
    }
    
    // Constructor alternativo: fechaIngreso al momento actual.
    public Supervisor(int idArea,
                      double tarifaPorHora,
                      int id,
                      String nombre,
                      String apellido,
                      String email,
                      String dni,
                      LocalDate fechaTermino,
                      LocalDate fechaRenovacion,
                      TipoContrato tipoContrato,
                      int idJefe) {
        this(idArea, tarifaPorHora, id, nombre, apellido, email, dni,
             LocalDate.now(), fechaTermino, fechaRenovacion, tipoContrato, idJefe);
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