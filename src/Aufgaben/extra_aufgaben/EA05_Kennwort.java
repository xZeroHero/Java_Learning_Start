package aufgaben.extra_aufgaben;

public class EA05_Kennwort {

    public static void main(String[] args) {
        String passwort = "!xBacrdfh";

        //Checks
        int anzahlZiffern = 0;
        int anzahlUpperCase = 0;
        int anzahlLowerCase = 0;
        int anzahlSonderzeichen = 0;

        boolean ziffern = false;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean sonderzeichen = false;
        boolean sonderbedingung = false; //entweder eine Zahl oder ein Buchstabe in dem Passwort (nicht an erster und letzter Stelle)
        boolean charIsSonderzeichen = false;


        if (passwort.length() <= 8){
            System.out.println("Passwort ist zu kurz. Passwort muss mindestens 8 Zeichen lang sein.");
        }
        else if (passwort.contains(" ")) {
            System.out.println("Passwort darf keine Leerzeichen enthalten");
        }
        else {
            for (int i = 0; i < passwort.length(); i++){
                charIsSonderzeichen = false;
                char currentChar = passwort.charAt(i);
                anzahlZiffern += Character.isDigit(currentChar) ? 1 : 0;
                anzahlLowerCase += Character.isLowerCase(currentChar) ? 1 : 0;
                anzahlUpperCase += Character.isUpperCase(currentChar) ? 1 : 0;
                if (!Character.isDigit(currentChar) && !Character.isLetter(currentChar)){
                    anzahlSonderzeichen++;
                    charIsSonderzeichen = true;
                }
                if (i != 0 && i != passwort.length()-1 && (Character.isDigit(currentChar) || charIsSonderzeichen)){
                    sonderbedingung = true;
                }

            }

            //Bedingen werden überprüft
            ziffern = anzahlZiffern >= 2;
            upperCase = anzahlUpperCase >=1;
            lowerCase = anzahlLowerCase >=1;
            sonderzeichen = anzahlSonderzeichen >=1;

            if (ziffern && upperCase && lowerCase && sonderzeichen && sonderbedingung){
                System.out.println("Das eingegebene Passwort entspricht den Kriterien");
            }
            else {
                System.out.println("Das eingegebene Passwort entspricht nicht den Kriterien:");
                if (!ziffern) System.out.println("Mindestens 2 Ziffern");
                if (!upperCase) System.out.println("Mindestens 1 Großbuchstaben");
                if (!lowerCase) System.out.println("Mindestens 1 Kleinbuchstaben");
                if (!sonderzeichen) System.out.println("Mindestens 1 Sonderzeichen");
                if (!sonderbedingung) System.out.println("Mindestens 1 Sonderzeichen oder Ziffer muss sich im Passwort befinden");

            }
        }



    }

}
