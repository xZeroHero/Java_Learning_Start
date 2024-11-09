package aufgaben.objektorientierung.a38_laptop;

public class Model {

    private String manufacturer;
    private String model;


    public Model(String manufacturer, String model) {
        setManufacturer(manufacturer);
        setModel(model);
    }


    public String asString(){
        return String.format("Hersteller/Modell: %s %s", getManufacturer(), getModel());
    }

    //Getter & Setter
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
