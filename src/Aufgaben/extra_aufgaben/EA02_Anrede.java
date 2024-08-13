package aufgaben.extra_aufgaben;

import java.util.Scanner;

public class EA02_Anrede {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie ist ihr Vorname: ");
        String firstName = input.nextLine();

        System.out.println("Wie ist ihr Nachname: ");
        String lastName = input.nextLine();

        System.out.println("Titel (Leer lassen falls kein Titel):");
        String title = input.nextLine();

        System.out.println("Wie alt sind sie?: ");
        int age = input.nextInt(); input.nextLine();

        System.out.println("Geschlecht (weiblich = true, männlich = false):");
        boolean gender = input.nextBoolean();

        if (age <= 18){
            System.out.println(STR." Hallo \{firstName}");
        }
        else {
            String anrede = gender ? "Sehr geehrte Frau" : "Sehr geehrter Herr";
            System.out.println(STR."\{anrede} \{title} \{lastName}");
        }



    }

}
