package aufgaben.teams_aufgaben;
import java.lang.Math;
import javax.swing.JOptionPane;

public class A03_Kraftstoffverbrauch {
    public static void main(String[] args) {

        double km = Double.parseDouble(JOptionPane.showInputDialog("Wie viele Kilometer sind Sie gefahren?: "));
        double liter = Double.parseDouble(JOptionPane.showInputDialog("Wie viel Liter Kraftstoff wurde verbraucht?: "));

        JOptionPane.showMessageDialog(null, STR."Sie haben \{fuelConsumption(km, liter)} L/100km verbraucht");


/*        System.out.println(STR."Kilometer gefahren= 200km, Kraftstoff verbraucht: 35L\nDurchschnittlicher Verbrauch: \{uelConsumption(200, 35)}L/km");
        System.out.println("_____________________________");
        System.out.println(STR."Kilometer gefahren= 180km, Kraftstoff verbraucht: 3L\nDurchschnittlicher Verbrauch: \{fuelConsumption(180, 3)}L/km");
        System.out.println("_____________________________");
        System.out.println(STR."Kilometer gefahren= 22300km, Kraftstoff verbraucht: 34.5L\nDurchschnittlicher Verbrauch: \{uelConsumption(22300, 34.5)}L/km");
        System.out.println("_____________________________");
        System.out.println(STR."Kilometer gefahren= 500km, Kraftstoff verbraucht: 12.45L\nDurchschnittlicher Verbrauch: \{fuelConsumption(500, 12.45)}L/km");*/


    }
    public static double fuelConsumption(double km, double liter){

        // Math.round(num *1000) / 1000 rundet auf 3 Nachkommastellen
        return (double) Math.round(((liter / km)*100) * 1000) / 1000;
    }
}