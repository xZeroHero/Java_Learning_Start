package aufgaben.objektorientierung.a38_laptop;

public class Processor {

    private String serie;
    private int cores;
    private double clockSpeed;
    private Model model;


    public Processor(String serie, int cores, double clockSpeed, Model model) {
        setSerie(serie);
        setCores(cores);
        setClockSpeed(clockSpeed);
        setModel(model);
    }

    public String toString() {
        String output = "Processor:\n";
        output += String.format("%s\n",getModel());
        output += String.format("Serie: %s\n", getSerie());
        output += String.format("Cores: %d\n", getCores());
        output += String.format("Clock speed: %.2f GHz\n", getClockSpeed());

        return output;
    }

    //Getter & Setter
    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
