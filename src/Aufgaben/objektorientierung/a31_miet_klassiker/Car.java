package aufgaben.objektorientierung.a31_miet_klassiker;

import java.util.Scanner;

public class Car {

    private String model;
    private double drivenKM;
    private double tagespauschale;
    private final double PAUSCHALE_MUSTANG = 270; //EUR
    private final double PAUSCHALE_ENTE = 225; //EUR
    private Scanner scanner = new Scanner(System.in);
    private final double KM_FREIBETRAG = 150; //KM
    private final double PRICE_PER_KM = 0.6; //EUR pro km


    public double price(double km, int days){
        double price = 0.0;
        price = tagespauschale * days;
        if (km >= KM_FREIBETRAG){
            km -= KM_FREIBETRAG;
            price += km * PRICE_PER_KM;
        }

        return price;
    }

    public boolean setModel(String model){
//        System.out.println("Welches Modell? Mustang / Ente");
//        String input = scanner.nextLine();
        if (model.equals("Mustang")){
            this.model = "Ford Mustang V8 Cabrio";
        }
        else {
            if (model.equals("Ente")){
                this.model = "Charleston Ente";
            }
            else return false;
        }
        return true;
    }
    public String getModel(){
        return model;
    }

    public boolean setTagespauschale(){
        if (model.equals("Ford Mustang V8 Cabrio")){
            tagespauschale = PAUSCHALE_MUSTANG;
        }
        else {
            if ((model.equals("Charleston Ente"))){
                tagespauschale = PAUSCHALE_ENTE;
            }
            else return false;
        }
        return true;
    }
    public double getTagespauschale(){
        return tagespauschale;
    }



}
