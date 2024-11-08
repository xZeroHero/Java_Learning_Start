package aufgaben.objektorientierung.a44_spielkarten;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Karte> hand = new ArrayList<>();

    public void takeCard(Karte karte){
        hand.add(karte);
    }

    public int getWert(){
        int wert = 0;
        for (Karte karte : hand) {
            wert += karte.getWert().getValue();
        }
        return wert;
    }

    public int handValue() {
        int wert = 0;
        for (Karte karte : hand) {
            wert += karte.getWert().getValue();
            if (karte.getWert().getValue() == 11 && wert > 21) {
                wert -= 10;
            }
            /*if (wert > 21){
                return wert;
            }*/
        }
        return wert;
    }



    //GETTER & SETTER
    public ArrayList<Karte> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Karte> hand) {
        this.hand = hand;
    }
}
