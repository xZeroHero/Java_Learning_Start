package basics;
import java.lang.Math;

public class Pythagoras {
    public static void main(String[] args) {

        System.out.printf("a = 2, b = 6, c = %.3f %.3f\n", pythagoras(2, 6), pythagoras(8 , 3));
        System.out.printf("a = 6, b = 9, c = %.3f\n", pythagoras(6, 9));
        System.out.printf("a = 23, b = 65, c = %.3f\n", pythagoras(23, 65));
        System.out.printf("a = 22, b = 63, c = %.3f\n", pythagoras(22, 63));
        System.out.printf("a = 14, b = 13, c = %.3f\n", pythagoras(14, 13));

    }

    public static double pythagoras(double a, double b) {
        return(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
}
