package co.edu.quindio.poo.app;

import java.util.ArrayList;
import co.edu.quindio.poo.*;
import co.edu.quindio.poo.model.Circulo;
import co.edu.quindio.poo.model.Cuadrado;
import co.edu.quindio.poo.model.Figura;
import co.edu.quindio.poo.model.TrianguloEquilatero;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Circulo(5.0));
        figuras.add(new Cuadrado(4.0));
        figuras.add(new TrianguloEquilatero(6.0));

        for (Figura figura : figuras) {
            System.out.println("Figura: " + figura.getClass().getSimpleName());
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println();
        }
    }
}
