package aufgaben.objektorientierung.a38_laptop;

public class RAM {

    private int memory; //GB
    private Model model;

    public RAM(int memory, Model model) {
        setMemory(memory);
        setModel(model);
    }

    public String toString(){
        String output = "RAM:\n";
        output += String.format("Memory: %d GB\n", getMemory());
        output += String.format("%s\n", getModel());

        return output;
    }

    //Getter & Setter
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
