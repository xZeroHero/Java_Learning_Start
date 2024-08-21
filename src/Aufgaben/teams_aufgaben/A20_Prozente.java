package aufgaben.teams_aufgaben;

public class A20_Prozente {

    public static void main(String[] args) {

        int[] prozentzahlen = {45, 0, -12, 75, 100, 27, 123, 89};
        int maxProzent = 100; //%
        int i = 0;


        for (int prozent : prozentzahlen){
            if (prozent >= 0 && prozent <= maxProzent){
                System.out.printf("%2d: %5d gültig\n", i, prozent);
            } else if (prozent < 0) {
                System.out.printf("%2d: %5d ungültig (negativer Wert)\n", i, prozent);
            }else if (prozent > 0) {
                System.out.printf("%2d: %5d ungültig (größer als %d)\n", i, prozent, maxProzent);
            }
            i++;
        }

    }

}
