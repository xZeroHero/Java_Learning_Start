package aufgaben.objektorientierung.a35_privatperson;

public class Kundendaten {

    Person person;
    Anschrift rechnungsanschrift;
    Anschrift lieferanschrift;
    Bankdaten bankdaten;

    public Kundendaten(Person person, Anschrift rechnungsanschrift, Anschrift lieferanschrift, Bankdaten bankdaten) {
        setPerson(person);
        setRechnungsanschrift(rechnungsanschrift);
        setLieferanschrift(lieferanschrift);
        setBankdaten(bankdaten);
    }

    @Override
    public String toString(){
        String string = "";
        string += person;
        string += "Rechnungsanschrift:\n";
        string += rechnungsanschrift;
        string += "Lieferanschrift:\n";
        string += lieferanschrift;
        string += bankdaten;

        return string;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Anschrift getRechnungsanschrift() {
        return rechnungsanschrift;
    }

    public void setRechnungsanschrift(Anschrift rechnungsanschrift) {
        this.rechnungsanschrift = rechnungsanschrift;
    }

    public Anschrift getLieferanschrift() {
        return lieferanschrift;
    }

    public void setLieferanschrift(Anschrift lieferanschrift) {
        this.lieferanschrift = lieferanschrift;
    }

    public Bankdaten getBankdaten() {
        return bankdaten;
    }

    public void setBankdaten(Bankdaten bankdaten) {
        this.bankdaten = bankdaten;
    }
}
