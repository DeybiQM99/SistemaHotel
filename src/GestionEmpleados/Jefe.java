package GestionEmpleados;

import GestionEmpleados.Enum.*;
import java.time.LocalDate;

public class Jefe extends Empleado{
    
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
    
}
