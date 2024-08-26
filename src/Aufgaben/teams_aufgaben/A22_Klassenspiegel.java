package aufgaben.teams_aufgaben;

public class A22_Klassenspiegel {

    public static void main(String[] args) {

        //Nur Formatierung:
//        ─
//        │
//        ┼



        int[] testResults = {92, 80, 29, 81, 100, 66, 91, 50, 70, 82, 30, 85, 96, 67};
        int einsen = 0;
        int zweien = 0;
        int dreien = 0;
        int vieren = 0;
        int fuenfen = 0;
        int sechsen = 0;



        for (int prozent : testResults){

            if (prozent <= 100){
                if (prozent <= 91){
                    if (prozent <= 80){
                        if (prozent <= 66){
                            if (prozent <= 49){
                                if (prozent <= 29){
                                    sechsen++;
                                }else fuenfen++;
                            }else vieren++;
                        }else dreien++;
                    }else zweien++;
                }else einsen++;
            }

        }

        System.out.printf("┌─────────┬───┬───┬───┬───┬───┬───┐\n");
        System.out.printf("│ %-8s│ %d │ %d │ %d │ %d │ %d │ %d │\n", "Note", 1, 2, 3, 4, 5, 6);
        System.out.printf("├─────────┼───┼───┼───┼───┼───┼───┤\n");
        System.out.printf("│ %-8s│ %d │ %d │ %d │ %d │ %d │ %d │\n", "Anzahl", einsen, zweien, dreien, vieren, fuenfen, sechsen);
        System.out.printf("└─────────┴───┴───┴───┴───┴───┴───┘\n");

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
