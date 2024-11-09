package aufgaben.objektorientierung.a41_nerds;

public class Doormat extends Article {

    private String material;


    public Doormat(String articleName, double price, String material) {
        super(articleName, price);
        setMaterial(material);
    }

    public String toString() {
        return String.format("%s\nMaterial: %s\n%s Euro", getArticleName(), getMaterial(), getPrice());
    }

    //Getter & Setter
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
