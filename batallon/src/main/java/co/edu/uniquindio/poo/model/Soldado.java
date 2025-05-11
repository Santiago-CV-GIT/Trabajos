package co.edu.uniquindio.poo.model;


import java.util.ArrayList;
import java.util.List;

public record Soldado(String id, String rango, String nombre, String apellido,
                      int edad, List<Mision> ListaMisiones) {



    public String getId() {
        return id;
    }

    public String getRango() {
        return rango;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }



}
