package Aufgaben.Sequenzen;
import java.util.Scanner;

public class A02_Rechteck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Länge der Seite a in cm:");
        double a = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Länge der Seite b in cm:");
        double b = scanner.nextDouble();


        System.out.println(STR."Seitenlängen: a = \{a}, b = \{b}\nUmfang ist: \{circumferenceRectangle(a, b)}cm \nFläche ist: \{areaRectangle(a, b)}cm²");


        /*System.out.println(STR."Seitenlängen: a = 35, b = 23\nUmfang ist: \{circumferenceRectangle(35, 23)}cm \nFläche ist: \{areaRectangle(35, 23)}cm²");
        System.out.println(STR."Seitenlängen: a = 15.34, b = 34\nUmfang ist: \{circumferenceRectangle(15.34, 34)}cm \nFläche ist: \{areaRectangle(15.34, 34)}cm²");
        System.out.println(STR."Seitenlängen: a = 1234.56, b = 23.13\nUmfang ist: \{circumferenceRectangle(1234.56, 23.13)}cm \nFläche ist: \{areaRectangle(1234.56, 23.13)}cm²");*/



    }

    public static double circumferenceRectangle(double a, double b){
        return a*2 + b*2;
    }
    public static double areaRectangle(double a, double b){
        return a*b;
    }

}
