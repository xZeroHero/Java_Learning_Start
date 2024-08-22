package aufgaben.teams_aufgaben;

import java.util.Arrays;

public class A22_Klassenspiegel_in_Array {

    public static void main(String[] args) {

        //Nur Formatierung:
//        ─
//        │
//        ┼



        int[] testResults = {92, 80, 29, 81, 100, 66, 91, 50, 70, 82, 30, 85, 96, 67};
        int[] noten = new int[6];

        for (int prozent : testResults){

            if (prozent <= 100){
                if (prozent <= 91){
                    if (prozent <= 80){
                        if (prozent <= 66){
                            if (prozent <= 49){
                                if (prozent <= 29){
                                    noten[5]++;
                                }else noten[4]++;
                            }else noten[3]++;
                        }else noten[2]++;
                    }else noten[1]++;
                }else noten[0]++;
            }

        }

        System.out.printf("%-9s│%2d │%2d │%2d │%2d │%2d │%2d │\n", "Note", 1, 2, 3, 4, 5, 6);
        System.out.printf("─────────┼───┼───┼───┼───┼───┼───┤\n");
        System.out.printf("%-9s│%2d │%2d │%2d │%2d │%2d │%2d │\n", "Anzahl", noten[0], noten[1], noten[2], noten[3], noten[4], noten[5]);

        //Klassenschnitt:

        int durchschnitt = 0;
        int gesamtProzente = 0;

        for (int prozent : testResults){
            gesamtProzente += prozent;
        }

        gesamtProzente /= testResults.length;

        System.out.println(STR."Klassendurchschnitt: \{gesamtProzente}%");

    }

}
