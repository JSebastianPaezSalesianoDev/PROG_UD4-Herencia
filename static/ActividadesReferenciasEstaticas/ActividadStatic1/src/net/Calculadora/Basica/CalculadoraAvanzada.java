package net.Calculadora.Basica;

public class CalculadoraAvanzada {

    private static String ultimaSalida;

    public static void MultiplicarHastaDiez(int numero) {
        ultimaSalida = "Se mostró la tabla de multiplicar para el número " + numero;
        for (int i = 0; i < 11; i++) {
            System.out.println("\n***********************\n"+numero + "x " + i + " = " + numero * i);
        }
    }

    public static int calcularFactorial(int numero) {
        if (numero < 0) {
            ultimaSalida = "Se intentó calcular el factorial de un número negativo";
            System.out.println("Ingrese un numero positivo.");
            return -1; // Devolver un valor inválido en caso de error
        }

        ultimaSalida = "Se calculó el factorial de " + numero;
        int factorial = 1;
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println( "\n**************\n" +factorial);
        return factorial;
    }

    public static boolean esPar(int numero) {
        ultimaSalida = "Se comprobó si el número " + numero + " era par";
        if ( numero % 2 == 0) {
            System.out.println("Es par");
            return true;
        }else{
            System.out.println("es impar");
        }
        return false;
    }

    public static void showUltimaSalida(){

        System.out.println(ultimaSalida);

    } 
}