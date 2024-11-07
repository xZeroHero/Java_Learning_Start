package aufgaben.objektorientierung.a43_gaststaette;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Mitarbeiter> mitarbeiterList = new LinkedList<>();

        mitarbeiterList.add(new Mitarbeiter("Marco Marc", 3500));
        mitarbeiterList.add(new Mitarbeiter("Hans Hermann", 4000));
        mitarbeiterList.add(new Mitarbeiter("Lisa Liebherz", 3700));


        List<Lebensmittel> speisen = new LinkedList<>();

        speisen.add(new Speise("Lasagne", 15.90, false));
        speisen.add(new Speise("Pizza Salami", 12.50, false));
        speisen.add(new Speise("Pizza Vegetaria", 11.90, true));


        List<Lebensmittel> getraenke = new LinkedList<>();

        getraenke.add(new Getraenk("Coca Cola", 2.90, true));
        getraenke.add(new Getraenk("Fanta", 2.90, true));
        getraenke.add(new Getraenk("Pils", 4.00, false));

        Speisekarte speisekarte = new Speisekarte(speisen, getraenke);


        List<Gast> gaesteList = new LinkedList<>();
        gaesteList.add(new Gast("Frank Friedrich"));
        gaesteList.add(new Gast("Hannelore Heinrichs", (Speise) speisen.get(2)));
        gaesteList.add(new Gast("Bernd Buchholz", (Speise) speisen.get(0)));

        List<Oeffnungszeit> oeffnungszeiten = new ArrayList<>();
        oeffnungszeiten.add(new Oeffnungszeit("Montag", "Ruhetag"));
        oeffnungszeiten.add(new Oeffnungszeit("Dienstag", "17:00 - 23:00"));
        oeffnungszeiten.add(new Oeffnungszeit("Mittwoch", "17:00 - 23:00"));
        oeffnungszeiten.add(new Oeffnungszeit("Donnerstag", "17:00 - 23:00"));
        oeffnungszeiten.add(new Oeffnungszeit("Freitag", "17:00 - 23:00"));
        oeffnungszeiten.add(new Oeffnungszeit("Samstag", "17:00 - 00:00"));
        oeffnungszeiten.add(new Oeffnungszeit("Sonntag", "14:00 - 23:00"));


        Gaststaette gaststaette = new Gaststaette("Gaststätte zum Hof",mitarbeiterList, gaesteList, speisekarte, oeffnungszeiten);


        System.out.println("test2");
        System.out.println(gaststaette);


    }

}
