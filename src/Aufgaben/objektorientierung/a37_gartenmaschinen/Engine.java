package aufgaben.objektorientierung.a37_gartenmaschinen;

public class Engine {

    private double power;
    private String fuel;
    private String strokeType;
    private int capacity;


    public Engine(double power, String fuel, String strokeType, int capacity) {
        setPower(power);
        setFuel(fuel);
        setStrokeType(strokeType);
        setCapacity(capacity);
    }

    @Override
    public String toString(){
        String output = "Motor:\n";
        output += String.format("Motorleistung: %.1f kw\n", getPower());
        output += String.format("Treibstoff: %s\n", getFuel());
        output += String.format("Typ: %s\n", getStrokeType());
        output += String.format("Hubraum: %d cm³", getCapacity());
        return output;
    }

    //Getter & Setter
    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getStrokeType() {
        return strokeType;
    }

    public void setStrokeType(String strokeType) {
        this.strokeType = strokeType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
