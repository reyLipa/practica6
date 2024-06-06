package modelos;


import java.time.LocalDate;
import java.util.Date;

public class Factura {
    private int idFactura;
    private int idCliente;
    private int idProducto;
    private LocalDate fecha;
    private int cantidad;
    private float total;

    public Factura() {
    }

    public Factura(int idFactura, int idCliente, int idProducto, LocalDate fecha, int cantidad, float total) {
        this.idFactura = idFactura;
        this.idCliente = idCliente;
        this.idProducto = idProducto;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.total = total;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", idCliente=" + idCliente +
                ", idProducto=" + idProducto +
                ", fecha=" + fecha +
                ", cantidad=" + cantidad +
                ", total=" + total +
                '}';
    }
}
