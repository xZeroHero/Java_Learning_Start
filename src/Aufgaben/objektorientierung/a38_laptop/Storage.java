package aufgaben.objektorientierung.a38_laptop;

public class Storage {

    private int storageCapacity;
    private double readSpeed;
    private double writeSpeed;
    private Model model;

    public Storage(int storageCapacity, double readSpeed, double writeSpeed, Model model) {
        setStorageCapacity(storageCapacity);
        setReadSpeed(readSpeed);
        setWriteSpeed(writeSpeed);
        setModel(model);
    }

    public Storage(int storageCapacity, Model model) {
        setStorageCapacity(storageCapacity);
        setModel(model);
    }

    public String toString(){
        String output = "Storage:\n";
        output += String.format("%s\n",getModel());
        output += String.format("Storage capacity: %d GB\n", getStorageCapacity());
        output += String.format("Read speed: %.1f MB/s\n", getReadSpeed());
        output += String.format("Write speed: %.1f MB/s\n", getWriteSpeed());
        return output;
    }

    //Getter & Setter
    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public double getReadSpeed() {
        return readSpeed;
    }

    public void setReadSpeed(double readSpeed) {
        this.readSpeed = readSpeed;
    }

    public double getWriteSpeed() {
        return writeSpeed;
    }

    public void setWriteSpeed(double writeSpeed) {
        this.writeSpeed = writeSpeed;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
