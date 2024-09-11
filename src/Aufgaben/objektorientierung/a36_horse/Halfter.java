package aufgaben.objektorientierung.a36_horse;

public class Halfter {

    String size;
    Color color;


    public Halfter(String size) {
        setSize(size);
    }

    public Halfter(String size, Color color) {
        setSize(size);
        setColor(color);
    }

    @Override
    public String toString(){
        String output = "Halfter:\n";
        output += String.format("Größe: %s\n", getSize());
        if (color != null){
            output += String.format("Farbe: %s", getColor());
        }
        return output;
    }

    //Getter & Setter
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
