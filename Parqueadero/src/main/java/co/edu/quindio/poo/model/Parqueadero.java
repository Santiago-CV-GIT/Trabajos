package co.edu.quindio.poo.model;
import java.util.ArrayList;


public class Parqueadero {
    private String nombre;
    private ArrayList<Vehiculo> listavehiculos;

    public Parqueadero(String nombre){
        this.nombre = nombre;
        this.listavehiculos = new ArrayList<>();
    }
    public ArrayList<Vehiculo> obtenerVehiculosOrdenadosPorPlaca() {
        ArrayList<Vehiculo> listaOrdenada = new ArrayList<>(listavehiculos); // Copiar lista original
        int n = listaOrdenada.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Vehiculo v1 = listaOrdenada.get(j);
                Vehiculo v2 = listaOrdenada.get(j + 1);

                int placa1 = Integer.parseInt(v1.getPlaca());
                int placa2 = Integer.parseInt(v2.getPlaca());

                if (placa1 > placa2) {
                    listaOrdenada.set(j, v2);
                    listaOrdenada.set(j + 1, v1);
                }
            }
        }

        return listaOrdenada;
    }
    public void agregarVehiculo(Vehiculo vehiculo) {
        listavehiculos.add(vehiculo);
    }
    public void imprimirVehiculosOrdenados() {
        ArrayList<Vehiculo> vehiculosOrdenados = obtenerVehiculosOrdenadosPorPlaca();
        System.out.println("Vehículos ordenados por placa:");

        for (Vehiculo v : vehiculosOrdenados) {
            System.out.println("Placa: " + v.getPlaca() + ", Marca: " + v.getMarca() + ", Modelo: " + v.getModelo() + ", Propietario: " + v.getPropietario());
        }
    }

}
