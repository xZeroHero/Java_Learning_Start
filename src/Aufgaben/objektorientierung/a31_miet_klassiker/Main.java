package aufgaben.objektorientierung.a31_miet_klassiker;

public class Main {

    public static void main(String[] args) {

        double km = 423;
        int days = 3;

        Car car = new Car();

        car.setModel("Mustang");
        car.setTagespauschale();


        System.out.println(STR."Modell: \{car.getModel()}");
        System.out.println(STR."Tagespauschale: \{car.getTagespauschale()}€");
        System.out.println(STR."Gesamtpreis: \{car.price(km, days)}€");

        System.out.println("\n_______________________\n");

        Car car2 = new Car();

        car2.setModel("Ente");
        car2.setTagespauschale();

        System.out.println(STR."Modell: \{car2.getModel()}");
        System.out.println(STR."Tagespauschale: \{car2.getTagespauschale()}€");
        System.out.println(STR."Gesamtpreis: \{car2.price(km, days)}€");



    }

}
