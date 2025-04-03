package model;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private ArrayList<Cliente>listaClientes;
    private ArrayList<Producto>listaProductos;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.listaProductos = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                ", listaClientes=" + listaClientes +
                ", listaProductos=" + listaProductos +
                '}';
    }
    public ArrayList<Producto> productoconcategoria(String categoria) {
        ArrayList<Producto> productoscategoria = new ArrayList<>();
        for(Producto producto: listaProductos) {
            if(categoria.equals(producto.getCategoriaProducto()));
            productoscategoria.add(producto);
        }
        return productoscategoria;
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }
    public void eliminarProducto(Producto producto) {
        listaProductos.remove(producto);
    }
    public void registrarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }
    public void eliminarCliente(Cliente cliente) {
        listaClientes.remove(cliente);
    }

}
