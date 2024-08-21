package aufgaben.teams_aufgaben;

public class A13_CountSpaces {

    public static void main(String[] args) {

        String text = "Ein Text ist ein String ist eine Zeichenkette";
        int counter = 0;

        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == ' '){
                counter++;
            }
        }

        System.out.println(STR."Der Text enthält \{counter} Leerzeichen");
    }

}
