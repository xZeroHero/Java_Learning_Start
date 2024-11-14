package aufgaben.objektorientierung.a44_spielkarten;

public enum Wert {
    ZWEI(2), DREI(3), VIER(4), FUENF(5), SECHS(6), SIEBEN(7), ACHT(8), NEUN(9), ZEHN(10), BUBE(10), DAME(10), KOENIG(10), ASS(11);
    private final int VALUE;

    Wert(int i) {
        this.VALUE = i;
    }

    public int getVALUE(){
        return VALUE;
    }



}
