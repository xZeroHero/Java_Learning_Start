package aufgaben.teams_aufgaben;
import javax.swing.JOptionPane;

public class A08_Provision {

    public static void main(String[] args) {

        double umsatz = Double.parseDouble(JOptionPane.showInputDialog("Umsatz in EUR: "));
        if (umsatz <= 0){
            JOptionPane.showMessageDialog(null, STR."Der Umsatz muss mehr als 0 EUR sein");
        }
        else{
            JOptionPane.showMessageDialog(null, STR."Umsatz: \{String.format("%,.2f €", umsatz)}\nProvision: \{String.format("%,.2f €", provision(umsatz)[0])}\nProvisionssatz: \{String.format("%,.2f%%", provision(umsatz)[1])}");
        }
    }

    public static double[] provision(double umsatz){
        /**
         * Ausgabe:
         * provision[0] = Provision in EUR
         * provision[1] = Provisionssatz
         * */

        double[] provision = new double[2];

        if (umsatz > 0 && umsatz < 300_000){
            provision[0] = umsatz * 0.03;
            provision[1] = 3;
        }
        else {
            if (umsatz < 350_000){
                provision[0] = umsatz * 0.06;
                provision[1] = 6;

                // Reduntant, weil vor der Abfrage schon geprüft wird ob umsatz > 0.
                /*if (umsatz <= 0){
                    provision[0] = 0;
                    provision[1] = 0;
                }*/
            }
            else {
                provision[0] = umsatz * 0.1;
                provision[1] = 10;
            }
        }

        return provision;
    }

}
