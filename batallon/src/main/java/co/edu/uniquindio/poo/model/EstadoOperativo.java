package co.edu.uniquindio.poo.model;

public enum EstadoOperativo {
    DISPONIBLE(0),MISION(1),MANTENIMIENTO(2);

    private final int valor;
    EstadoOperativo(int valor){
        this.valor = valor;
    }
}
