package aufgaben.extra_aufgaben;

import java.util.Scanner;

public class EA04_GTIN13_Validierung {

    public static void main(String[] args) {

        System.out.println("GITN-13 Nummer:");
        Scanner input = new Scanner(System.in);
        String gitnInput = input.nextLine();

//        String gitnInput = "40 04870 00162 0";
        String gitn13 = gitnInput.replaceAll("\\W", "");
        int summe1 = 0;
        int summe2 = 0;
        int pruefziffer = Character.getNumericValue(gitn13.charAt(gitn13.length()-1));
        int differenz = 0;

        for (int i = 0; i < gitn13.length() - 1; i += 2) {
            summe1 += Character.getNumericValue(gitn13.charAt(i));
        }


        for (int i = 1; i < gitn13.length() - 1; i += 2) {
            summe2 += Character.getNumericValue(gitn13.charAt(i));
        }

        summe1 += summe2 * 3;


        while (summe1 % 10 != 0){
            summe1++;
            differenz++;
        }

        if (differenz == pruefziffer){
            System.out.println(STR."GITN-13 Nummer: \"\{gitnInput}\" ist gültig.\nPrüfziffer: \{pruefziffer}, Differenz: \{differenz}");
        }
        else {
            System.out.println(STR."GITN-13 Nummer: \{gitnInput} ist ungültig.\nPrüfziffer: \{pruefziffer}, Differenz: \{differenz}");
        }


    }

}
