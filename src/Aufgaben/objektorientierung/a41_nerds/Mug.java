package aufgaben.objektorientierung.a41_nerds;

public class Mug extends Article{

    private double volume;

    public Mug(String articleName, double price, double volume) {
        super(articleName, price);
        setVolume(volume);
    }

    @Override
    public String toString() {
        return String.format("%s\nFassungsvermögen: %.0fml\n%s Euro", getArticleName(), getVolume(), getPrice());
    }

    //Getter & Setter
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
