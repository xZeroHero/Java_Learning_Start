package aufgaben.objektorientierung.a44_spielkarten;

import java.util.Scanner;

public class Blackjack {

    private Hand ownHand = new Hand();
    private Hand dealerHand = new Hand();


    public int gameStart(Deck deck, int einsatz) {
        Scanner scanner = new Scanner(System.in);
        boolean gameloop = true;
        boolean dealerGame = true;
        int gewonnen = 0;
        ownHand.takeCard(deck.drawCard());
        dealerHand.takeCard(deck.drawCard());
        System.out.println(getHands());
        while (gameloop) {
            System.out.println("Karte ziehen? y/n");
            String antwort = scanner.nextLine().toLowerCase();
            if (shouldDealerTakeCard()) {
                dealerHand.takeCard(deck.drawCard());
            }

            switch (antwort) {
                case "y":
                    ownHand.takeCard(deck.drawCard());
                    break;
                case "n":
                    while (dealerGame) {
                        if (shouldDealerTakeCard()) {
                            dealerHand.takeCard(deck.drawCard());
                        } else dealerGame = false;
                        System.out.println(getHands());


                    }

                    if (ownHand.handValue() <= 21 && dealerHand.handValue() < ownHand.handValue()) {
                        System.out.println("GEWONNEN!");
                        gewonnen = 1;
                        gameloop = false;
                    }
                    if (dealerHand.handValue() <= 21 && ownHand.handValue() < dealerHand.handValue()) {
                        System.out.println("VERLOREN!");
                        gewonnen = -1;
                        gameloop = false;
                    }
                    if (dealerHand.handValue() == ownHand.handValue()) {
                        System.out.println("UNENTSCHIEDEN!");
                        gewonnen = 0;
                        gameloop = false;
                    }
                    break;
                default:
                    ownHand.takeCard(deck.drawCard());
                    break;
            }


            if (dealerGame) System.out.println(getHands());
            if (dealerHand.handValue() > 21) {
                System.out.println("GEWONNEN!");
                gewonnen = 1;
                gameloop = false;
            }

            if (ownHand.handValue() > 21) {
                System.out.println("VERLOREN!");
                gewonnen = -1;
                gameloop = false;
            }
            if (ownHand.handValue() == 21) {
                System.out.println("GEWONNEN!");
                gewonnen = 1;
                gameloop = false;
            }


        }

        switch (gewonnen){
            case 1:
                einsatz *=2;
                break;
            case -1:
                einsatz = 0;
                break;
        }

        return einsatz;
/*        ownHand.takeCard(deck.drawCard());
        System.out.println(ownHand.getHand());*/
    }

    public boolean shouldDealerTakeCard() {
        return dealerHand.handValue() < 17;
    }


    public String getHands() {
        return String.format("Dealers Hand: %s | Wert: %d\nEigene Hand: %s | Wert: %d", dealerHand.getHand(), dealerHand.handValue(), ownHand.getHand(), ownHand.handValue());
    }

    //GETTER & SETTER

    public Hand getOwnHand() {
        return ownHand;
    }

    public void setOwnHand(Hand ownHand) {
        this.ownHand = ownHand;
    }

    public Hand getDealerHand() {
        return dealerHand;
    }

    public void setDealerHand(Hand dealerHand) {
        this.dealerHand = dealerHand;
    }


}
