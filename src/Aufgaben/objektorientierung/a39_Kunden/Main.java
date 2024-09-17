package aufgaben.objektorientierung.a39_Kunden;

public class Main {
    public static void main(String[] args) {

        Bankdaten bankdatenPrivat = new Bankdaten("DE12345678901234568890", "AAAABB11222");
        Adresse adressePrivat = new Adresse("Schulweg", "22d", "27777", "Ganderkesee");
        Person person = new Person("Max", "Mustermann");

        Privatkunde privatkunde = new Privatkunde("248532439", bankdatenPrivat, adressePrivat, person);

        System.out.println(privatkunde);

        System.out.println("\n=======================================\n");

        Bankdaten bankdatenBusiness = new Bankdaten("DE12345678901234568890", "AAAABB11222");
        Adresse adresseBusiness = new Adresse("Schulweg", "22d", "27777", "Ganderkesee");
        Firma firma = new Firma("Unlimited ltd.", "aff_234_1234");

        Geschaeftskunde geschaeftskunde = new Geschaeftskunde("378149534", bankdatenBusiness, adresseBusiness, firma);

        System.out.println(geschaeftskunde);


    }
}
