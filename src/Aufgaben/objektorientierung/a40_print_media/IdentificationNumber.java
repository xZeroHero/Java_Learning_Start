package aufgaben.objektorientierung.a40_print_media;

public class IdentificationNumber {

    private String number;
    private String standard;


    public IdentificationNumber(String number, String standard) {
        if (standard.equalsIgnoreCase("issn")) {
            isISSN(number);
        } else if (standard.equalsIgnoreCase("isbn")) {
            isISBN(number);
        } else throw new IllegalArgumentException("Keine ISBN oder ISSN");

        setNumber(number);
        setStandard(standard.toUpperCase());

    }

    @Override
    public String toString() {
        return String.format("%s: %s\n", getStandard(), getNumber());
    }

    public void isISSN(String issn) {
        String regex = "[0-9]{4}-[0-9]{4}";
        if (!(issn.matches(regex)))
            throw new NumberFormatException("Keine gültige ISSN");

    }

    public void isISBN(String isbn) {
        String regex = "(978|979)-[0-9]{10}";
        if (!(isbn.matches(regex)))
            throw new NumberFormatException("Keine gültige ISBN");
    }


    //Getter & Setter
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
