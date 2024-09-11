package aufgaben.objektorientierung.a37_gartenmaschinen;

public class Lawnmower {

    private String model;
    private Engine engine;
    private int cuttingWidth;
    private CollectionBag collectionBag;
    private double noiseLevel;
    private Manufacturer manufacturer;


    public Lawnmower(Engine engine, int cuttingWidth, CollectionBag collectionBag, double noiseLevel, Manufacturer manufacturer, String model) {
        setEngine(engine);
        setCuttingWidth(cuttingWidth);
        setCollectionBag(collectionBag);
        setNoiseLevel(noiseLevel);
        setManufacturer(manufacturer);
        setModel(model);
    }

    @Override
    public String toString(){
        String output = String.format("%s Rasenmäher\n", getModel());
        output += String.format("%s\n", getManufacturer());
        output += String.format("Schnittbreite: %d cm\n", getCuttingWidth());
        output += String.format("%s L\n", getCollectionBag());
        output += String.format("Geräuschpegel: %.1f dB(A)\n", getNoiseLevel());
        output += String.format("_________________\n%s", getEngine());
        return output;
    }


    //Getter & Setter
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getCuttingWidth() {
        return cuttingWidth;
    }

    public void setCuttingWidth(int cuttingWidth) {
        this.cuttingWidth = cuttingWidth;
    }

    public CollectionBag getCollectionBag() {
        return collectionBag;
    }

    public void setCollectionBag(CollectionBag collectionBag) {
        this.collectionBag = collectionBag;
    }

    public double getNoiseLevel() {
        return noiseLevel;
    }

    public void setNoiseLevel(double noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
