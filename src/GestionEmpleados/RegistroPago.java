package GestionEmpleados;

import java.time.LocalDateTime;

public class RegistroPago {

    // Identificador único del registro de pago
    private final int idPago;

    // Identificador del empleado al que corresponde el pago
    private final int idEmpleado;

    // Fecha y hora en que se emitió o programó el pago
    private final LocalDateTime fechaPago;

    // Monto total a pagar
    private double monto;

    // Medio de pago
    public enum MedioPago { EFECTIVO, TRANSFERENCIA };
    private MedioPago medioPago;
    
    // Estado actual del pago
    public enum PagoEstado { PENDIENTE, REALIZADO }
    private PagoEstado estado;

    // Constructor principal.
    public RegistroPago(int idPago,
                        int idEmpleado,
                        LocalDateTime fechaPago,
                        double monto,
                        MedioPago medioPago) {
        this.idPago = idPago;
        this.idEmpleado = idEmpleado;
        this.fechaPago = fechaPago;
        this.monto = monto;
        this.medioPago = medioPago;
        this.estado = PagoEstado.PENDIENTE;
    }
    
    // Constructor alternativo sin fechaIngreso explícita (se toma el momento actual).
    public RegistroPago(int idPago,
                        int idEmpleado,
                        double monto,
                        MedioPago medioPago) {
        this.idPago = idPago;
        this.idEmpleado = idEmpleado;
        this.fechaPago = LocalDateTime.now();
        this.monto = monto;
        this.medioPago = medioPago;
        this.estado = PagoEstado.PENDIENTE;
    }

    // Marca el pago como realizado y actualiza el estado.
    public void marcarComoRealizado() {
        this.estado = PagoEstado.REALIZADO;
    }

    // Verifica si el pago aún se encuentra pendiente.
    public boolean isPendiente() {
        return this.estado == PagoEstado.PENDIENTE;
    }

    // Obtiene el identificador único del registro de pago.
    public int getIdPago() { return idPago; }

    // Obtiene el identificador del empleado asociado.
    public int getIdEmpleado() { return idEmpleado; }

    // Obtiene la fecha y hora del pago.
    public LocalDateTime getFechaPago() { return fechaPago; }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    // Obtiene el estado actual del pago.
    public PagoEstado getEstado() { return estado; }

    public MedioPago getMedioPago() { return medioPago; }
    public void setMedioPago(MedioPago medioPago) { this.medioPago = medioPago; }
    
    
}