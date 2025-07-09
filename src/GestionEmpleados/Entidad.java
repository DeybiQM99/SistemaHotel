package GestionEmpleados;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Entidad {
    // Identificador único de la entidad
    protected final int id;

    // Nombre del empleado
    protected String nombre;

    // Apellido del empleado
    protected String apellido;

    // Correo electrónico del empleado
    protected String email;

    // Documento de identidad
    protected String dni;

    // Fecha y hora de ingreso
    protected LocalDate fechaIngreso;
    
    //Formateo de la fecha de salida
    protected static final DateTimeFormatter FORMATO_FECHA =
        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    // Constructor principal.
    public Entidad(int id,
                   String nombre,
                   String apellido,
                   String email,
                   String dni,
                   LocalDate fechaIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
    }

    // Constructor alternativo, establece fechaIngreso al momento actual.
    public Entidad(int id,
                   String nombre,
                   String apellido,
                   String email,
                   String dni) {
        this(id, nombre, apellido, email, dni,
             LocalDate.now());
    }

    // Representación en texto de la entidad con formato legible. No implementada todavia
    @Override
    public abstract String toString();

    // Método abstracto para el cálculo de salario.
    public abstract double calcularSalario(int ultimosNdias);

    // Getters y Setters

    //Identificador único para Id (solo lectura).
    public int getId() { return id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }
    
}