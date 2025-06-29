package GestionEmpleados;

import GestionEmpleados.Enum.EstadoLaboral;
import Interfaz.IAccionesGerente;
import java.time.LocalDateTime;

public class GerenteGeneral extends Entidad implements IAccionesGerente {
    // Salario fijo mensual del Gerente General
    private static final double SALARIO_FIJO = 9800.0;

    //Constructor completo.
    public GerenteGeneral(int id,
                          String nombre,
                          String apellido,
                          String email,
                          String dni,
                          LocalDateTime fechaIngreso) {
        super(id, nombre, apellido, email, dni, fechaIngreso);
    }

    // Constructor alternativo sin fechaIngreso explícita (se toma el momento actual).
    public GerenteGeneral(int id,
                        String nombre,
                        String apellido,
                        String email,
                        String dni) {
        super(id, nombre, apellido, email, dni);
    }

    // Aprueba un pago pendiente, marcándolo como realizado.
    @Override
    public void aprobarPago(RegistroPago pago) {
        if (pago.isPendiente()) {
            pago.marcarComoRealizado();
        }
    }

    // Aprueba un despido, registrándolo en el empleado.
    @Override
    public void aprobarDespido(Empleado empleado) {
        empleado.registrarDespido();
    }

    // Gestiona el ascenso de un operario a supervisor.
    @Override
    public void asensoOperario(GestorEmpleados gestorEmpleados, Empleado nuevoOperario, int idSupervisor) {
        Operario operarioAsignado = (Operario)(nuevoOperario);
        operarioAsignado.setIdSupervisor(idSupervisor);
        gestorEmpleados.dropEmpleado(nuevoOperario);
        gestorEmpleados.addEmpleado(operarioAsignado);
    }

    // Gestiona el ascenso de un supervisor a jefe.
    @Override
    public void asensoSupervisor(GestorEmpleados gestorEmpleados, Empleado nuevoSupervisor, int idJefe) {
        Supervisor supervisorAsignado = (Supervisor)(nuevoSupervisor);
        supervisorAsignado.setIdJefe(idJefe);
        gestorEmpleados.dropEmpleado(nuevoSupervisor);
        gestorEmpleados.addEmpleado(supervisorAsignado);
    }

    // Gestiona el ascenso de un jefe a Gerente General.
    @Override
    public void asensoJefe(GestorEmpleados gestorEmpleados,Empleado nuevoJefe) {
        Jefe jefeAsignado = (Jefe)(nuevoJefe);
        gestorEmpleados.dropEmpleado(nuevoJefe);
        gestorEmpleados.addEmpleado(jefeAsignado);
    }

    // Renueva el contrato de un empleado actualizando sus fechas.
    @Override
    public void renovarContrato(Empleado empleado,
                                LocalDateTime nuevaTermino,
                                LocalDateTime nuevaRenovacion) {
        empleado.setFechaTermino(nuevaTermino);
        empleado.setFechaRenovacion(nuevaRenovacion);
        // Reactivar empleado en caso de que estuviera despedido
        if (empleado.getEstadoLaboral() == EstadoLaboral.DESPEDIDO) {
            empleado.setEstadoLaboral(EstadoLaboral.ACTIVO);
        }
    }

    // Devuelve el salario fijo del Gerente General.
    @Override
    public double calcularSalario() {
        return SALARIO_FIJO;
    }

    // Representación en texto del Gerente General.
    @Override
    public String toString() {
        return String.format("Gerente General: %s %s (ID: %d)\nCorreo: %s\nDNI: %s\nIngreso: %s",
                nombre, apellido, id, email, dni,
                fechaIngreso.format(FORMATO_FECHA));
    }
}