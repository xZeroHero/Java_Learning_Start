package aufgaben.objektorientierung.a43_gaststaette;

public class Lebensmittel {

    private String bezeichnung;
    private double preis;

    public Lebensmittel(String bezeichnung, double preis) {
        setBezeichnung(bezeichnung);
        setPreis(preis);
    }

    @Override
    public String toString() {
        return String.format("%-30s %.2f€", getBezeichnung(), getPreis());
    }


    //Validierung
    public boolean isPreis(double preis) {
        if (preis > 0.00) {
            return true;
        } else throw new NumberFormatException("Kein gültiger Preis");
    }

    //Getter & Setter

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        if (isPreis(preis)) {
            this.preis = preis;
        }
    }
}
