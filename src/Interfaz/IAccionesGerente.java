package Interfaz;

import GestionEmpleados.Empleado;
import GestionEmpleados.Enum.TipoContrato;
import GestionEmpleados.GestorEmpleados;
import GestionEmpleados.RegistroPago;
import java.time.LocalDate;

public interface IAccionesGerente {
    void aprobarPago(RegistroPago pago);
    void aprobarDespido(Empleado empleado);
    void asensoOperario(GestorEmpleados gestorEmpleados, Empleado nuevoOperario, int idSupervisor);
    void asensoSupervisor(GestorEmpleados gestorEmpleados, Empleado nuevoSupervisor, int idJefe);
    void asensoJefe(GestorEmpleados gestorEmpleados,Empleado nuevoJefe);
    void renovarContrato(Empleado empleado,
                        LocalDate nuevaTermino,
                        LocalDate nuevaRenovacion,
                        TipoContrato tipoContrato);
}
