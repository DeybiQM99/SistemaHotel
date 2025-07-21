package GestionEmpleados;

import GestionEmpleados.Enum.TipoContrato;
import java.time.LocalDate;

public class GerenteGeneral {

    // Aprueba un pago pendiente, marcándolo como realizado.
    public static void aprobarPago(RegistroPago pago) {
        if (pago.isPendiente()) {
            pago.marcarComoRealizado();
        }
    }

    // Aprueba un despido, registrándolo en el empleado.
    public static void aprobarDespido(Empleado empleado) {
        empleado.registrarDespido();
    }

    // Gestiona el ascenso de un operario a supervisor.
    public static void asensoOperario(GestorEmpleados gestorEmpleados, Empleado nuevoOperario, int idSupervisor) {
        Operario operarioAsignado = new Operario(
            nuevoOperario.getAreaLabor(),            // int idArea
            nuevoOperario.getTarifaPorHora(),        // double tarifaPorHora
            nuevoOperario.getId(),                   // int id
            nuevoOperario.getNombre(),               // String nombre
            nuevoOperario.getApellido(),             // String apellido
            nuevoOperario.getEmail(),                // String email
            nuevoOperario.getDni(),                  // String dni
            nuevoOperario.getFechaIngreso(),         // LocalDate fechaIngreso
            nuevoOperario.getFechaTermino(),         // LocalDate fechaTermino
            nuevoOperario.getFechaRenovacion(),      // LocalDate fechaRenovacion
            nuevoOperario.getTipoContrato(),         // TipoContrato tipoContrato
            idSupervisor                              // int idSupervisor
        );
        
        gestorEmpleados.dropEmpleado(nuevoOperario);
        gestorEmpleados.addEmpleado(operarioAsignado);
    }

    // Gestiona el ascenso de un supervisor a jefe.
    public static void asensoSupervisor(GestorEmpleados gestorEmpleados, Empleado nuevoSupervisor, int idJefe) {
        Supervisor supervisorAsignado = new Supervisor(
            nuevoSupervisor.getAreaLabor(),            // int idArea
            nuevoSupervisor.getTarifaPorHora(),        // double tarifaPorHora
            nuevoSupervisor.getId(),                   // int id
            nuevoSupervisor.getNombre(),               // String nombre
            nuevoSupervisor.getApellido(),             // String apellido
            nuevoSupervisor.getEmail(),                // String email
            nuevoSupervisor.getDni(),                  // String dni
            nuevoSupervisor.getFechaIngreso(),         // LocalDate fechaIngreso
            nuevoSupervisor.getFechaTermino(),         // LocalDate fechaTermino
            nuevoSupervisor.getFechaRenovacion(),      // LocalDate fechaRenovacion
            nuevoSupervisor.getTipoContrato(),         // TipoContrato tipoContrato
            idJefe                              // int idSupervisor
        );
        gestorEmpleados.dropEmpleado(nuevoSupervisor);
        gestorEmpleados.addEmpleado(supervisorAsignado);
    }

    // Gestiona el ascenso de un jefe a Gerente General.
    public static void asensoJefe(GestorEmpleados gestorEmpleados,Empleado nuevoJefe) {
        Jefe jefeAsignado = new Jefe(
            nuevoJefe.getAreaLabor(),            // int idArea
            nuevoJefe.getTarifaPorHora(),        // double tarifaPorHora
            nuevoJefe.getId(),                   // int id
            nuevoJefe.getNombre(),               // String nombre
            nuevoJefe.getApellido(),             // String apellido
            nuevoJefe.getEmail(),                // String email
            nuevoJefe.getDni(),                  // String dni
            nuevoJefe.getFechaIngreso(),         // LocalDate fechaIngreso
            nuevoJefe.getFechaTermino(),         // LocalDate fechaTermino
            nuevoJefe.getFechaRenovacion(),      // LocalDate fechaRenovacion
            nuevoJefe.getTipoContrato()          // TipoContrato tipoContrato
        );
        gestorEmpleados.dropEmpleado(nuevoJefe);
        gestorEmpleados.addEmpleado(jefeAsignado);
    }

    // Renueva el contrato de un empleado actualizando sus fechas.
    public static void renovarContrato(Empleado empleado,
                                LocalDate nuevaTermino,
                                LocalDate nuevaRenovacion,
                                TipoContrato tipoContrarto) {
        empleado.setFechaTermino(nuevaTermino);
        empleado.setFechaRenovacion(nuevaRenovacion);
        empleado.setTipoContrato(tipoContrarto);
    }
}