package aufgaben.teams_aufgaben;

public class A21_Balkendiagramm {

    public static void main(String[] args) {

        int[] prozentZahlen = {45, 5, 75, 100, 27, 123, 89};
        char[] balkenHexcodes = {0x2588, 0x2591, 0x2593, 0x2592};
        String balken = "";
        String output = "";

        int maxProzent = 100; //%
        int maxChars = 50; //maximale Anzahl an Zeichen bei maxProzent%
        int percentPerChar = maxProzent / maxChars;
        int balkenCounter = 0;


        for (int prozent: prozentZahlen){
            balken = "";
            for (int i = 0; i < prozent / percentPerChar; i++){                     // prozent / percentPerChar = Anzahl an benötigten Zeichen für den Balken
                balken += balkenHexcodes[balkenCounter % balkenHexcodes.length];    //balkenCounter % länge, damit die Unicode Zeichen immer rotieren egal wie viele Balken gebraucht werden.
            }
//            balkenCounter++;
            System.out.printf(STR."|%-\{maxChars}s| %d\n", balken, prozent);
        }

    }

}
