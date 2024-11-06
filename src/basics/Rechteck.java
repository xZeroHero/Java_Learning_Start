package basics;

public class Rechteck implements Comparable<Rechteck> {

    private int seitenlaengeA;
    private int seitenlaengeB;



    public int compareTo(Rechteck o) {
        if(seitenlaengeA == o.getSeitenlaengeA()){
            return 0; //Gleich
        } else if (seitenlaengeA > o.getSeitenlaengeA()) {
            return 1; // Sort nach rechts
        }else return -1; // Sort nach links

    }

    @Override
    public String toString() {
        return STR."A=\{seitenlaengeA}:B=\{seitenlaengeB}";
    }

    public Rechteck(int seitenlaengeA, int seitenlaengeB) {
        this.seitenlaengeA = seitenlaengeA;
        this.seitenlaengeB = seitenlaengeB;
    }

    public int getSeitenlaengeA() {
        return seitenlaengeA;
    }

    public void setSeitenlaengeA(int seitenlaengeA) {
        this.seitenlaengeA = seitenlaengeA;
    }

    public int getSeitenlaengeB() {
        return seitenlaengeB;
    }

    public void setSeitenlaengeB(int seitenlaengeB) {
        this.seitenlaengeB = seitenlaengeB;
    }
}
