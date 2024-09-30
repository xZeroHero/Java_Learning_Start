package aufgaben.objektorientierung.a42_ligaverwaltung;

public class Spiel {

    private Mannschaft mannschaft1;
    private Mannschaft mannschaft2;
    private int tore1;
    private int tore2;


    public Spiel(Mannschaft mannschaft1, Mannschaft mannschaft2, int tore1, int tore2) {
        setMannschaft1(mannschaft1);
        setMannschaft2(mannschaft2);
        setTore1(tore1);
        setTore2(tore2);
        auswertung(tore1, tore2);

    }

    public void auswertung(int tore1, int tore2){
        scoreBerechnung(tore1, tore2);
        mannschaft1.addTorverhaeltnis(tore1, tore2);
        mannschaft2.addTorverhaeltnis(tore2, tore1);

    }

    public void scoreBerechnung(int tore1, int tore2){
        if (tore1 > tore2){
            mannschaft1.addScore(3);
        } else if (tore1 == tore2) {
            mannschaft1.addScore(1);
            mannschaft2.addScore(1);
        }else {
            mannschaft2.addScore(3);
        }
    }


    @Override
    public String toString() {
        String output = "";
        output += String.format("%-15s- ", getMannschaft1().getName());
        output += String.format("%-15s", getMannschaft2().getName());
        output += String.format("%2d : %2d\n", getTore1(), getTore2());
        return output;
    }


    //Getter & Setter

    public Mannschaft getMannschaft1() {
        return mannschaft1;
    }

    public void setMannschaft1(Mannschaft mannschaft1) {
        this.mannschaft1 = mannschaft1;
    }

    public Mannschaft getMannschaft2() {
        return mannschaft2;
    }

    public void setMannschaft2(Mannschaft mannschaft2) {
        this.mannschaft2 = mannschaft2;
    }

    public int getTore1() {
        return tore1;
    }

    public void setTore1(int tore1) {
        this.tore1 = tore1;
    }

    public int getTore2() {
        return tore2;
    }

    public void setTore2(int tore2) {
        this.tore2 = tore2;
    }
}
