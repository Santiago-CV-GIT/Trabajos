package co.edu.uniquindio.poo.model;

public class Apoyo extends Vehiculo {
    private Funcion funcion;
    public Apoyo(String id, String modelo, String fechaFabricacion, int kilometraje, EstadoOperativo estadoOperativo, Funcion funcion,int misiones) {
        super(id, modelo,fechaFabricacion, kilometraje, estadoOperativo,misiones);
        this.funcion = funcion;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion newFuncion) {
        this.funcion = newFuncion;
    }
}
