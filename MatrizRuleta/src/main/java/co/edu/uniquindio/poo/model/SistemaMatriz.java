package co.edu.uniquindio.poo.model;

public class SistemaMatriz {
    private Matriz matriz;


    public String crearMatriz(int filas, int columnas, int[][] datos) {
        matriz = new Matriz(filas, columnas);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz.agregarElemento(datos[i][j]);
            }
        }
        return "Matriz creada exitosamente.";
    }

    public String girarMatrizDerecha(int giros) {
        if (matriz != null) {
            matriz.girarDerecha(giros);
            return "Matriz girada " + giros + " veces a la derecha.";
        } else {
            return "No hay matriz creada aún.";
        }
    }

    public void mostrarMatriz() {
        if (matriz != null) {
            matriz.imprimirMatriz();
        } else {
            System.out.println("No hay matriz para mostrar.");
        }
    }
}
