package aufgaben.objektorientierung.a44_spielkarten;

import java.util.Stack;

public class Deck {
    private Stack<Karte> deckStack;

    public Karte drawCard(){
        return deckStack.pop();
    }



    @Override
    public String toString() {
        return deckStack.toString();
    }

    //Constructor
    public Deck(Stack<Karte> deckStack) {
        this.deckStack = deckStack;
    }

    //Getter & Setter
    public Stack<Karte> getDeckStack() {
        return deckStack;
    }

    public void setDeckStack(Stack<Karte> deckStack) {
        this.deckStack = deckStack;
    }
}
