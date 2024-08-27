package aufgaben.teams_aufgaben;

public class A26_Rechteck_Methode {

    public static void main(String[] args) {

        double a = 20.35;
        double b = 1234.124;

        System.out.printf("Area: %.4fcm²\nCircumference %.4fcm", area(a, b), circumference(a, b));

    }

    static double area(double a, double b) {
        return a * b;
    }

    static double circumference(double a, double b) {
        return a * 2 + b * 2;
    }

}
