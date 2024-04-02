package net.calculadorassalesianasca.operaciones;

public class SumarElevadosN {

    public static int sumarCuadradosHastaN(int n) {
        int suma = 0;

        if (n < 0) {
            System.out.println("Por favor ingresa un número positivo");
        } else {
            for (int i = 1; i <= n; i++) {
                int cuadrado = i * i;
                suma += cuadrado; 
            }
        }
        return suma; // 
    }

    public static float calcularMediaNota(float[] numeroEnteros) {
        float suma = 0;

        for (int i = 0; i < numeroEnteros.length; i++) { 
            suma += numeroEnteros[i]; 
        }
      
        return suma / numeroEnteros.length; 
    }
}
