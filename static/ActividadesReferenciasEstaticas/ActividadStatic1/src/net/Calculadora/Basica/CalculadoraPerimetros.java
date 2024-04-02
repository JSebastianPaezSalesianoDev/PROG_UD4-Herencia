package net.Calculadora.Basica;

import net.Calculadora.Areas.Circulo;
import net.Calculadora.Areas.Rectangulo;
import net.Calculadora.Areas.TrianguloRectangulo;

public class CalculadoraPerimetros {

    public static double calcularPerimetro(Rectangulo rectangulo) {

        return 2 * (Rectangulo.getBase() + Rectangulo.getHeight());
    }

    public static double calcularPerimetro(TrianguloRectangulo triangulo){
        return Math.sqrt(Math.pow(TrianguloRectangulo.getBase(), 2) + Math.pow(TrianguloRectangulo.getHeight(), 2));
    }

    public static double calcularPerimetro(Circulo circulo){
        return 2 * Math.PI * Circulo.getRadio();
    }
}
