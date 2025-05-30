package GestionReservas;
public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private int dni;
/*PRUEBA*/
    public Cliente(String nombre, String apellido, String telefono, String email, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", Apellido: " + apellido + ", Teléfono: " + telefono + ", Email: " + email + ", Dni: " + dni;
    }
}
