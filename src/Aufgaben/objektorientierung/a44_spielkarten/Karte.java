package aufgaben.objektorientierung.a44_spielkarten;


import static aufgaben.objektorientierung.a44_spielkarten.ConsoleColors.*;

public class Karte  {
    private Farbe farbe;
    private Wert wert;


    @Override
    public String toString() {
        String consoleColor = "";
        if (farbe.equals(Farbe.KARO) || farbe.equals(Farbe.HERZ)){
            consoleColor = RED_BOLD;
        }else  {
            consoleColor = WHITE_BOLD;
        }

        String output = String.format("%s%s|%s%s",consoleColor,farbe, wert, RESET);

        /*return farbe.toString() + "|" + wert.toString();*/
        return output;
    }

    // Constructor
    public Karte(Farbe farbe, Wert wert) {
        this.farbe = farbe;
        this.wert = wert;
    }

    //Getter & Setter
    public Farbe getFarbe() {
        return farbe;
    }

    public void setFarbe(Farbe farbe) {
        this.farbe = farbe;
    }

    public Wert getWert() {
        return wert;
    }

    public void setWert(Wert wert) {
        this.wert = wert;
    }
}
