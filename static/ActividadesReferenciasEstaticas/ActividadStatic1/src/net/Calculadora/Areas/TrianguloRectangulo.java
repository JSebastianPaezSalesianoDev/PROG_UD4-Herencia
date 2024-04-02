package net.Calculadora.Areas;

public class TrianguloRectangulo {
    private static float base;
    private static float height;

    public TrianguloRectangulo(float base, float height){

        TrianguloRectangulo.base = base;
        TrianguloRectangulo.height = height;

    }

    public static float getBase() {
        return base;
    }

    public static void setBase(float base) {
        TrianguloRectangulo.base = base;
    }

    public static float getHeight() {
        return height;
    }

    public static void setHeight(float height) {
        TrianguloRectangulo.height = height;
    }

  
}
