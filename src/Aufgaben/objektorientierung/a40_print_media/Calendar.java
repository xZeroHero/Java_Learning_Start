package aufgaben.objektorientierung.a40_print_media;

public class Calendar extends PrintMedia{

    private Dimensions dimensions;


    public Calendar(String name,Publisher publisher, double price, Dimensions dimensions) {
        super(name, publisher, price);
        setDimensions(dimensions);
    }

    public String toString() {
        String output = String.format("%s", super.toString());
        output += String.format("%s\n", getDimensions());
        return output;
    }

    //Getter & Setter
    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
}
