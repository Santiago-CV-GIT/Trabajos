package co.edu.uniquindio.poo.model;

public class Vehiculo {
    public String id;
    public String modelo;
    public String fechaFabricacion;
    public int kilometraje;
    public EstadoOperativo estadoOperativo;


    public Vehiculo(String id, String modelo, String fechaFabricacion, int kilometraje, EstadoOperativo estadoOperativo) {
        this.id = id;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        this.kilometraje = kilometraje;
        this.estadoOperativo = estadoOperativo;
    }

    public String getId() {
        return id;
    }

    public void setId(String newId) {
        this.id = newId;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String newModelo) {
        this.modelo = newModelo;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String newFechaFabricacion) {
        this.fechaFabricacion = newFechaFabricacion;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int newKilometraje) {
        this.kilometraje = newKilometraje;
    }

    public EstadoOperativo getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(EstadoOperativo newEstadoOperativo) {
        this.estadoOperativo = newEstadoOperativo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaFabricacion='" + fechaFabricacion + '\'' +
                ", kilometraje=" + kilometraje +
                ", estadoOperativo=" + estadoOperativo +
                '}';
    }
}
