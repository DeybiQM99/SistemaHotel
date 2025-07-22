package GestionEmpleados;

import GestionEmpleados.Enum.*;
import java.time.LocalDate;

public class Supervisor extends Empleado{

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
                      LocalDate fechaIngreso,
                      LocalDate fechaTermino,
                      LocalDate fechaRenovacion,
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