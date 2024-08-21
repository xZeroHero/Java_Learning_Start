package aufgaben.teams_aufgaben;

import java.util.Scanner;

public class A16_Palindrom {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        String textNoSpaces = text.replaceAll("\\W", ""); // ersetzt alle "non-words" (\\W) mit einem leeren Zeichen
        int middle = textNoSpaces.length() / 2;
        String textEnd = "";
        String textStart = "";
        String answer = "";

        // Neuer String von index 0 bis zur Mitte
        textStart = textNoSpaces.substring(0, middle);


        // Bei einer geraden Anzahl a n Zeichen muss die Mitte angepasst werden
        if (textNoSpaces.length() % 2 == 0){
            middle -= 1;
        }

        // Zeichen der hinteren Hälfte des Strings werden umgedreht
        for (int i = textNoSpaces.length()-1; i > middle; i--) {
            textEnd += textNoSpaces.charAt(i);
        }



        if (textStart.equalsIgnoreCase(textEnd)){
            answer = "ist ein Palindrom";
        }
        else {
            answer = "ist kein Palindrom";
        }


        System.out.println(STR."\"\{text}\" \{answer}");


    }

}
