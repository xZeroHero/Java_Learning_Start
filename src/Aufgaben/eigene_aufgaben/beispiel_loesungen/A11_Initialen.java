package aufgaben.eigene_aufgaben.beispiel_loesungen;

public class A11_Initialen {

    public static void main(String[] args) {

        String name = "max kevin Musterman";
        String nameUpperCase = name.toUpperCase();
        String output = "";

        output += nameUpperCase.charAt(0);

        for (int i = 0; i < name.length(); i++){
            if (nameUpperCase.charAt(i) == ' '){
                output += "." + nameUpperCase.charAt(i+1);
            }
        }

        System.out.println(output);


    }

}
