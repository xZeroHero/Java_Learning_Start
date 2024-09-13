package aufgaben.objektorientierung.a38_laptop;

public class Battery {

    private double batteryCapacity; //Wh
    private double currentCharge; //Wh

    public Battery(double batteryCapacity) {
        setBatteryCapacity(batteryCapacity);
    }

    public String toString() {
        String output = "Battery:\n";
        output += String.format("Battery Capacity: %.0f Wh\n", getBatteryCapacity());
        return output;
    }


    //Getter & Setter
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getCurrentCharge() {
        return currentCharge;
    }

    public void setCurrentCharge(double currentCharge) {
        this.currentCharge = currentCharge;
    }
}
