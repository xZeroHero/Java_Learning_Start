package aufgaben.teams_aufgaben;

import java.util.Arrays;

public class A23_Sortieren {

    public static void main(String[] args) {

        int[] zahlen = {-20, 55, 7, 78, 12, 42, 10, -12, 0};
        boolean stop = false;


        while (!stop){
            stop = true;
            for (int i = 0; i < zahlen.length - 1; i++ ){
                if (zahlen[i] > zahlen[i+1]){
                    int temp = zahlen[i];
                    zahlen[i] = zahlen[i+1];
                    zahlen[i+1] = temp;
                    stop = false;
                }
                System.out.println(Arrays.toString(zahlen));
            }
        }
        System.out.println("___________________________________________");
        System.out.println(Arrays.toString(zahlen));

    }

}
