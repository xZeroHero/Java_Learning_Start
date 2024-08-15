package aufgaben.eigene_aufgaben;

public class A01_Chars_zaehlen {

    public static void main(String[] args) {

        //Beispiellösung 1 If-Statement

        String text = "AaaAaaAabAbaaBbaBabbBabBaaAAA";

        int AaCounter = 0;
        int AACounter = 0;
        int AbCounter = 0;

        int i = 0;


        while (i < text.length()){

            if (i +1 <text.length()){
                if (text.charAt(i) == 'A'){
                    if (text.charAt(i+1) == 'a'){
                        AaCounter++;
                    } else {
                        if (text.charAt(i+1) == 'A') {
                            AACounter++;
                        } else {
                            if (text.charAt(i+1) == 'b'){
                                AbCounter++;
                            }
                        }
                    }
                }
            }
            i++;
        }

        System.out.println(STR."Aa: \{AaCounter}\nAA: \{AACounter}\nAb: \{AbCounter}");


        System.out.println("_____________________________");


        //Beispiellösung 2 Switch


        AaCounter = 0;
        AACounter = 0;
        AbCounter = 0;

        i = 0;

        while (i < text.length()){
            if (text.charAt(i) == 'A' && i +1 <text.length() ) {
                switch (text.charAt(i+1)) {
                    case 'a':
                        AaCounter++;
                        break;
                    case 'A':
                        AACounter++;
                        break;
                    case 'b':
                        AbCounter++;
                        break;
                }
            }
            i++;
        }

        System.out.println(STR."Aa: \{AaCounter}\nAA: \{AACounter}\nAb: \{AbCounter}");

    }

}
