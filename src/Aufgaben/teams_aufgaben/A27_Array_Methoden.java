package aufgaben.teams_aufgaben;

public class A27_Array_Methoden {

    public static void main(String[] args) {

        double[] array = {1, 2, 3, 4, 5};
        System.out.printf("1. Summe: %.4f\n", sum(array));
        System.out.printf("1. Kleinster Wert: %.4f\n", smallestValue(array));
        System.out.printf("1. Größter Wert: %.4f\n", highestValue(array));
        System.out.printf("1. Mittelwert: %.4f\n", average(array));
        System.out.printf("1. Anzahl der Werte: %d\n", numberOfValues(array));

    }

    static double sum(double[] array) {
        double sum = 0.0;
        for (double number : array) {
            sum += number;
        }

        return sum;
    }

    static double smallestValue(double[] array) {
        double smallestValue = array[0];
        for (double number : array) {
            if (number < smallestValue) {
                smallestValue = number;
            }
        }
        return smallestValue;
    }


    static double highestValue(double[] array) {
        double highestValue = array[0];
        for (double number : array) {
            if (number > highestValue) {
                highestValue = number;
            }
        }
        return highestValue;
    }


    static double average(double[] array) {

        return sum(array) / array.length;
    }

    static int numberOfValues(double[] array) {

        return array.length;
    }

}
