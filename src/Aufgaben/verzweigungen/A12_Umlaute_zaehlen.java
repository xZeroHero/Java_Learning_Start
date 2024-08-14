package aufgaben.verzweigungen;

public class A12_Umlaute_zaehlen {

    public static void main(String[] args) {

        String text = "Übel wütet derö kaÄhlköpfige Gürtelwürger".toUpperCase();
        int i = 0;
        int aeCounter = 0;
        int ueCounter = 0;
        int oeCounter = 0;



        // If

        /*while (i < text.length()){
            if (text.charAt(i) == 'Ä'){
                aeCounter++;
            } else if (text.charAt(i) == 'Ü') {
                ueCounter++;
            } else if (text.charAt(i) == 'Ö') {
                oeCounter++;
            }
            i++;
        }*/



        //Switch
        while (i < text.length()){
            switch (text.charAt(i)){
                case 'Ä':
                    aeCounter++;
                    break;
                case 'Ö':
                    oeCounter++;
                    break;
                case 'Ü':
                    ueCounter++;
                    break;
            }
            i++;
        }

        System.out.println(STR."Ä: \{aeCounter}\nÖ: \{oeCounter}\nÜ: \{ueCounter}");

    }
}
