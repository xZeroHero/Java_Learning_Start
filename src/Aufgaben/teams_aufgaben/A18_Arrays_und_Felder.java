package aufgaben.teams_aufgaben;

public class A18_Arrays_und_Felder {

    public static void main(String[] args) {

        //Aufgabe 1
        int[] numerischeWerte = new int[]{1,3};
        int ergebnis = 0;

        for (int i : numerischeWerte){
            ergebnis += i;
        }

        System.out.println(STR."Ergebnis: \{ergebnis}");


        //Spacer
        System.out.println("\n______________________________\n");




        //Aufgabe 2
        int [] minMaxWerte = new int[]{1,2,3,4,-12352239,5,10000};
        /*int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;*/

        int minValue = minMaxWerte[0];
        int maxValue = minMaxWerte[0];

        for (int i : minMaxWerte){
            if (i > maxValue) maxValue = i;
            if (i < minValue) minValue = i;
        }


        System.out.println(STR."Kleinter Wert: \{minValue}\nGrößter Wert \{maxValue}");


        //Spacer
        System.out.println("\n______________________________\n");




        //Aufgabe 3

        String[] words = new String[]{"Schuhe", "sommer", "pzza"};
        String wordToFind = "Pizza";
        boolean answer = false;
        int i = 0;

/*        for (String word : words){
            if (word.equalsIgnoreCase("pizza")) {
                answer = true;
                //break;
            }
        }*/

        while (i < words.length && answer == false){
            String currentWord = words[i];
            if (currentWord.equalsIgnoreCase(wordToFind)) answer = true;
            i++;
        }

        if (answer){
            System.out.println(STR."Das Wort \{wordToFind} ist im Array enthalten");
        }
        else {
            System.out.println(STR."Das Wort \"\{wordToFind}\" ist nicht im Array enthalten");
        }


    }

}
