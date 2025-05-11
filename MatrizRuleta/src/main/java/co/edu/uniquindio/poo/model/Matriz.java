package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Matriz {
    private final ArrayList<Elemento> elementos;
    private final int filas;
    private final int columnas;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.elementos = new ArrayList<>(filas * columnas);
    }

    public void agregarElemento(int valor) {
        elementos.add(new Elemento(valor));
    }

    public void girarDerecha(int giros) {
        if (elementos.isEmpty()) return;

        int total = elementos.size();
        giros = giros % total;

        if (giros == 0) return;

        ArrayList<Elemento> nuevaLista = new ArrayList<>(total);


        for (int i = total - giros; i < total; i++) {
            nuevaLista.add(elementos.get(i));
        }


        for (int i = 0; i < total - giros; i++) {
            nuevaLista.add(elementos.get(i));
        }


        elementos.clear();
        elementos.addAll(nuevaLista);
    }

    public void imprimirMatriz() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int posicion = i * columnas + j;
                System.out.print(elementos.get(posicion).getValor() + " ");
            }
            System.out.println();
        }
    }
}

