package aufgaben.objektorientierung.a39_Kunden;

public class Privatkunde extends Kunde{

    Person person;
    Adresse adresse;

    public Privatkunde(String kundennummer, Bankdaten bankdaten, Adresse adresse, Person person) {
        super(kundennummer, bankdaten);
        setPerson(person);
        setAdresse(adresse);
    }


    @Override
    public String toString() {
        String output = "Privatkunde:\n";
        output += getPerson();
        output += getAdresse();
        output += super.toString();
        return output;
    }

    //Getter & Setter
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
