package aufgaben.datenbanken.db_weinhandel;

public class Wein {

    private int id_wein;
    private String name;
    private int jahr;
    private double price;
    private double inhalt;
    private String region;
    private String typ;

    public Wein() {
    }

    public Wein(String name, int jahr, double price, double inhalt,String region, String typ) {
        this.name = name;
        this.jahr = jahr;
        this.price = price;
        this.inhalt = inhalt;
        this.region = region;
        this.typ = typ;
    }
    //GETTER & SETTER


    public int getId_wein() {
        return id_wein;
    }

    public void setId_wein(int id_wein) {
        this.id_wein = id_wein;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInhalt() {
        return inhalt;
    }

    public void setInhalt(double inhalt) {
        this.inhalt = inhalt;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }
}
