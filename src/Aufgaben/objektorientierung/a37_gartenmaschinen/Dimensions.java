package aufgaben.objektorientierung.a37_gartenmaschinen;

public class Dimensions {

    private double length;
    private double width;
    private double height;



    public Dimensions(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    @Override
    public String toString(){
        return String.format("%.2f x %.2f x %.2f (LxBxH)", getLength(), getWidth(), getHeight());
    }

    //Getter & Setter
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
