package aufgaben.objektorientierung.a38_laptop;

public class Notebook {

    private ComputerComponents computerComponents;
    private Display display;
    private Battery battery;
    private Model model;


    public Notebook(ComputerComponents computerComponents, Display display, Battery battery, Model model) {
        setComputerComponents(computerComponents);
        setDisplay(display);
        setBattery(battery);
        setModel(model);
    }


    public String toString(){
        String output = "Laptop:\n";
        output += String.format("%s\n", getModel());
        output += String.format("_____________________\n");
        output += String.format("%s\n",getComputerComponents());
        output += String.format("_____________________\n");

        output += String.format("%s\n", getDisplay());
        output += String.format("_____________________\n");

        output += String.format("%s\n", getBattery());

        return output;

    }


//    @Override
//    public String toString() {
//        return "Notebook{" +
//                "computerComponents=" + computerComponents +
//                ", display=" + display +
//                ", battery=" + battery +
//                ", model=" + model +
//                '}';
//    }

    //Getter & Setter
    public ComputerComponents getComputerComponents() {
        return computerComponents;
    }

    public void setComputerComponents(ComputerComponents computerComponents) {
        this.computerComponents = computerComponents;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
