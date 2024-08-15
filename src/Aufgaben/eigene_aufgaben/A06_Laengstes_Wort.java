package aufgaben.eigene_aufgaben;

public class A06_Laengstes_Wort {

    public static void main(String[] args) {

        String text = "Das ist ein Beispieltext";

        int i = 0;
        int endLastWord = 0;
        int counter = 0;
        int tempCounter = 0;

        while (i < text.length()){
            if (text.charAt(i) == ' ' || i + 1 == text.length()){
                tempCounter = (i -1 - endLastWord);
                if (tempCounter > counter){
                    counter = tempCounter;
                }
                endLastWord = i;
            }
            i++;
        }

        System.out.println(counter);


        endLastWord = 0;
        counter = 0;
        tempCounter = 0;


        // For-Loop

/*        for (int x = 0; x < text.length(); x++){
            if (text.charAt(x) == ' ' || x + 1 == text.length()){
                tempCounter = (x -1 - endLastWord);
                if (tempCounter > counter){
                    counter = tempCounter;
                }
                endLastWord = x;
            }
        }

        System.out.println(counter);*/

    }

}
