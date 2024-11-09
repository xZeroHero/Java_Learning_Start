package aufgaben.objektorientierung.a42_ligaverwaltung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class Liga{

    private ArrayList<Mannschaft> tabelle = new ArrayList<>();
    private ArrayList<Spiel> spiele = new ArrayList<>();

    public Liga(Mannschaft[] mannschaften, Spiel[] spiele) {
        addMannschaften(mannschaften);
        addSpiele(spiele);
    }

    public void addMannschaften(Mannschaft[] mannschaften){
        this.tabelle.addAll(Arrays.asList(mannschaften));
        tabelle.sort(Comparator.comparingInt(Mannschaft::getScore));
    }

    public void addSpiele(Spiel[] spiele){
        this.spiele.addAll(Arrays.asList(spiele));
    }




    //Getter & Setter
    public ArrayList<Mannschaft> getTabelle() {
        return tabelle;
    }

    public void setTabelle(ArrayList<Mannschaft> tabelle) {
        this.tabelle = tabelle;
    }

    public ArrayList<Spiel> getSpiele() {
        return spiele;
    }

    public void setSpiele(ArrayList<Spiel> spiele) {
        this.spiele = spiele;
    }
}
