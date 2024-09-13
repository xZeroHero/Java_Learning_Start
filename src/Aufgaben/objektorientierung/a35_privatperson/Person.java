package aufgaben.objektorientierung.a35_privatperson;

public class Person {

    String vorname;
    String nachname;
    String geburtstag;

    public Person(String vorname, String nachname, String geburtstag) {
        setVorname(vorname);
        setNachname(nachname);
        setGeburtstag(geburtstag);
    }


    //Validation

    public boolean isDatum(String datum){
        // Format: dd.mm.yyyy
        if (datum.matches("([0-2][0-9]|3[01])[.](0[0-9]|1[012])[.][0-9]{4}")){
           return true;
        }
        else throw new IllegalArgumentException("Wrong date format");

        }

@Override
    public String toString(){
        return String.format("Name: %s %s\nGeburtstag: %s\n", getVorname(), getNachname(), getGeburtstag());
    }


    // Getter & Setter


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

    public String getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(String geburtstag) {
        if (isDatum(geburtstag)) this.geburtstag = geburtstag;
    }
}
