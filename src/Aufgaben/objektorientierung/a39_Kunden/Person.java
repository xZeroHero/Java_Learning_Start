package aufgaben.objektorientierung.a39_Kunden;

public class Person {

    String vorname;
    String nachname;


    public Person(String vorname, String nachname) {
        setVorname(vorname);
        setNachname(nachname);
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s\n", getVorname(), getNachname());
    }

    //Getter & Setter
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}
