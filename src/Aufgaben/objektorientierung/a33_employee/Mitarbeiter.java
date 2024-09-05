package aufgaben.objektorientierung.a33_employee;

public class Mitarbeiter {

    String name;
    String personalnummer;
    String geburtsdatum;
    int urlaubstage;
    int genommeneUrlaubstage;
    int resturlaub;

//    String[] mitarbeiter = new String[6];
    // name = Name
    // personalnummer = personalnummer
    // geburtsdatum = geburtsdatum
    // urlaubstage = urlaubstage
    // genommeneUrlaubstage = genommeneUrlaubstage
    // resturlaub = resturlaub


    public Mitarbeiter(String name, String personalnummer, String geburtsdatum, int urlaubstage){
         setName(name);
         setPersonalnummer(personalnummer);
         setGeburtsdatum(geburtsdatum);
         setUrlaubstage(urlaubstage);
    }


    public void ausgabe(){
        System.out.printf("%s (%s), geboren am %s\nJahresurlaub: %s\ngenommene Tage: %s\nResturlaub: %s\n", name, personalnummer, geburtsdatum, urlaubstage, genommeneUrlaubstage, resturlaub);
    }

    public boolean takeUrlaubstage(int days){

        if (getResturlaubstage() > days){
            setRestUrlaubstage(getResturlaubstage() - days);
            setGenommeneUrlaubstage();
            return true;
        }
        else {
            System.out.println("Keine freien Urlaubstage Tage mehr verfügbar! Verfügbarer Urlaub: " + getResturlaubstage());
            return false;
        }
    }



    //Standard Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPersonalnummer(String personalnummer) {
        this.personalnummer = personalnummer;
    }

    public void setGeburtsdatum(int day, int month, int year) {
        this.geburtsdatum = String.format("%02d.%02d.%04d", day, month, year);
    }
    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public void setUrlaubstage(int urlaubstage) {
        this.urlaubstage = urlaubstage;
        setRestUrlaubstage(urlaubstage);
    }


    public void setGenommeneUrlaubstage() {
        this.genommeneUrlaubstage = getUrlaubstage() - getResturlaubstage();
    }

    public void setRestUrlaubstage(int restUrlaubstage) {
        this.resturlaub = restUrlaubstage;


    }

    // _____________________________________________________________________________________________________________

    //Standard Getter
    public String getName() {
        return name;
    }

    public String getPersonalnummer() {
        return personalnummer;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public int getUrlaubstage() {
        return urlaubstage;
    }
    public int getGenommeneUrlaubstage() {
        setGenommeneUrlaubstage();
        return genommeneUrlaubstage;
    }
    public int getResturlaubstage() {
        return resturlaub;
    }


}
