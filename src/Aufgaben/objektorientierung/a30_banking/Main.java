package aufgaben.objektorientierung.a30_banking;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double bargeld = Math.round(Math.random() * 1000 + 300);
        ; //EUR

        Konto konto = new Konto();

        boolean fortfahren = true;
        Scanner scanner = new Scanner(System.in);

        while (fortfahren) {

            if (konto.isKontoInitialised()) {
                System.out.printf("Hallo %s\n", konto.getName());
                System.out.printf("Sie haben %.2f€ an Bargeld\n", bargeld);
                System.out.println("Bitte wählen Sie eine Option aus (Schreiben Sie die Nummer der Option in die Konsole):");
                System.out.println("1. Kontostand abfragen");
                System.out.println("2. Geld abheben");
                System.out.println("3. Geld einzahlen");
                System.out.println("4. Coin flip");
                System.out.println("5. Konto löschen");
                System.out.println("6. Verlassen");
                int input = scanner.nextInt();

                switch (input) {
                    case 1:
                        konto.getBalance();
                        break;
                    case 2:
                        System.out.println("Wie viel Geld wollen Sie abheben?");
                        double auszahlen = scanner.nextDouble();
                        double ausgezahlt = konto.auszahlung(auszahlen);
                        bargeld += ausgezahlt;
                        System.out.printf("Es wurden %.2f ausgezahlt.\n", ausgezahlt);
                        konto.getBalance();
                        break;
                    case 3:
                        System.out.println("Wie viel Geld wollen Sie einzahlen?");
                        double einzahlen = scanner.nextDouble();
                        if (einzahlen > bargeld) {
                            System.out.println("Sie haben nicht genug Bargeld.");
                        } else {
                            konto.einzahlung(einzahlen);
                            System.out.printf("Sie haben %.2f€ eingezahlt\n", einzahlen);
                            bargeld -= einzahlen;
                        }
                        konto.getBalance();
                        break;
                    case 4:
                        System.out.println("Mit wie viel Geld wollen Sie wetten?");
                        double wettbetrag = scanner.nextDouble();
                        if (wettbetrag <= bargeld) {
                            double gewinn = konto.coinflip(wettbetrag);
                            System.out.printf("Gewinn/Verlust: %.2f\n", gewinn);
                            bargeld += gewinn;
                        }
                        else{
                            System.out.println("Sie haben nicht genug Geld\n");
                        }
                        break;
                    case 5:
                        double restwert = konto.deleteKonto();
                        System.out.printf("Sie haben %.2f€ zurück erhalten\n", restwert);
                        break;
                    case 6:
                        fortfahren = false;
                        break;
                }
            } else {
                System.out.println("Bitte erstellen Sie sich zuerst ein Konto:");
                konto.kontoEroeffnung();
            }


            System.out.println("\n___________________________\n");


        }

    }


}
