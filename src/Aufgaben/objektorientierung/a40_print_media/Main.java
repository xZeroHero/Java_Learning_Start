package aufgaben.objektorientierung.a40_print_media;

import aufgaben.objektorientierung.a39_Kunden.Adresse;

public class Main {

    public static void main(String[] args) {

        PrintMedia[] printMedia = new PrintMedia[5];

        Address mitpAdress = new Address("Augustinusstraße", "9a", "50226", "Frechen");
        Publisher mitp = new Publisher("mitp Verlags GmbH & Co. KG", mitpAdress);

        IdentificationNumber cleanCodeISBN = new IdentificationNumber("978-3826655487", "isbn");
        printMedia[0]/*Book cleanCode*/ = new Book("Clean Code", mitp, cleanCodeISBN, 39.45, "Robert C. Martin");

//        System.out.println(cleanCode);
        System.out.println(printMedia[0]);

        System.out.println("\n====================================\n");

        Address heiseAdress = new Address("Karl-Wiechert-Allee", "10", "30625", "Hannover");
        Publisher heise = new Publisher("heise", heiseAdress);
        IdentificationNumber ctISSN = new IdentificationNumber("0724-8679", "issn");

//        Magazin ct = new Magazin("ct Magazin für Computertechnik", heise, ctISSN, 4.90, 14);
        printMedia[1] = new Magazin("ct Magazin für Computertechnik", heise, ctISSN, 4.90, 14);

//        System.out.println(ct);
        System.out.println(printMedia[1]);

        System.out.println("\n====================================\n");

        Address tneuesAddress = new Address("", "", "12345", "");
        Publisher tneues = new Publisher("National Geographic", tneuesAddress);
        Dimensions nGeoDimension = new Dimensions(64.0, 48.0);

//        Calendar nGeographic = new Calendar("National Geographic \"Der Kalender 2019\"", tneues, 38.52, nGeoDimension);
        printMedia[2] = new Calendar("National Geographic \"Der Kalender 2019\"", tneues, 38.52, nGeoDimension);

//        System.out.println(nGeographic);
        System.out.println(printMedia[2]);

        System.out.println("\n====================================\n");

        Address spektrumAdresse = new Address("", "", "12345", "Heidelberg");
        Publisher spektrumDerWissenschaft = new Publisher("Spektrum der Wissenschaft Verlagsgesellschaft mbH", spektrumAdresse);
        IdentificationNumber spektrumISSN = new IdentificationNumber("0170-2971", "issn");

        Magazin spektrum = new Magazin("Spektrum", spektrumDerWissenschaft, spektrumISSN, 8.50, 14);
        printMedia[3] = new Magazin("Spektrum der Wissenschaft", spektrumDerWissenschaft, spektrumISSN, 8.50, 30);


        System.out.println(spektrum);
//        System.out.println(printMedia[3]);

//        printMedia[3].setLatestRelease(2024, 9, 15);
        spektrum.setLatestRelease(2024, 9, 15);
        System.out.println("Nächster Release: " + spektrum.getNextReleases());

        System.out.println("\n====================================\n");


        Address oReillyAdress = new Address("", "", "12345", "");
        Publisher oReilly = new Publisher("O'Reilly Verlag GmbH & Co. KG", oReillyAdress);
        IdentificationNumber wsProgrammierenISBN = new IdentificationNumber("978-3897215672", "isbn");
//        Book wsProgrammieren = new Book("Weniger schlecht programmieren", oReilly, wsProgrammierenISBN, 24.90, "Kathrin Passig");
        printMedia[4] = new Book("Weniger schlecht programmieren", oReilly, wsProgrammierenISBN, 24.90, "Kathrin Passig");

//        System.out.println(wsProgrammieren);
        System.out.println(printMedia[4]);

    }
}
