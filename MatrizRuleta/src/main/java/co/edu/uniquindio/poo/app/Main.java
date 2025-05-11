package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.SistemaMatriz;

public class Main {
    public static void main(String[] args) {
    SistemaMatriz sistema = new SistemaMatriz();

    int[][] datos = {
            {1, 2, 3},
            {4, 5, 6}
    };

    System.out.println(sistema.crearMatriz(2, 3, datos));


        System.out.println("Matriz original:");
        sistema.mostrarMatriz();

        sistema.girarMatrizDerecha(2);
        System.out.println("Matriz girada a la derecha:");
        sistema.mostrarMatriz();
    }
}

