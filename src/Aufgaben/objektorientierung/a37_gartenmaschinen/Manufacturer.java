package aufgaben.objektorientierung.a37_gartenmaschinen;

public class Manufacturer {

    String manufacturer;


    public Manufacturer(String manufacturer) {
        setManufacturer(manufacturer);

    }

    @Override
    public String toString(){
        return String.format("Hersteller: %s", getManufacturer());
    }


    //Getter & Setter
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
