package co.edu.uniquindio.poo.model;

public class Soldado {
    private String id;
    private String rango;
    private String nombre;
    private String apellido;
    private int edad;

    public Soldado(String id, String rango, String nombre, String apellido, int edad) {
        this.id = id;
        this.rango = rango;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String newId) {
        this.id = newId;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String newRango) {
        this.rango = newRango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String newApellido) {
        this.apellido = newApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int newEdad) {
        this.edad = newEdad;
    }

    @Override
    public String toString() {
        return "Soldado{" +
                "id='" + id + '\'' +
                ", rango='" + rango + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}



