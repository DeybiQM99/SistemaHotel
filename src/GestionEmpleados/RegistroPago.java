package GestionEmpleados;

import java.time.LocalDate;

public class RegistroPago {

    // Identificador único del registro de pago
    private final int idPago;

    // Identificador del empleado al que corresponde el pago
    private final int idEmpleado;

    // Fecha y hora en que se emitió o programó el pago
    private final LocalDate fechaPago;

    // Monto total a pagar
    private double sueldoBase;
    
    // Monto total a pagar
    private double bono;
    
    // Monto total a pagar
    private double descuento;
    
    // Monto total a pagar
    private double montoTotal;

    // Medio de pago
    public enum MedioPago { EFECTIVO, TRANSFERENCIA };
    private MedioPago medioPago;
    
    // Estado actual del pago
    public enum PagoEstado { PENDIENTE, REALIZADO }
    private PagoEstado estado;

    // Constructor principal.
    public RegistroPago(int idPago,
                        int idEmpleado,
                        LocalDate fechaPago,
                        double sueldoBase,
                        double bono,
                        double descuento,
                        MedioPago medioPago) {
        this.idPago = idPago;
        this.idEmpleado = idEmpleado;
        this.fechaPago = fechaPago;
        this.sueldoBase = sueldoBase;
        this.bono = bono;
        this.descuento = descuento;
        this.montoTotal = (sueldoBase +  bono) - descuento;
        this.medioPago = medioPago;
        this.estado = PagoEstado.PENDIENTE;
    }
    
    // Constructor alternativo sin fechaIngreso explícita (se toma el momento actual).
    public RegistroPago(int idPago,
                        int idEmpleado,
                        double sueldoBase,
                        double bono,
                        double descuento,
                        MedioPago medioPago) {
        this.idPago = idPago;
        this.idEmpleado = idEmpleado;
        this.fechaPago = LocalDate.now();
        this.sueldoBase = sueldoBase;
        this.bono = bono;
        this.descuento = descuento;
        this.montoTotal = (sueldoBase +  bono) - descuento;
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
    
    //Actualizar MontoTotal
    public void actualizarMonto() {
        montoTotal = (sueldoBase +  bono) - descuento;
    }

    // Obtiene el identificador único del registro de pago.
    public int getIdPago() { return idPago; }

    // Obtiene el identificador del empleado asociado.
    public int getIdEmpleado() { return idEmpleado; }

    // Obtiene la fecha y hora del pago.
    public LocalDate getFechaPago() { return fechaPago; }

    public double getSueldoBase() { return sueldoBase; }
    public void setSueldoBase(double sueldoBase) { this.sueldoBase = sueldoBase; }

    public double getBono() { return bono; }
    public void setBono(double bono) { this.bono = bono; }

    public double getDescuento() { return descuento; }
    public void setDescuento(double descuento) { this.descuento = descuento; }

    public double getMontoTotal() { return montoTotal; }
    
    // Obtiene el estado actual del pago.
    public PagoEstado getEstado() { return estado; }

    public MedioPago getMedioPago() { return medioPago; }
    public void setMedioPago(MedioPago medioPago) { this.medioPago = medioPago; }
    
    
}