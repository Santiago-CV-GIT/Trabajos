package model;

import java.util.ArrayList;

public class Cliente {
    private String nombres;
    private String identificacion;
    private String correo;
    private String telefono;
    private String direccion;
    private ArrayList<Venta>listaVentas;

    public Cliente(String nombres,String direccion, String telefono, String correo, String identificacion) {
        this.nombres = nombres;
        this.listaVentas = new ArrayList<>();
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(ArrayList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombres='" + nombres + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", listaVentas=" + listaVentas +
                '}';
    }

    public void agregarVenta(Venta venta) {
        getListaVentas().add(venta);
    }
    public void eliminarVenta(Venta venta) {
        getListaVentas().remove(venta);
    }

    public ArrayList<DetalleVenta> ventasconproductode(String producto) {
        ArrayList<DetalleVenta> ventascon = new ArrayList<>();
        for(Venta venta :listaVentas) {
            ArrayList<DetalleVenta> aux=venta.getListaDetalleVentas();
            for(DetalleVenta detalleventa :aux) {
                if(detalleventa.getProducto().equals(producto)) {
                    ventascon.add(detalleventa);
                }
            }
        }
        return ventascon;
    }


    }

