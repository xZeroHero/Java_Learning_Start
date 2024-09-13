package aufgaben.objektorientierung.a30_banking;

public class IBAN_Validation {


    public static void main(String[] args) {


        String iban1 = "DE60500105178329798164";
        String iban2 = "D69500105173166534659";
        String iban3 = "DE9350010577464838967";

        String regex = "^[A-Z]{2}\\d{20}$";

        System.out.println(iban1.matches(regex));
        System.out.println(iban2.matches(regex));
        System.out.println(iban3.matches(regex));

    }
}
