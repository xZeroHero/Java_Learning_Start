package aufgaben.objektorientierung.a40_print_media;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Magazin extends PrintMedia {

    private int releaseCycle;
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private Date latestRelease;


    public Magazin(String name, Publisher publisher, IdentificationNumber identificationNumber, double price, int releaseCycle) {
        super(name, publisher, identificationNumber, price);
        setReleaseCycle(releaseCycle);

    }

    @Override
    public String toString() {
        String output = String.format("%s", super.toString());
        if (getReleaseCycle() == 30) {
            output += "Erscheint monatlich";
        } else output += String.format("Erscheint alle %d Tage\n", getReleaseCycle());
        return output;
    }

    //TODO implement methods:

    public String getNextReleases(/*String latestRelease*/) {
        Calendar c = Calendar.getInstance();
        c.setTime(latestRelease);
        System.out.println("Letzter Release:" + dateFormat.format(c.getTime()));
        c.add(Calendar.DATE, getReleaseCycle());
        return dateFormat.format(c.getTime());

//        return lastRelease;
    }

    public void setLatestRelease(int YYYY, int MM, int DD) {
        int day = DD;
        int month = MM - 1;
        int year = YYYY - 1900;
        this.latestRelease = new Date(year, month, DD);
    }


    //Getter & Setter

    public int getReleaseCycle() {
        return releaseCycle;
    }

    public void setReleaseCycle(int releaseCycle) {
        this.releaseCycle = releaseCycle;
    }


}
