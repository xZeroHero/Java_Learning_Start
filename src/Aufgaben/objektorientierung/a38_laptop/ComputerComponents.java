package aufgaben.objektorientierung.a38_laptop;

public class ComputerComponents {

    private RAM ram;
    private Processor cpu;
    private Storage storage;


    public ComputerComponents(RAM ram, Processor cpu, Storage storage) {
        setRam(ram);
        setCpu(cpu);
        setStorage(storage);
    }

    public String toString(){
        String output = "Components:\n\n";
        output += String.format("%s\n", getCpu());
        output += String.format("%s\n", getRam());
        output += String.format("%s", getStorage());

        return output;
    }


    //Getter & Setter
    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Processor getCpu() {
        return cpu;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
