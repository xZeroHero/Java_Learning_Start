package aufgaben.extra_aufgaben;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EA06_Magische_Quadrate {

    public static void main(String[] args) {

        int side = 5;
        int middle = side / 2;
        int highestNumber = side * side;

        int[][] quadrat = new int[side][side];

        System.out.println(middle);
        int xAxis = middle;
        int yAxis = middle + 1;
        boolean besetzt;

        for (int i = 1; i <= highestNumber; i++) {
            besetzt = false;

            if (quadrat[yAxis][xAxis] == 0) {
                quadrat[yAxis][xAxis] = i;
            } else {
                do {
                    if (yAxis <= side - 2) yAxis++;
                    else yAxis = 0;
                    if (xAxis > 0) xAxis--;
                    else xAxis = side - 1;
                } while (quadrat[yAxis][xAxis] != 0);
                quadrat[yAxis][xAxis] = i;
            }

            if (yAxis <= side - 2) yAxis++;
            else yAxis = 0;
            if (xAxis <= side - 2) xAxis++;
            else xAxis = 0;

        }

        for (int[] y : quadrat) {
            for (int x : y) {
                System.out.printf(" %3d ", x);
            }
            System.out.println();
        }

        //Spacer
        System.out.println("\n__________________________\n");

        //schönere Ausgabe

        String horizontalLines = "├";
        String topLine = "┌";
        String bottomLine = "└";

        for (int i = 0; i < side; i++){
            for (int j = 0; j <5; j++){
                horizontalLines += "─";
                topLine += "─";
                bottomLine += "─";
            }
            if (i != side-1){
                horizontalLines += "┼";
                topLine += "┬";
                bottomLine += "┴";
            }
        }
        horizontalLines += "┤";
        topLine += "┐";
        bottomLine += "┘";


        System.out.println(topLine);
        for (int i = 0; i< side; i++) {
            System.out.printf("│");
            for (int j = 0; j< side; j++) {
                System.out.printf(" %3d │", quadrat[i][j]);
            }
            System.out.println();
            if (i < side-1) {
                System.out.println(horizontalLines);
            }
            else System.out.println(bottomLine);
        }




//Backup
/*
        System.out.println(topLine);
        for (int[] y : quadrat) {
            System.out.printf("│");
            for (int x : y) {
                System.out.printf(" %3d │", x);
            }
            System.out.println();
            System.out.println(horizontalLines);
        }
        System.out.println(bottomLine);*/

    }

}
