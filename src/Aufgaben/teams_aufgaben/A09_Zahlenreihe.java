package aufgaben.teams_aufgaben;

public class A09_Zahlenreihe {

    public static void main(String[] args) {

        /*Aufgabe 1*/
        /* Zahlenreihe: 3 7 11 15 19 */


        /*int i = 3;
        while (i <= 19){
            System.out.print(STR."\{i} ");
            i += 4;
        }*/

        /*Aufgabe 2*/
        /*Zahlenreihe: 8 16 32 64 128 256 */

        /*int i = 8;
        while (i <= 256) {
            System.out.print(STR."\{i} ");
            i *= 2;
        }*/


        /*Aufgabe 3*/
        /*Zahlenreihe: 243, 81, 27, 9, 3*/

        /*int i = 243;
        while (i>=3){
            System.out.print(STR."\{i} ");
            i /= 3;
        }*/

        /*Aufgabe 4*/
        /*Zahlenreihe: 3, 2, 1, 0, -1, -2, -3*/

        /*int i = 3;
        while (i >=-3){
            System.out.print(STR."\{i} ");
            i--;
        }*/

        /*Bonusaufgabe*/
        /* Zahlenreihe: 1, 0, 1, 0, 1, 0, 1*/

        int i = 1;
        while (i <= 7){
            System.out.print(STR."\{i % 2} ");
            i++;
        }

    }

}
