package aufgaben.verzweigungen;

public class A15_Tueren_von_Durin {

    public static void main(String[] args) {

        String durin = "sprich freund und tritt ein";
        String output = "";

        output += durin.toUpperCase().charAt(0);

        for (int i = 1; i < durin.length(); i++){
            if (durin.charAt(i) == ' '){
                output += " " + durin.toUpperCase().charAt(i+1);
                i++;
            }
            else {
                output += durin.charAt(i);
            }
        }

        System.out.println(output);


        //Spacer
        System.out.println("\n____________________\n");



        output = "";

        int CharAsInt = durin.charAt(0) - 32;
        char UpperCase = (char) CharAsInt;
        output += UpperCase;

        for (int i = 1; i < durin.length(); i++){
            if (durin.charAt(i) == ' '){
                CharAsInt = durin.charAt(i+1) - 32;
                UpperCase = (char) CharAsInt;
                output += " " + UpperCase;
                i++;
            }
            else {
                output += durin.charAt(i);
            }
        }

        System.out.println(output);
    }

}
