package aufgaben.objektorientierung.a39_Kunden;

public class Adresse {

    String street;
    String hausnummer;
    String plz;
    String ort;


    public Adresse(String street, String hausnummer, String plz, String ort) {
        setStreet(street);
        setHausnummer(hausnummer);
        setPlz(plz);
        setOrt(ort);
    }

    @Override
    public String toString() {
        String output = "Adresse:\n";
        output += String.format("\tStraße: %s %s\n", getStreet(), getHausnummer());
        output += String.format("\tOrt: %s %s\n",getPlz(), getOrt());
        return output;
    }


    //Validation

    public boolean isPLZ(String plz) {
        if (plz.matches("[0-9]{5}")) return true;
        else throw new NumberFormatException("Ungültige Postleitzahl");
    }

    //Getter & Setter
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        if (isPLZ(plz)) this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
}
