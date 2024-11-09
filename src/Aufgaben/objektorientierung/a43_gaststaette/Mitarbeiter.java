package aufgaben.objektorientierung.a43_gaststaette;

public class Mitarbeiter extends Person {

    private double gehalt;

    public Mitarbeiter(String name, double gehalt) {
        super(name);
        setGehalt(gehalt);
    }

    @Override
    public String toString() {
        return String.format("%-30s Gehalt: %.2f€", super.toString(), getGehalt() );
    }

    public boolean isGehalt(double gehalt){
        if (gehalt > 0.00) return true;
        else throw new NumberFormatException("Kein gültiger Preis");

    }

    //Getter & Setter

    public void setGehalt(double gehalt) {
        if (isGehalt(gehalt)) {
            this.gehalt = gehalt;
        }
    }

    public double getGehalt() {
        return gehalt;
    }
}
