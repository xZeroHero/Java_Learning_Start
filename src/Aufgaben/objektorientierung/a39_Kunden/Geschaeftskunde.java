package aufgaben.objektorientierung.a39_Kunden;

public class Geschaeftskunde extends Kunde {

    Firma firma;
    Adresse adresse;

    public Geschaeftskunde(String kundennummer, Bankdaten bankdaten, Adresse adresse, Firma firma) {
        super(kundennummer, bankdaten);
        setFirma(firma);
        setAdresse(adresse);
    }

    @Override
    public String toString() {
        String output = "Firmenkunde:\n";
        output += getFirma();
        output += getAdresse();
        output += super.toString();
        return output;
    }

    //Getter & Setter
    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
