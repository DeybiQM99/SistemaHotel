package GestionReservas;

public class Usuario {

    // Atributos privados (encapsulados)
    private String nombreUsuario;
    private String contrasena;

    // Constructor: sirve para crear objetos Usuario con nombre y contraseña
    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    // Métodos get: permiten acceder a los datos encapsulados
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    // Método set: permite modificar la contraseña
    public void setContrasena(String nuevaContrasena) {
        this.contrasena = nuevaContrasena;
    }

}
