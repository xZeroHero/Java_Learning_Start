package aufgaben.objektorientierung.a42_ligaverwaltung;

public class Mannschaft {


    private String name;
    private int tore;
    private int gegentore;
    private int score;

    public Mannschaft(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String output = "";
        output += String.format("%-15s ", getName());
        output += String.format("%2d : %2d", getTore(), getGegentore());
        output += String.format("  %+2d ", getTordifferenz());
        output += String.format("%3d\n", getScore());
        return output;
    }

    public void addScore(int score){
        setScore(this.score + score);
//        this.score += score;
    }

    public void addTorverhaeltnis(int tore, int gegentore){
        setTore(this.tore + tore);
        setGegentore(this.gegentore + gegentore);
    }

    public int getTordifferenz() {
        return getTore() - getGegentore();
    }


    //Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTore() {
        return tore;
    }

    public void setTore(int tore) {
        this.tore = tore;
    }

    public int getGegentore() {
        return gegentore;
    }

    public void setGegentore(int gegentore) {
        this.gegentore = gegentore;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}


