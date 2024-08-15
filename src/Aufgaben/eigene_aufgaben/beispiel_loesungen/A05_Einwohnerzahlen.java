package aufgaben.eigene_aufgaben.beispiel_loesungen;

public class A05_Einwohnerzahlen {

    public static void main(String[] args) {

        int einwohner = 1000;
        double growthRate = 1.02;
        int years = 0;

        while (einwohner < 10_000){
            einwohner *= growthRate;
            years++;
        }

        System.out.println(STR."Nach \{years} Jahren ist die Einwohnerzahl bei \{einwohner}");

    }

}
