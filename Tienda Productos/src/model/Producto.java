package model;

public class Producto {
    private String nombreProducto;
    private String codigoProducto;
    private float precioProducto;
    private String categoriaProducto;
    private int cantidadProducto;

    public Producto(String nombreProducto, String codigoProducto, float precioProducto, String categoriaProducto, int cantidadProducto) {
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        this.precioProducto = precioProducto;
        this.categoriaProducto = categoriaProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", codigoProducto='" + codigoProducto + '\'' +
                ", precioProducto=" + precioProducto +
                ", categoriaProducto='" + categoriaProducto + '\'' +
                ", cantidadProducto='" + cantidadProducto + '\'' +
                '}';
    }
    public String reducirStock(int cantidad) {
        if(cantidad <= this.cantidadProducto) {
            this.cantidadProducto -= cantidad;
            return "Cantidad Actualizada";
        }
        return "La cantidad del producto es menor que "+cantidad+": ";
    }

    public String aumentarStock(int cantidad) {
        this.cantidadProducto += cantidad;
        return "Cantidad Actualizada";
    }

    public boolean tieneStockSuficiente(int cantidadRequerida) {
        return this.cantidadProducto >= cantidadRequerida;
    }
}
