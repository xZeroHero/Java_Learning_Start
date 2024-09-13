package aufgaben.objektorientierung.a36_horse;

public class Sattel {

    String material;
    double gewicht;
    Color color;


    public Sattel(String material, double gewicht) {
        setMaterial(material);
        setGewicht(gewicht);
    }

    public Sattel(String material, double gewicht, Color color) {
        setMaterial(material);
        setGewicht(gewicht);
        setColor(color);
    }

    @Override
    public String toString() {
        String output = "Sattel:\n";
        output += String.format("Material: %s\n", getMaterial());
        output += String.format("Gewicht: %s\n", getGewicht());
        if (color != null){
            output += String.format("%s", getColor());
        }
        return output;
    }


    //Getter & Setter
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
