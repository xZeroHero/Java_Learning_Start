package aufgaben.objektorientierung.a40_print_media;

public class Dimensions {

    private double length;
    private double heigth;
    private double width;


    public Dimensions(double length, double heigth) {
        setLength(length);
        setHeigth(heigth);
    }


    public Dimensions(double length, double heigth, double width) {
        setLength(length);
        setHeigth(heigth);
        setWidth(width);
    }

    @Override
    public String toString() {
        String output = "Abmessungen: ";
        if (width == 0.0){
            output += String.format("%.2f x %.2f cm (L x H)\n", getLength(), getHeigth());
        }
        else{
            output += String.format("%.2f x %.2f x %.2f cm (L x H x B)\n", getLength(), getHeigth(), getWidth());
        }
        return output;
    }

    //Getter & Setter
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
