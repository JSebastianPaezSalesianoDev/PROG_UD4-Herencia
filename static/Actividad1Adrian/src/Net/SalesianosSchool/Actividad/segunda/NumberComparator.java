package Net.SalesianosSchool.Actividad.segunda;

public class NumberComparator {

    public static int getBigger(int numberOne, int numberTwo) {
        boolean isFirstBigger = numberOne > numberTwo;
        return isFirstBigger ? numberOne : numberTwo;
    }

    public static boolean areEquals(int numberOne, int numberTwo) {
        return numberOne == numberTwo ? true : false;
    }

    public static int getMinimum(int[] numbersArray) {

       /*  if (numbersArray == null || numbersArray.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        } */

        int minimum = numbersArray[0];
        for (int i = 1; i < numbersArray.length; i++) {
            if (numbersArray[i] < minimum) {
                minimum = numbersArray[i];
            }
        }
        return minimum;
    }

    public static boolean isNegative(int number) {
        if (number < 0) {
            return true;
        }else{
            return false;
        }
    }
}
