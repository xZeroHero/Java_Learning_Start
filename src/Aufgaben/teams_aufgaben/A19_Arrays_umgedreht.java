package aufgaben.teams_aufgaben;

import java.util.Arrays;

public class A19_Arrays_umgedreht {

    public static void main(String[] args) {

        int[] zahlen = {4,7,1,3,5};
        int[] zahlenInverted = new int[zahlen.length];
        int lenght = zahlen.length-1;

        for (int i : zahlen){
            zahlenInverted[lenght] = i;
            lenght--;
        }

        System.out.println(Arrays.toString(zahlenInverted));


    }

}
