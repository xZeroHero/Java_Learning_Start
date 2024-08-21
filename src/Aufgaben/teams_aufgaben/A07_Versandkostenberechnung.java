package aufgaben.teams_aufgaben;
import java.util.Scanner;

public class A07_Versandkostenberechnung {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Gewicht des Pakets in kg (max. 20 kg): ");
        double weight = input.nextDouble();
        if (versandkosten(weight) != 0){
            System.out.println(STR."Versandkosten für das \{weight}kg schwere Paket: \{String.format("%,.2f", (versandkosten(weight)))}");
        }
        else {
            System.out.println("Keine gültige Paketgröße. Es können nur Pakete verschickt werden, die zwischen 0.1kg und 20kg liegen.");
        }


    }


    public static double versandkosten(double weight) {
        double range10_20 = 14.00; //EUR
        double range5_10 = 10.50; //EUR
        double range0_5 = 7.00; //EUR

        if (weight <= 0){
            return 0;
        }
        if (weight <= 5){
            return range0_5;
        }
        if (weight <= 10){
            return range5_10;
        }
        if (weight <= 20){
            return range10_20;
        }
        return 0;

    }

}
