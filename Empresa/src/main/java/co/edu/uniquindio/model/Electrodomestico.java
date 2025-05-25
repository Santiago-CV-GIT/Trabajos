package co.edu.uniquindio.model;

public abstract class Electrodomestico {
    protected String nombre;
    protected Boolean estado;
    protected float consumoenergetico;

    public Electrodomestico(String nombre, Boolean estado, float consumoenergetico) {
        this.nombre=nombre;
        this.estado=estado;
        this.consumoenergetico=consumoenergetico;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public Boolean getEstado(){
        return estado;
    }
    public void setEstado(Boolean estado){
        this.estado=estado;
    }
    public float getConsumoenergetico(){
        return consumoenergetico;
    }

    public abstract Boolean ApagaroEncender();

}

