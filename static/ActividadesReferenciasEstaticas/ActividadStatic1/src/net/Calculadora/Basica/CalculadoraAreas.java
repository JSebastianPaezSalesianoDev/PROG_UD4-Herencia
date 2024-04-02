package net.Calculadora.Basica;

import net.Calculadora.Areas.Circulo;
import net.Calculadora.Areas.Rectangulo;
import net.Calculadora.Areas.TrianguloRectangulo;

public class CalculadoraAreas {

    public static double calcularArea(Rectangulo rectangulo) {

        return Rectangulo.getBase() * Rectangulo.getHeight();
    }

    public static double calcularArea(TrianguloRectangulo triangulo) {
        return (TrianguloRectangulo.getBase() * TrianguloRectangulo.getHeight()) / 2;
    }

    public static double calcularArea(Circulo circulo) {
        return Math.PI * Math.pow(Circulo.getRadio(), 2);
    }
}
        