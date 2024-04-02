package net.Calculadora.Areas;

public class Rectangulo {
    private static float base;
    private static float height;

    public Rectangulo(float base, float height){

        Rectangulo.base = base;
        Rectangulo.height = height;

    }

    public static float getBase() {
        return base;
    }

    public static void setBase(float base) {
        Rectangulo.base = base;
    }

    public static float getHeight() {
        return height;
    }

    public static void setHeight(float height) {
        Rectangulo.height = height;
    }
}
