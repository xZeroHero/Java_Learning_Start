package aufgaben.objektorientierung.a37_gartenmaschinen;

public class Generator {

    private String model;
    private int maximumGeneration;
    private Dimensions dimensions;
    private Weight weight;
    private Manufacturer manufacturer;
    private Engine engine;


    public Generator(int maximumGeneration,Engine engine, Dimensions dimensions, Weight weight, Manufacturer manufacturer, String model) {
        setMaximumGeneration(maximumGeneration);
        setEngine(engine);
        setDimensions(dimensions);
        setWeight(weight);
        setManufacturer(manufacturer);
        setModel(model);
    }

    @Override
    public String toString(){
        String output = String.format("%s Stromgenerator\n", getModel());
        output += String.format("%s\n", getManufacturer());
        output += String.format("Maximalleistung: %d Watt\n", getMaximumGeneration());
        output += String.format("Maße: %s mm\n", getDimensions());
        output += String.format("%s kg\n", getWeight());
        output += String.format("_________________\n%s", getEngine());
        return output;
    }

    //Getter & Setter

    public int getMaximumGeneration() {
        return maximumGeneration;
    }

    public void setMaximumGeneration(int maximumGeneration) {
        this.maximumGeneration = maximumGeneration;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
