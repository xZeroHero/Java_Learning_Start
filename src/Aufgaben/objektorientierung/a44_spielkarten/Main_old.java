package aufgaben.objektorientierung.a44_spielkarten;

import java.util.Collections;
import java.util.Stack;

public class Main_old {
    public static void main(String[] args) {

        Stack<Karte> kartenDeck = new Stack<>();

        for(Farbe farbe : Farbe.values()) {
            for(Wert wert : Wert.values()){
                kartenDeck.push(new Karte(farbe, wert));
            }
        }

        Deck deck = new Deck(kartenDeck);
        Collections.shuffle(deck.getDeckStack());

        Hand ownHand = new Hand();
        Hand dealerHand = new Hand();


<<<<<<< HEAD
=======
/*        ownHand.takeCard(deck.drawCard());
        ownHand.takeCard(deck.drawCard());
        ownHand.takeCard(deck.drawCard());
        System.out.println(ownHand.getHand());
        System.out.println(ownHand.getWert());*/

/*        ownHand.takeCard(deck.drawCard());

        ownHand.takeCard(deck.drawCard());
        ownHand.takeCard(deck.drawCard());
        dealerHand.takeCard(deck.drawCard());
        dealerHand.takeCard(deck.drawCard());
        dealerHand.takeCard(deck.drawCard());

        System.out.println(ownHand.getHand());
        System.out.println(dealerHand.getHand());*/

>>>>>>> origin/main
        Blackjack blackjack = new Blackjack();
        System.out.println("Auszahlung: " + blackjack.gameStart(deck, 200));







/*
        Collections.shuffle(deck.getDeckStack());
        System.out.println(deck);

        System.out.println(deck.getDeckStack().pop());
        System.out.println(deck);

        System.out.println(deck.getDeckStack().pop());
        System.out.println(deck);


        //Lösung 1:
//        for(int i = deck.getDeckStack().size(); i > 0; i--){
//            System.out.println(deck.getDeckStack().pop());
//            System.out.println(deck);
//        }

        //Lösung 2:
        int a = deck.getDeckStack().size();

        for(int i = 0; i < a; i++){
            System.out.println(deck.getDeckStack().pop());
            System.out.println(deck);
        }


        System.out.println(deck.getDeckStack().size());
*/




    }


}
