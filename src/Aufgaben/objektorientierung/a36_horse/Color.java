package aufgaben.objektorientierung.a36_horse;

public class Color {

    String color;
    boolean hasRGBValues = false;
    int red;
    int green;
    int blue;
    String rgb;


    public Color(String color) {
        setColor(color);
    }

    public Color(String color, int red, int green, int blue) {
        setColor(color);
        setRed(red);
        setGreen(green);
        setBlue(blue);
        setRgb();
    }

    @Override
    public String toString(){
        return String.format("Farbe: %s\n", getColor());
    }

    public boolean hasRGB(){
        return true;
    }

    //Getter & Setter


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRgb() {
        return rgb;
    }

    public void setRgb() {
        this.rgb = Integer.toString(this.red);
        this.rgb += ",";
        this.rgb += Integer.toString(this.green);
        this.rgb += ",";
        this.rgb += Integer.toString(this.blue);
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
        hasRGB();
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
        hasRGB();
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
        hasRGB();
    }
}
