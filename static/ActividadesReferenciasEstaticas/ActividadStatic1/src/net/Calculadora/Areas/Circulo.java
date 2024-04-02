package net.Calculadora.Areas;

public class Circulo {

    private static float radio;

    public Circulo( float radio){

        Circulo.radio = radio;

    }

    public static float getRadio() {
        return radio;
    }

    public static void setRadio(float radio) {
        Circulo.radio = radio;
    }
}
