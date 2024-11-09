package aufgaben.objektorientierung.a41_nerds;

public class Shirt extends Article {

    private String size;


    public Shirt(String articleName, double price, String size) {
        super(articleName, price);
        setSize(size);
    }

    public String toString() {
        return String.format("%s\nGröße: %s\n%s Euro", getArticleName(), getSize(), getPrice());
    }

    //Getter & Setter
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
