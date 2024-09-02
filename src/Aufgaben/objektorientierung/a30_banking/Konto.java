package aufgaben.objektorientierung.a30_banking;


import java.util.Scanner;

public class Konto {

    Scanner scanner = new Scanner(System.in);
    private boolean kontoInitialised = false;
    private String vornameKontoinhaber = "";
    private String nachnameKontoinhaber = "";
    private double balance = 0.0; // EUR
    private final double minBalance = 3.5; //EUR

    public void kontoEroeffnung() {
        if (!kontoInitialised) {
            System.out.println("Vorname: ");
            this.vornameKontoinhaber = scanner.nextLine();
            System.out.println("Nachname: ");
            this.nachnameKontoinhaber = scanner.nextLine();
            System.out.println("Wie viel Geld wollen Sie einzahlen? (Mindestens 50€ bei Kontoeröffnung)");
            double einzahlung = scanner.nextDouble();
            scanner.nextLine();

            while (einzahlung < 50.0) {
                System.out.println("Bitte zahlen Sie einen Betrag über 50€ ein:");
                einzahlung = scanner.nextDouble();
                scanner.nextLine();
            }
            balance += einzahlung;
            kontoInitialised = true;
        } else {
            System.out.println("Konto ist bereits eingerichtet");
        }
    }


    public double getBalance() {
        System.out.printf("Ihr aktueller Kontostand beträgt %.2f €\n", balance);
        return balance;

    }

    public void einzahlung(double euro) {
        if (euro > 0) {
            this.balance += euro;
        }
    }


    public double auszahlung(double euro) {

        double auszahlung = 0.0;
        if (euro <= balance - minBalance) {
            auszahlung = euro;
            balance -= euro;
        } else {
            System.out.printf("Es ist nicht genug Geld auf dem Konto vorhanden.(Mindestens 3,50€)\n");
        }
        return auszahlung;

    }


    public String getName() {
        return STR."\{vornameKontoinhaber} \{nachnameKontoinhaber}";
    }


    public boolean isKontoInitialised() {
        return kontoInitialised;
    }


    public double deleteKonto() {

        System.out.println("Bitte geben Sie zur Sicherheit Ihren Namen ein (Vorname Nachname):");
        String fullName = vornameKontoinhaber + " " + nachnameKontoinhaber;
        String abfrage = scanner.nextLine();

        double restwert = 0.0;

        if (fullName.equals(abfrage)) {
            boolean kontoInitialised = false;
            String vornameKontoinhaber = "";
            String nachnameKontoinhaber = "";
            restwert = balance;
            double balance = 0.0; // EUR
            System.out.println("Konto wurde erfolgreich gelöscht!");
        } else {
            System.out.println("Der Name stimmt nicht überein. Der Vorgang wird abgebrochen");
        }
        return restwert;
    }

    public double coinflip(double wettbetrag) {
        System.out.println("Wählen Sie Kopf oder Zahl?");
        System.out.println("Kopf = 0, Zahl = 1");
        int wette = scanner.nextInt();
        scanner.nextLine();
        int ergebnis = (int) Math.round(Math.random());
        double gewinn = 0.0;
        if (ergebnis == wette) {
            System.out.println("Gewonnen!");
            gewinn = wettbetrag * 2;
            System.out.printf("Sie haben %.2f€ gewonnen\n", gewinn);
        } else {
            System.out.println("Verloren!");
            gewinn -= wettbetrag;
            System.out.printf("Sie haben %.2f€ verloren\n", gewinn);
        }
        return gewinn;

    }


}
