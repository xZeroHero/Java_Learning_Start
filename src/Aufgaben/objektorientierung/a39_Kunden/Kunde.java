package aufgaben.objektorientierung.a39_Kunden;

public abstract class Kunde {

    private String kundennummer;
    private Bankdaten bankdaten;




    public Kunde(String kundennummer, Bankdaten bankdaten) {
        setKundennummer(kundennummer);
        setBankdaten(bankdaten);
    }

    @Override
    public String toString() {
        String output = "";
        output+= String.format("Kundennummer: %s\n", getKundennummer());
        output+= getBankdaten();
        return output;

    }

    //Getter & Setter
    public String getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(String kundennummer) {
        this.kundennummer = kundennummer;
    }

    public Bankdaten getBankdaten() {
        return bankdaten;
    }

    public void setBankdaten(Bankdaten bankdaten) {
        this.bankdaten = bankdaten;
    }

}
