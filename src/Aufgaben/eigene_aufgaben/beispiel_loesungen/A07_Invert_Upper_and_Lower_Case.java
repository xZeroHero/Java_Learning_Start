package aufgaben.eigene_aufgaben.beispiel_loesungen;

public class A07_Invert_Upper_and_Lower_Case {

    public static void main(String[] args) {

        String text = "AAAAaaAaAAaAaaaAaAAAaaAaA";
        String output = "";

        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == 'A'){
                output += "a";
            }
            else if ((text.charAt(i) == 'a')){  //if wird nicht unbedingt benötigt, wenn im String nur die beiden Zeichen 'A' und 'a' vorkommen
                output += "A";
            }
        }

        System.out.println(STR."Umgekehrter String: \{output}");

    }

}
