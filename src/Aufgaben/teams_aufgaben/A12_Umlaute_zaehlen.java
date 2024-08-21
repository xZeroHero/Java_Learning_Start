package aufgaben.teams_aufgaben;

public class A12_Umlaute_zaehlen {

    public static void main(String[] args) {

        String text = "Übel wütet derö kaÄhlköpfige Gürtelwürger".toLowerCase();
        int i = 0;
        int aeCounter = 0;
        int ueCounter = 0;
        int oeCounter = 0;



        // If

        /*while (i < text.length()){
            if (text.charAt(i) == 'ä'){
                aeCounter++;
            } else if (text.charAt(i) == 'ü') {
                ueCounter++;
            } else if (text.charAt(i) == 'ö') {
                oeCounter++;
            }
            i++;
        }*/



        //Switch
        while (i < text.length()){
            switch (text.charAt(i)){
                case 'ä':
                    aeCounter++;
                    break;
                case 'ö':
                    oeCounter++;
                    break;
                case 'ü':
                    ueCounter++;
                    break;
            }
            i++;
        }

        System.out.println(STR."Ä: \{aeCounter}\nÖ: \{oeCounter}\nÜ: \{ueCounter}");

    }
}
