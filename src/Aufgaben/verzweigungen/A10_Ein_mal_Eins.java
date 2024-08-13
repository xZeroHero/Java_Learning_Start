package Aufgaben.verzweigungen;

public class A10_Ein_mal_Eins {

    public static void main(String[] args) {


        /*Aufgabe 1*/

        /*int i = 1;
        while (i <= 10){
            System.out.println(STR."\{i} x 5 = \{i * 5}");
            i++;
        }*/



        /*Aufgabe 2*/

        /*int x = 1;
        int y = 1;

        while (x <= 10){
            y = 1;
            while (y <= 10){
                System.out.printf("%2d x %2d = %3d\n", y, x, y*x);
                y++;
            }
            System.out.println("_______________");
            x++;
        }*/



        /* Aufgabe 3*/
        int x = 1;
        int y = 1;

        // Für die Achsenbeschriftung oben
        System.out.print("\t\t");
        while (y <= 10){
            System.out.printf("%3d ", y*x);
            y++;
        }
        System.out.println();
        System.out.println();
        while (x <= 10){
            y = 1;
            System.out.printf("%3d \t", x);  //Achsenbeschriftung links
            while (y <= 10){
                System.out.printf("%3d ", y*x);
                y++;
            }
            System.out.println();
            x++;
        }




        // Ohne die Achensbeschriftung

        /*while (x <= 10){
            y = 1;
            while (y <= 10){
                System.out.printf("%3d ", y*x);
                y++;
            }
            System.out.println();
            x++;
        }*/










    }

}
