package aufgaben.objektorientierung.a43_gaststaette;

public class Getraenk extends Lebensmittel {

    private boolean alkoholfrei;

    public Getraenk(String bezeichnung, double preis, boolean alkoholfrei) {
        super(bezeichnung, preis);
        setAlkoholfrei(alkoholfrei);
    }

    @Override
    public String toString() {
        String output = super.toString();
        if (isAlkoholfrei()){
            output += " (alkoholfrei)";
        }
        return output;
    }


    //Getter & Setter

    public boolean isAlkoholfrei() {
        return alkoholfrei;
    }

    public void setAlkoholfrei(boolean alkoholfrei) {
        this.alkoholfrei = alkoholfrei;
    }
}
