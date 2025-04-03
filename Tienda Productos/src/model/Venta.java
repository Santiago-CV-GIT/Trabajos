package model;

import java.util.ArrayList;
import java.util.Date;

public class Venta {
    private Date fecha;
    private ArrayList<DetalleVenta>listaDetalleVentas;

    public Venta(Date fecha) {
        this.listaDetalleVentas = new ArrayList();
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<DetalleVenta> getListaDetalleVentas() {
        return listaDetalleVentas;
    }

    public void setListaDetalleVentas(ArrayList<DetalleVenta> listaDetalleVentas) {
        this.listaDetalleVentas = listaDetalleVentas;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "fecha=" + fecha +
                ", listaDetalleVentas=" + listaDetalleVentas +
                '}';
    }

    public boolean agregarProducto(Producto producto, int cantidad) {
        if(producto.tieneStockSuficiente(producto.getCantidadProducto())) {
            DetalleVenta detalle = new DetalleVenta(producto, producto.getCantidadProducto(), producto.getPrecioProducto());
            listaDetalleVentas.add(detalle);
            producto.reducirStock(cantidad);
            return true;
        }
        return false;
    }

}
