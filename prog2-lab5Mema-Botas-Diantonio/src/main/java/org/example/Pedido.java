package org.example;

import java.util.Date;

/**
 * @author gabi
 */
public class Pedido {
    private int idPedido;
    private Date fecha;
    private double total;
    private EstadoPedido estado;

    public Pedido() {
    }
    
    public Pedido(int idPedido, Date fecha, double total, EstadoPedido estado) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    //GETTER Y SETTERS
    
    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public EstadoPedido getEstado() {
        return estado;
    }
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    //TOSTRING
    
    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", fecha=" + fecha + ", total=" + total + ", estado=" + estado + '}';
    }
    
    //
    
    
    
    
}

