package aufgaben.teams_aufgaben;

public class A20_Prozente {

    public static void main(String[] args) {

        int[] prozentzahlen = {45, 0, -12, 75, 100, 27, 123, 89};
        int maxProzent = 100; //%
        int i = 0;


        for (int prozent : prozentzahlen){
            System.out.printf("%2d:%5d ", i, prozent);
            if (prozent >= 0 && prozent <= maxProzent){
                System.out.printf("gültig\n");
            } else if (prozent < 0) {
                System.out.printf("ungültig (negativer Wert)\n");
            }else if (prozent > 0) {
                System.out.printf("ungültig (größer als %d)\n",maxProzent);
            }
            i++;
        }

    }

}
