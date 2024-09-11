package aufgaben.objektorientierung.a35_privatperson;

public class Anschrift {

    String street;
    String hausnummer;
    String postleitzahl;
    String ort;

    public Anschrift(String street, String hausnummer, String postleitzahl, String ort) {
        setStreet(street);
        setHausnummer(hausnummer);
        setPostleitzahl(postleitzahl);
        setOrt(ort);
    }


@Override
    public String toString(){
        return String.format("Adresse: %s %s\nOrt: %s %s\n", getStreet(), getHausnummer(), getPostleitzahl(), getOrt());
    }

    // Getter & Setter

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }
}
