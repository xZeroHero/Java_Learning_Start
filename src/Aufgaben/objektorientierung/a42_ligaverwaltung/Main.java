package aufgaben.objektorientierung.a42_ligaverwaltung;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Mannschaft[] mannschaften = new Mannschaft[3];

        mannschaften[0] = new Mannschaft("SV Hobbingen");
        mannschaften[1] = new Mannschaft("SC Gondor");
        mannschaften[2] = new Mannschaft("FC Mordor");

        Spiel[] spiele = new Spiel[5];

        spiele[0] = new Spiel(mannschaften[0], mannschaften[2], 6, 2);
        spiele[1] = new Spiel(mannschaften[2], mannschaften[0], 1, 3);
        spiele[2] = new Spiel(mannschaften[1], mannschaften[0], 2, 2);
        spiele[3] = new Spiel(mannschaften[1], mannschaften[2], 4, 3);
        spiele[4] = new Spiel(mannschaften[2], mannschaften[1], 1, 1);


//        Ausgabe.ausgabeErgebnisse(spiele);
//        Ausgabe.ausgabeTabelle(mannschaften);

        Liga liga = new Liga(mannschaften, spiele);
        System.out.println(liga);

        Ausgabe.ausgabeListeSpiele(liga.getSpiele());
        Ausgabe.ausgabeListeTabelle(liga.getTabelle());



    }
}
