package aufgaben.objektorientierung.a39_Kunden;

public class Firma {

    String firmenname;
    String ust_id;


    public Firma(String firmenname, String ust_id) {
        setFirmenname(firmenname);
        setUst_id(ust_id);
    }

    @Override
    public String toString() {
        String output = String.format("Firma: %s\n", getFirmenname());
        output += String.format("\tUmsatzsteuer-Identifikationsnummer: %s\n", getUst_id());
        return output;
    }

    //Getter & Setter
    public String getFirmenname() {
        return firmenname;
    }

    public void setFirmenname(String firmenname) {
        this.firmenname = firmenname;
    }

    public String getUst_id() {
        return ust_id;
    }

    public void setUst_id(String ust_id) {
        this.ust_id = ust_id;
    }
}
