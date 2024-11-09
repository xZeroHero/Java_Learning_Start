package aufgaben.objektorientierung.a43_gaststaette;

import java.util.List;

public class Gaststaette {

    private String name;
    private List<Oeffnungszeit> oeffnungszeitenList;
    private List<Mitarbeiter> mitarbeiterList;
    private List<Gast> gaesteList;
    private Speisekarte speisekarte;

    public Gaststaette(Speisekarte speisekarte) {
        setSpeisekarte(speisekarte);
    }

    public Gaststaette(String name, List<Mitarbeiter> mitarbeiterList, List<Gast> gaesteList, Speisekarte speisekarte, List<Oeffnungszeit> oeffnungszeitenList) {
        setName(name);
        setMitarbeiterList(mitarbeiterList);
        setGaesteList(gaesteList);
        setSpeisekarte(speisekarte);
        setOeffnungszeitenList(oeffnungszeitenList);
    }

    @Override
    public String toString() {
        System.out.println("test");
        StringBuilder output = new StringBuilder(String.format("Gaststaette: %s\n\n", getName()));
        output.append(STR."\{mitarbeiterToString(mitarbeiterList)}\n");
        output.append(STR."\{gaesteToString(gaesteList)}\n");
        output.append(STR."\{speisekarte}\n");
        output.append(oeffnungszeitenToString(oeffnungszeitenList));
        System.out.println("dsdv");
        System.out.println(output);
        return output.toString();

    }


    // Lists to String
    public String mitarbeiterToString(List<Mitarbeiter> mitarbeiterList){
        StringBuilder output = new StringBuilder("Mitarbeiter:\n___________________________________________\n");
        for (Mitarbeiter mitarbeiter : mitarbeiterList){
            output.append(mitarbeiter + "\n");
        }
        return output.toString();
    }

    public String gaesteToString(List<Gast> gaesteList){
        StringBuilder output = new StringBuilder("Stammgäste:\n___________________________________________\n");
        for (Gast gast : gaesteList){
            output.append(gast + "\n");
        }
        return output.toString();
    }

    public String oeffnungszeitenToString(List<Oeffnungszeit> oeffnungszeitenList){
        StringBuilder output = new StringBuilder("Öffnungszeiten:\n___________________________________________\n");
        for (Oeffnungszeit oeffnungszeit : oeffnungszeitenList){
            output.append(oeffnungszeit  + "\n");
        }
        return output.toString();
    }


    // Add & Remove

    public void addMitarbeiter(Mitarbeiter mitarbeiter) {
        mitarbeiterList.add(mitarbeiter);
    }

    public void addGast(Gast gast) {
        gaesteList.add(gast);
    }

    public void removeMitarbeiter(int index) {
        mitarbeiterList.remove(index);
    }

    public void removeGast(int index) {
        gaesteList.remove(index);
    }


    //Getter & Setter

    public List<Mitarbeiter> getMitarbeiterList() {
        return mitarbeiterList;
    }

    public void setMitarbeiterList(List<Mitarbeiter> mitarbeiterList) {
        this.mitarbeiterList = mitarbeiterList;
    }

    public List<Gast> getGaesteList() {
        return gaesteList;
    }

    public void setGaesteList(List<Gast> gaesteList) {
        this.gaesteList = gaesteList;
    }

    public Speisekarte getSpeisekarte() {
        return speisekarte;
    }

    public void setSpeisekarte(Speisekarte speisekarte) {
        this.speisekarte = speisekarte;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Oeffnungszeit> getOeffnungszeitenList() {
        return oeffnungszeitenList;
    }

    public void setOeffnungszeitenList(List<Oeffnungszeit> oeffnungszeitenList) {
        this.oeffnungszeitenList = oeffnungszeitenList;
    }
}
