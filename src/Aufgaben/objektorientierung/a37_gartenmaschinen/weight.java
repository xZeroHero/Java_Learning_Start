package aufgaben.objektorientierung.a37_gartenmaschinen;

public class Weight {

    private double weight;

    public Weight(double weight) {
        setWeight(weight);
    }

    @Override
    public String toString(){
        return String.format("Gewicht: %.2f", weight);
    }

    //Getter & Setter
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
