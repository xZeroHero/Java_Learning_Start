package Aufgaben;
import java.lang.Math;

public class A00_DMToEuro {

    public static void main(String[] args) {

        System.out.println(STR." 3 DMark sind \{DM_to_Eur(3)}€");
        System.out.println("_________________________");
        System.out.println(STR." 5.63 DMark sind \{DM_to_Eur(5.63)}€");
        System.out.println("_________________________");
        System.out.println(STR." 5 DMark sind \{DM_to_Eur(5)}€");
        System.out.println("_________________________");
        System.out.println(STR." 12453.53 DMark sind \{DM_to_Eur(12453.53)}€");
        System.out.println("_________________________");
        System.out.println(STR." 0 DMark sind \{DM_to_Eur(0)}€");
        System.out.println("_________________________");
        System.out.println(STR." 1235 DMark sind \{DM_to_Eur(1235)}€");
        System.out.println("_________________________");
        System.out.println(STR." -2 DMark sind \{DM_to_Eur(-2)}€");


    }

    public static double DM_to_Eur(double currentDM){

        if (currentDM < 0) return(0);
        final double EXCHANGERATE_DM_TO_EUR = 1.95583;
        return (double) Math.round(currentDM * EXCHANGERATE_DM_TO_EUR * 100) / 100;

    }
}

