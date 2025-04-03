package model;

public class DetalleVenta {
    private Producto producto;
    private int cantidad;
    private float subtotal;

    public DetalleVenta(Producto producto,int cantidad,float subtotal){
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setproducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public float getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" +
                "producto=" + producto +
                ", cantidad=" + cantidad +
                ", subtotal=" + subtotal +
                '}';
    }
}


