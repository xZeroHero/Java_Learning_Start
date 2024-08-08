package Aufgaben.Sequenzen;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class A06_OlivenoelTank {

    public static void main(String[] args) {

        //CommandLine Eingabe der Füllmenge

        /*Scanner input = new Scanner(System.in);
        System.out.println("Füllhöhe des Tanks in mm: ");
        int fillHeight = input.nextInt();
        double[] fuellMengen = tankFuellmenge(fillHeight);
        System.out.println(STR."Es befinden sich \{String.format("%,.3f", (fuellMengen[0]))} Liter Olivenöl im Tank\nEs befinden sich \{String.format("%,.3f", (fuellMengen[1]))} Kg Olivenöl im Tank");*/


        // GUI zur Eingabe der Füllmenge

        int fillHeight = Integer.parseInt(JOptionPane.showInputDialog("Füllhöhe des Tanks in mm: "));
        double[] fuellMengen = tankFuellmenge(fillHeight);
        JOptionPane.showMessageDialog(null, STR."Es befinden sich \{String.format("%,.3f", (fuellMengen[0]))} Liter Olivenöl im Tank\nEs befinden sich \{String.format("%,.3f", (fuellMengen[1]))} Kg Olivenöl im Tank");


        // Manuelle Eingabe der Füllhöhe
        /*System.out.println(Arrays.toString(tankFuellmenge(2400)));
        System.out.println(Arrays.toString(cheatyBerechnung(2400)));*/
    }

    public static double[] tankFuellmenge(int fillHeight){
        /**
         * Eingabe:
         * fillHeight: Füllhöhe in Millimeter
         * _____________________________________
         * Ausgabe:
         * Array[Menge in Liter, Menge in Kg]
         * */


        // Tank Durchmesser in mm
        final double TANK_DIAMETER = 2500;
        final double TANK_RADIUS =  TANK_DIAMETER / 2;

        // Kubikmillimeter in einem Liter
        final double LITER_PER_CUBICMILLIMETER = 0.000001;

        // Dichte in g/mm³
        final double DENSITY = 0.00091;


        // Volumen vom Inhalt des Zylinders in mm
        double volumeInCubicMM = Math.pow(TANK_RADIUS, 2) * Math.PI * fillHeight;


        // Für gerundete Ausgabe
        /*double inhaltInLiter = (double) Math.round((volumeInCubicMM * LITER_PER_CUBICMILLIMETER) * 10000) / 10000;
        double inhaltInKG = (double) Math.round(((volumeInCubicMM * DENSITY) / 1000) *10000) / 10000;*/

        double inhaltInLiter = volumeInCubicMM * LITER_PER_CUBICMILLIMETER;
        double inhaltInKG = (volumeInCubicMM * DENSITY) / 1000;


        return new double[]{inhaltInLiter, inhaltInKG};

    }



    public static double[] cheatyBerechnung(int fillHeight){

        // Werte aus der Beispielrechnung
        final double LITERS_PER_MM = 11780.963 / 2400;
        final double KG_PER_MM = 10720.676 / 2400;

        return new double[]{LITERS_PER_MM * fillHeight, KG_PER_MM * fillHeight};

    }
}
