package aufgaben.verzweigungen;

public class A15_Tueren_von_Durin {

    public static void main(String[] args) {

        String durin = "sprich freund und tritt ein";
        String output = "";


        output += durin.toUpperCase().charAt(0);

        for (int i = 1; i < durin.length(); i++){
            if (durin.charAt(i-1) == ' '){
                output += durin.toUpperCase().charAt(i);
            }
            else {
                output += durin.charAt(i);
            }
        }

        System.out.println(output);


        //Spacer
        System.out.println("\n____________________\n");




        output = "";

        char upperCase = (char) (durin.charAt(0) - 32);
        output += upperCase;

        for (int i = 1; i < durin.length(); i++){
            if (durin.charAt(i) == ' '){
                upperCase = (char) (durin.charAt(i+1) - 32);
                output += " " + upperCase;
                i++;
            }
            else {
                output += durin.charAt(i);
            }
        }

        System.out.println(output);
    }

}
