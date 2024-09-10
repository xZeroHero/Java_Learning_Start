package aufgaben.objektorientierung.a33_employee;

public class Employee_Validation {

    public static void main(String[] args) {

        String personalnummer1 = "ABC123456";
        String personalnummer2 = "AB123456";
        String personalnummer3 = "ABC12345";

        String regexPersonalnummer = "^[A-Z]{3}\\d{6}$";

        System.out.println("Personalnummer:");
        System.out.println(personalnummer1.matches(regexPersonalnummer));
        System.out.println(personalnummer2.matches(regexPersonalnummer));
        System.out.println(personalnummer3.matches(regexPersonalnummer));

        System.out.println("\n___________\n");

        String birthdate1 = "12.12.2000";
        String birthdate2 = "41.12.2000";
        String birthdate3 = "1.12.2000";

        String regexBirthdate = "(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(\\d{4})";

        System.out.println("Birthdate:");
        System.out.println(birthdate1.matches(regexBirthdate));
        System.out.println(birthdate2.matches(regexBirthdate));
        System.out.println(birthdate3.matches(regexBirthdate));
        System.out.println("\n___________\n");

        String vacation1 = "20";
        String vacation2 = "15";
        String vacation3 = "19";

        String regexVacation = "^[2-9]+[0-9]+$";

        System.out.println("Vacation:");
        System.out.println(vacation1.matches(regexVacation));
        System.out.println(vacation2.matches(regexVacation));
        System.out.println(vacation3.matches(regexVacation));
        System.out.println();

    }

}
