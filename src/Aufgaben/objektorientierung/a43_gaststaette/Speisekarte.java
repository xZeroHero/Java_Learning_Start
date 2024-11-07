package aufgaben.objektorientierung.gaststaette;

import java.util.LinkedList;
import java.util.List;

public class Speisekarte {

    private List<Lebensmittel> speisen;
    private List<Lebensmittel> getraenke;

    public Speisekarte(List<Lebensmittel> speisen, List<Lebensmittel> getraenke) {
        setSpeisen(speisen);
        setGetraenke(getraenke);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Speisekarte:\n___________________________________________\n");
        output.append(speisekarteToString(speisen));
        output.append("\n___________________________________________\n");
        output.append(getraenkekarteToString(getraenke));
        output.append("___________________________________________\n");

        return output.toString();
    }


    public String speisekarteToString(List<Lebensmittel> speisen) {
        StringBuilder output = new StringBuilder("Speisen:\n");
        for (Lebensmittel speise : speisen) {
            output.append(speise + "\n");
        }
        return output.toString();
    }

    public String getraenkekarteToString(List<Lebensmittel> getraenke) {
        StringBuilder output = new StringBuilder("Getränke:\n");
        for (Lebensmittel getraenk : getraenke) {
            output.append(getraenk+ "\n");
            System.out.println();
        }
        return output.toString();
    }



    // Add & Remove

    public void addGetraenk(Lebensmittel getraenk){
        getraenke.add(getraenk);
    }

    public void addSpeise(Lebensmittel speise){
        getraenke.add(speise);
    }

    //Getter & Setter


    public List<Lebensmittel> getSpeisen() {
        return speisen;
    }

    public void setSpeisen(List<Lebensmittel> speisen) {
        this.speisen = speisen;
    }

    public List<Lebensmittel> getGetraenke() {
        return getraenke;
    }

    public void setGetraenke(List<Lebensmittel> getraenke) {
        this.getraenke = getraenke;
    }
}
