package GestionReservas;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Factura {

    private int idFactura;
    private int idReserva;
    private BigDecimal subtotal;
    private BigDecimal igv;
    private BigDecimal total;
    private LocalDate fechaEmision;
    
    public Factura(int idReserva, BigDecimal subtotal, BigDecimal igv, BigDecimal total) {
        this.idReserva = idReserva;
        this.subtotal = subtotal;
        this.igv = igv;
        this.total = total;
        this.fechaEmision = LocalDate.now();
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getIgv() {
        return igv;
    }

    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

}
