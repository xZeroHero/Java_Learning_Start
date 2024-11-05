package aufgaben.objektorientierung.a42_ligaverwaltung;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ausgabe {

    public static void ausgabeTabelle(Mannschaft[] mannschaften){
        System.out.print("--- Tabelle ---\n");
        for (Mannschaft mannschaft : mannschaften){
            System.out.print(mannschaft);
        }

        System.out.println();
    }

    public static void ausgabeErgebnisse(Spiel[] spiele){
        System.out.print("--- Ergebnisse ---\n");
        for (Spiel spiel : spiele){
            System.out.print(spiel);
        }
        System.out.println();
    }

//    public static void ausgabeListeSpiele(ArrayList<Spiel> spiele){
//        System.out.print("--- Ergebnisse ---\n");
//        spiele.forEach(System.out::print);
//        System.out.println();
//    }
//
//    public static void ausgabeListeTabelle(ArrayList<Spiel> tabelle){
//        System.out.print("--- Tabelle ---\n");
//        tabelle.forEach(System.out::print);
//        System.out.println();
//    }




    public static void ausgabeListeSpiele(ArrayList<Spiel> spiele){
        System.out.print("--- Ergebnisse ---\n");
        for (Spiel spiel : spiele){
            System.out.print(spiel);
        }
        System.out.println();
    }

    public static void ausgabeListeTabelle(ArrayList<Mannschaft> tabelle){
        System.out.print("--- Tabelle ---\n");
        for ( Mannschaft mannschaft : tabelle){
            System.out.print(mannschaft);
        }

        System.out.println();
    }


}
