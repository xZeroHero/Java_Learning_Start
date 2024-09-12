package aufgaben.objektorientierung.a38_laptop;

public class Display {

    private double screenSize; //Inch
    private int ppi;
    private Model model;
    private Resolution resolution;

    public Display(double screenSize, int ppi, Model model, Resolution resolution) {
        setScreenSize(screenSize);
        setPpi(ppi);
        setModel(model);
        setResolution(resolution);
    }

    @Override
    public String toString(){
        String output = "Display:\n";
        output += String.format("%s\n", getModel());
        output += String.format("Screen size: %.1f inch\n", getScreenSize());
        output += String.format("%s\n", getResolution());
        output += String.format("Pixel per inch: %d\n", getPpi());
        return output;
    }



    //Getter & Setter

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getPpi() {
        return ppi;
    }

    public void setPpi(int ppi) {
        this.ppi = ppi;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
