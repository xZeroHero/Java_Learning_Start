package aufgaben.extra_aufgaben;

import java.util.Scanner;

public class EA03_Swamp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean manuseln;
        boolean knelt;
        boolean loepsen;
        boolean nopeln;


        System.out.println("manuseln?");
        manuseln = input.nextBoolean(); input.nextLine();
        System.out.println("knelt?");
        knelt = input.nextBoolean(); input.nextLine();
        System.out.println("loepsen?");
        loepsen = input.nextBoolean(); input.nextLine();
        System.out.println("nopeln?");
        nopeln = input.nextBoolean(); input.nextLine();

/*        manuseln = true;
        knelt = true;
        loepsen = false;
        nopeln = false;*/

        String stamm = "Kein bekannter Stamm";

        if (knelt && manuseln) stamm = "Asis";

        if (!knelt && nopeln) stamm = "Bela";

        if (knelt && !manuseln && nopeln) stamm = "Cedi";

        if (!knelt && loepsen && !nopeln) {
            if (manuseln) stamm = "Cedi";
            else stamm = "Drudi";
        }

        if (!manuseln && !nopeln && knelt) stamm = "Drudi";

        if (!knelt && !loepsen && !nopeln){
            if (manuseln) stamm = "Drudi";
            else stamm = "Cedi";
        }

        System.out.println(STR."Ergebnis: \{stamm}");


    }


}
