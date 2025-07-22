package GestionReservas;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pago {

    private int idPago;
    private int idReserva;
    private BigDecimal monto;
    private String metodoPago;
    private LocalDate fechaPago;

    public Pago(int idReserva, BigDecimal monto, String metodoPago) {
        this.idReserva = idReserva;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.fechaPago = LocalDate.now();
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

}
