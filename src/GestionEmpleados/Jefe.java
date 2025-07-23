package GestionEmpleados;

import GestionEmpleados.Enum.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Jefe extends Empleado implements Serializable{
    
    // Bono fijo que recibe el jefe por gestión
    private static final double BONO_JEFE = 380;

    public Jefe() { super(); }
    
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

    public Jefe(double salario, LocalDate fechaTermino, LocalDate fechaRenovacion, TipoContrato tipoContrato, int idArea, double tarifaPorHora, Map<LocalDate, List<Integer>> horasTrabajadasPorDia, Map<LocalDate, Boolean> listaAsistencias, TipoIncidencia tipoIncidencia, String textIncidencia, String textObservacion, LocalDate fechaInc) {
        super(salario, fechaTermino, fechaRenovacion, tipoContrato, idArea, tarifaPorHora, horasTrabajadasPorDia, listaAsistencias, tipoIncidencia, textIncidencia, textObservacion, fechaInc);
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
    
}
