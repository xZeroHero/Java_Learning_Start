package basics.sammlungen.linked_list;

import basics.CompareUmfang;

import java.util.*;

public class LinkedLists {

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>();

        zahlen.add(2);
        zahlen.add(4);
        zahlen.add(1);
        zahlen.add(9);
        zahlen.add(3);

        System.out.println(zahlen);

        Collections.sort(zahlen);
        System.out.println(zahlen);


        /*    Sortierung von Zeichenketten */
        List<String> namen = new ArrayList<>();
        namen.add("Frodo");
        namen.add("Legolas");
        namen.add("Boromir");
        namen.add("Aragorn");
        namen.add("Äragorn");
        namen.add("Gimli");
        namen.add("gimli");
        namen.add("Sam");
        System.out.println(namen);
        Collections.sort(namen);
        System.out.println(namen);




        List<Rechteck> ecken = new ArrayList<>();
        ecken.add(new Rechteck(2,5));
        ecken.add(new Rechteck(4,6));
        ecken.add(new Rechteck(5,2));
        ecken.add(new Rechteck(8,5));
        ecken.add(new Rechteck(3,7));

        System.out.println(ecken);
        Collections.sort(ecken);
        System.out.println(ecken);
        //Collections.sort(ecken,new CompareUmfang().reversed());
        Collections.sort(ecken,new CompareUmfang());
        System.out.println(ecken);


    }

}
