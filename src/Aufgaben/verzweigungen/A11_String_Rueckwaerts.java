package aufgaben.verzweigungen;

import java.util.Scanner;

public class A11_String_Rueckwaerts {

    public static void main(String[] args) {

        // Ohne Methode
        /*String text = "Ein Text";
        int i = text.length() - 1;

        while (i >= 0){
            System.out.print(text.charAt(i));
            i--;
        }
        System.out.println();*/



        System.out.println("Text, der rückwärts ausgegeben werden soll: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        System.out.println(reversedString(text));


    }

    public static String reversedString(String string){
        String reversedString = "";

        for (int i = string.length() -1 ; i >= 0; i--){
            reversedString = reversedString + string.charAt(i);
        }

        return reversedString;
    }

}
