import net.Calculadora.Basica.CalculadoraBasica;

public class Actividad1 {
    public static void main(String[] args) throws Exception {
        
        int sum = CalculadoraBasica.refactorizedSum(2, 5);
        System.out.println("El resultado de la suma es " + sum);

        int rest = CalculadoraBasica.refactorizedRest(5, 3);
        System.out.println("el resultado de la resta es " + rest);

        int multiply = CalculadoraBasica.refactorizedmultiply(2, 5);
        System.out.println("El resultado de la multiplicación es: " + multiply);

        double divide = CalculadoraBasica.refactorizedDivided(8, 3);
        System.out.println("El resultado de la división es: " + divide);

        System.out.println(CalculadoraBasica.sumOperators(2, 3)); //esta linea es un ejemplo
        CalculadoraBasica.showLastOperation();
    }
}
