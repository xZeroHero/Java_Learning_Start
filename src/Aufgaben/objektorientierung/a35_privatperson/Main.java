package aufgaben.objektorientierung.a35_privatperson;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        boolean hasValues = true;
        Kundendaten maxMustermann = null;

        try {
            Person max = new Person("Max", "Mustermann", "01.01.2000");
            Anschrift rechnungsadresseMax = new Anschrift("Landweg", "22c", "27777", "Ganderkesee");
            Anschrift lieferadresseMax = new Anschrift("Landweg", "22c", "27777", "Ganderkesee");
            Bankdaten bankdatenMax = new Bankdaten("DE35500705178478639488", "AAAABB11222");
            maxMustermann = new Kundendaten(max, rechnungsadresseMax, lieferadresseMax, bankdatenMax);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            hasValues = false;
        }

        if (hasValues) System.out.println(maxMustermann);



    }

}
