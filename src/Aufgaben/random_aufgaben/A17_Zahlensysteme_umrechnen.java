package aufgaben.random_aufgaben;

import java.util.Scanner;


public class A17_Zahlensysteme_umrechnen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Dezimal in Binär
      /*int dezimalzahl = input.nextInt();
        String binary = "";

        while (dezimalzahl > 0){
            binary = (dezimalzahl % 2) + binary;
            dezimalzahl /= 2;
        }

        System.out.println(binary);*/



        // Binär zu Dezimal

        String binary = "11010011";
        int dezimalzahl = 0;
        int power = 0;
        int currentValue = 0;

        for (int i = binary.length()-1; i >= 0; i--){
            currentValue = Character.getNumericValue(binary.charAt(i));
            dezimalzahl += currentValue * (int) Math.pow(2, power);
            power++;
        }

        System.out.println(dezimalzahl);



    }

}
