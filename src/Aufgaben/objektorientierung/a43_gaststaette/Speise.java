package aufgaben.objektorientierung.a43_gaststaette;

public class Speise extends Lebensmittel {

    private boolean vegetarisch;

    public Speise(String bezeichnung, double preis, boolean vegetarisch) {
        super(bezeichnung, preis);
        setVegetarisch(vegetarisch);
    }

    @Override
    public String toString() {
        String output = super.toString();
        if (isVegetarisch()){
            output += " (vegetarisch)";
        }
        return output;
    }

    //Getter & Setter

    public boolean isVegetarisch() {
        return vegetarisch;
    }

    public void setVegetarisch(boolean vegetarisch) {
        this.vegetarisch = vegetarisch;
    }
}
