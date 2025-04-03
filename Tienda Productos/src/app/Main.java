package app;
import model.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ParseException {
        Tienda tienda = new Tienda("TechStore");

        // Registrar cliente
        Cliente cliente = new Cliente("María Gómez", "87654321", "Calle 10", "555-1111", "maria@email.com");
        tienda.registrarCliente(cliente);

        // Agregar productos
        Producto laptop = new Producto("Laptop", "LP100", 1200.0F, "Tecnología", 10);
        tienda.agregarProducto(laptop);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaVenta = sdf.parse("20/10/2025");

        // Realizar venta
        Venta venta = new Venta(fechaVenta);
        venta.agregarProducto(laptop, 1);

        DetalleVenta detalleVenta= new DetalleVenta(laptop,1,2000);

        // Consultar ventas del cliente
        // Consultar ventas del cliente
        System.out.println("Ventas de " + cliente.getNombres() + ":");
        for(Venta v : cliente.getListaVentas()) {
            System.out.println("Fecha: " + sdf.format(v.getFecha()));
            System.out.println("Detalles:");

            for(DetalleVenta d : v.getListaDetalleVentas()) {
                System.out.println("- Producto: " + d.getProducto().getNombreProducto() +
                        ", Cantidad: " + d.getCantidad() +
                        ", Subtotal: $" + d.getSubtotal());
            }
            System.out.println("Total Venta: $" + v.getListaDetalleVentas() + "\n");
        }

    }
}