package aufgaben.eigene_aufgaben.beispiel_loesungen;

public class A10_Auf_und_Abrunde {

    public static void main(String[] args) {

        double input = 3.14;
        boolean output;
        int inputInt = (int) input;

        if (input - inputInt >= 0.5){
            output = false;
        }
        else {
            output = true;
        }

        System.out.println(output);

    }

}
