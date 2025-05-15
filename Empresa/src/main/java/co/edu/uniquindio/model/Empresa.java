package co.edu.uniquindio.model;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Electrodomestico>listaElectrodomesticos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.listaElectrodomesticos=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Electrodomestico> getListaElectrodomesticos() {
        return listaElectrodomesticos;
    }

}
