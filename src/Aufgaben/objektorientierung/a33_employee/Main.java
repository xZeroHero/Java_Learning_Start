package aufgaben.objektorientierung.a33_employee;

public class Main {

    public static void main(String[] args) {


        Mitarbeiter a = new Mitarbeiter("Max Mustermann", "ABC123456", "12.03.1999", 30);

//        a.setName("Max Mustermann");
//        a.setPersonalnummer("ABC123456");
//        a.setGeburtsdatum(21, 12, 1990);
//        a.setUrlaubstage(30);

//        a.takeUrlaubstage(20);
//        a.takeUrlaubstage(5);
//        a.takeUrlaubstage(6);
//        a.ausgabe();

        Mitarbeiter[] array = new Mitarbeiter[3];

        array[0] = new Mitarbeiter("Max Mustermann", "ABC123456", "12.03.1999", 30);
        array[1] = new Mitarbeiter("Nadine Niedermann", "ABC112356", "12.12.1800", 20);
        array[2] = new Mitarbeiter("Helmut Helm", "ADC122356", "09.01.1980", 25);

        array[0].takeUrlaubstage(10);
        array[1].takeUrlaubstage(3);
        array[2].takeUrlaubstage(1);


        array[0].ausgabe();
        System.out.println("\n_________________________________\n");
        array[1].ausgabe();
        System.out.println("\n_________________________________\n");
        array[2].ausgabe();
        System.out.println("\n_________________________________\n");




    }



}
