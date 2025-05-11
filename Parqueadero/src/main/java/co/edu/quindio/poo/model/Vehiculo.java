package co.edu.quindio.poo.model;


public class Vehiculo {
    private final String placa;
    private final String marca;
    private final String modelo;
    private final String tipo; // carro, moto, etc.
    private final String propietario;

    public Vehiculo(String placa, String marca, String modelo, String tipo, String propietario) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPropietario() {
        return propietario;
    }
}

