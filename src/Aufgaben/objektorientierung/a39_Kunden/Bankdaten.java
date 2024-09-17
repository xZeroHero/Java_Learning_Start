package aufgaben.objektorientierung.a39_Kunden;


public class Bankdaten {

    String iban;
    String bic;

    // Constructor
    public Bankdaten(String iban, String bic) {
        setIban(iban);
        setBic(bic);
    }


    //Validation

    public static boolean isIban(String iban) {
        if (iban.matches("[A-Z]{2}[0-9]{20}")) return true;
        else throw new NumberFormatException("Falsche IBAN");
    }

    public static boolean isBic(String bic) {
        // Quelle für BIC Format:
        //https://www.westernunion.com/de/de/swift-bic-codes.html
        if (bic.matches("[A-Z]{4}[A-Z]{2}[A-Z0-9]{2}[0-9]{3}")) return true;
        else throw new NumberFormatException("Falsche BIC");
    }

    @Override
    public String toString() {
        String output = "Bankdaten:\n";
        output += String.format("\tIBAN: %s\n", getIban());
        output += String.format("\tBIC: %s\n", getBic());
        return output;
    }

    //Getter & Setter
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        if (isIban(iban)) {
            this.iban = iban;
        }
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        if (isBic(bic)) {
            this.bic = bic;
        }
    }
}
