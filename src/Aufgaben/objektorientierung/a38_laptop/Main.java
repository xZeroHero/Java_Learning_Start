package aufgaben.objektorientierung.a38_laptop;

public class Main {

    public static void main(String[] args) {

        Battery battery1 = new Battery(41);

//        System.out.println(battery1);

        Display display1 = new Display(17.3, 20, new Model("Asus", "D823917"), new Resolution(1920, 1080));

//        System.out.println(display1);

        RAM ram1 = new RAM(16, new Model("Corsair", "VENGEANCE LPX"));

//        System.out.println(ram1);

        Processor processor1 = new Processor("7000 Series", 4, 2.8, new Model("AMD", " Ryzen™ 5"));

//        System.out.println(processor1);

        Storage storage1 = new Storage(512, 2000, 2000, new Model("Samsung", "870 EVO"));

//        System.out.println(storage1);

        ComputerComponents computerComponents1 = new ComputerComponents(ram1, processor1, storage1);

//        System.out.println(computerComponents1);

        Notebook notebook1 = new Notebook(computerComponents1, display1, battery1, new Model("Asus", "NB185623"));
        Notebook notebook2 = new Notebook(computerComponents1, display1, battery1, new Model("Asus", "NB185623"));

        System.out.println(notebook1);





    }

}
