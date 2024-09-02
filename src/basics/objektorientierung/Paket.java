package basics.objektorientierung;

public class Paket {

    double gewicht;
    double berechnePreis(){
        double range10_20 = 14.00; //EUR
        double range5_10 = 10.50; //EUR
        double range0_5 = 7.00; //EUR

        if (gewicht <= 0){
            return 0;
        }else if (gewicht <= 5){
            return range0_5;
        }else if (gewicht <= 10){
            return range5_10;
        }else if (gewicht <= 20){
            return range10_20;
        }
        return 0;
    }

}
