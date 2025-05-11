package co.edu.quindio.poo.app;


import co.edu.quindio.poo.model.Parqueadero;
import co.edu.quindio.poo.model.Vehiculo;



public class Main {
    public static void main(String[] args) {
        // Crear un parqueadero
        Parqueadero parqueadero = new Parqueadero("Parqueadero Central");

        // Agregar vehículos al parqueadero
        parqueadero.agregarVehiculo(new Vehiculo("300", "Chevrolet", "Spark", "Carro", "Juan"));
        parqueadero.agregarVehiculo(new Vehiculo("100", "Toyota", "Corolla", "Carro", "Ana"));
        parqueadero.agregarVehiculo(new Vehiculo("200", "Mazda", "3", "Carro", "Luis"));

        // Imprimir los vehículos ordenados por placa
        System.out.println("Imprimiendo vehículos ordenados por placa:");
        parqueadero.imprimirVehiculosOrdenados();
    }
}


