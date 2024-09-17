package aufgaben.objektorientierung.a40_print_media;

public class IdentificationNumber {

    private String number;
    private String standard;


    public IdentificationNumber(String number, String standard) {
        setNumber(number);
        setStandard(standard);
    }



    public boolean isISSN(String issn){
        //TODO implement
        return true;
    }
    public boolean isISBN(String isbn){
        //TODO implement
        return true;
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
