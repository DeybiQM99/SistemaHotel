package Interfaz;
import GestionEmpleados.Area;
import GestionEmpleados.RegistroPago;
import java.util.List;

  public interface IGestionRegistros {
    void addRegistroPago(RegistroPago registro);
    void dropRegistroPago(int idRegistro);
    void dropRegistroPago(RegistroPago registro);
    RegistroPago getRegistroPago(int idRegistro);
    RegistroPago getRegistroPago(RegistroPago registro);
    void modificarRegistroPago(int idRegistro, double monto);
    List<Area> getMisAreas();
}