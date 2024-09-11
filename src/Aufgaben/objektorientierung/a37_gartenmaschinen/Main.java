package aufgaben.objektorientierung.a37_gartenmaschinen;

public class Main {

    public static void main(String[] args) {

        Manufacturer mannesmann = new Manufacturer("Mannesmann");
        Manufacturer wolfGarten = new Manufacturer("WOLF GARTEN");

        Engine engine190cc = new Engine(4.4/*kW*/, "Benzin bleifrei", "4-Takt", 190/*cm³*/);
        Engine engine196cc = new Engine(4.0/*kw*/, "Benzin bleifrei", "4-Takt", 196/*cm³*/);

        Weight weight = new Weight(42/*kg*/);
        Dimensions dimensions = new Dimensions(610, 430, 435); //mm
        CollectionBag collectionBag = new CollectionBag(65/*L*/);

        Lawnmower lawnmower1 = new Lawnmower(engine190cc, 53/*cm*/, collectionBag, 96/*dB(A)*/, wolfGarten, "Power-Edition 53 QRA");
        Generator generator1 = new Generator(3000/*W*/, engine196cc, dimensions, weight, mannesmann, "M12953");


        System.out.println(lawnmower1);
        System.out.println("\n========================\n");
        System.out.println(generator1);

    }

}
