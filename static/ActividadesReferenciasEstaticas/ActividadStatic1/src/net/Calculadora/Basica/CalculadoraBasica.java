package net.Calculadora.Basica;

public class CalculadoraBasica {

    private static int firstOperator;
    private static int secondOperator;
    private static String operation;
    private static double result;

    public static int sumOperators(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int restOperators(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int multiplyOperator(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divideOperators(int firstNumber, int secondNumber) {

        int higher = Math.max(firstNumber, secondNumber);
        int lower = Math.min(firstNumber, secondNumber);

        return (double) higher / lower;

        //  return num1 > num ? (num1 / num2) :
    }

    public static void showLastOperation() {
        System.out.println(
                "Última operación: " + firstOperator + " " + operation + " " + secondOperator + " = " + result);
    }

    public static int refactorizedSum(int firstNumber, int secondNumber) {
        firstOperator = firstNumber;
        secondOperator = secondNumber;
        operation = "+";
        result = firstNumber + secondNumber;
        return (int) result;
    }

    public static int refactorizedRest(int firstNumber, int secondNumber) {
        firstOperator = firstNumber;
        secondOperator = secondNumber;
        operation = "-";
        result = firstNumber - secondNumber;
        return (int) result;
    }

    public static int refactorizedmultiply(int firstNumber, int secondNumber) {
        firstOperator = firstNumber;
        secondOperator = secondNumber;
        operation = "*";
        result = firstNumber * secondNumber;
        return (int) result;
    }

    public static double refactorizedDivided(int firstNumber, int secondNumber) {
        firstOperator = firstNumber;
        secondOperator = secondNumber;
        operation = "/";
        float higher = Math.max(firstNumber, secondNumber);
        float lower = Math.min(firstNumber, secondNumber);
        result = higher / lower;
        return result;
    }
}
