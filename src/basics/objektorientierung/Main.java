package basics.objektorientierung;

public class Main {

    public static void main(String[] args) {

        Paket paket = new Paket();

        paket.gewicht = 4;

        System.out.println(paket.berechnePreis());

    }

}
