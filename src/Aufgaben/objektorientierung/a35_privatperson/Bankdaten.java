package aufgaben.objektorientierung.a35_privatperson;

public class Bankdaten {

    String iban;
    String bic;

    public Bankdaten(String iban, String bic) {
        setIban(iban);
        setBic(bic);
    }


    //Validation

    public boolean isIban(String iban) {
        if (iban.matches("[A-Z]{2}[0-9]{20}")) return true;
        else throw new NumberFormatException("Falsche IBAN");
    }

    public boolean isBic(String bic) {
        // Quelle für BIC Format:
        //https://www.westernunion.com/de/de/swift-bic-codes.html
        if (bic.matches("[A-Z]{4}[A-Z]{2}[A-Z0-9]{2}[0-9]{3}")) return true;
        else throw new NumberFormatException("Falsche BIC");
    }

    @Override
    public String toString() {
        return String.format("IBAN: %s\nBIC: %s\n", getIbanSeperated(), getBic());
    }

    // Getter & Setter

    public String getIbanSeperated() {
        String iban = "";
        //IBAN soll mit Leerzeichen an jeder 4. Stelle ausgegeben werden
        for (int i = 0; i < this.iban.length(); i++) {
            iban += this.iban.charAt(i);
            if ((i % 4)  == 3) {
                iban += " ";
            }
        }
        return iban;
    }

    public String getIban(){
        return iban;
    }

    public void setIban(String iban) {
        if (isIban(iban)) this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        if (isBic(bic)) this.bic = bic;
    }
}
