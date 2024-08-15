package aufgaben.eigene_aufgaben.beispiel_loesungen;

public class A02_Gerade_Ziffern {

    public static void main(String[] args) {

        String text = "123542938087956965349343862304396412603464";

        int i = 0;
        int counter = 0;

        while (i < text.length()){
            if (text.charAt(i) % 2 == 0){
                counter++;
            }
            i++;
        }

        System.out.println(STR."Gerade Ziffern: \{counter}");

    }

}
