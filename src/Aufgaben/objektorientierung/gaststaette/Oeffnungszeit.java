package aufgaben.objektorientierung.gaststaette;

public class Oeffnungszeit {

    private String oeffnungszeit;
    private String wochentag;

    public Oeffnungszeit(String wochentag, String oeffnungszeit) {
        setWochentag(wochentag);
        setOeffnungszeit(oeffnungszeit);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder(String.format("%-15s %s", getWochentag(), getOeffnungszeit()));
        if (!(isRuhetag(getOeffnungszeit()))){
            output.append(" Uhr");
        }
        return output.toString();
    }



    //Validierung

    public boolean isWochentag(String wochentag) {
        String regex = "montag|dienstag|mittwoch|donnerstag|freitag|samstag|sonntag";
        if (wochentag.toLowerCase().matches(regex)) {
            return true;
        } else throw new NumberFormatException("Kein gültiger Wochentag");
    }

    public boolean isOeffnungszeit(String oeffnungszeit) {
        String regex = "((0[0-9]|1[0-9]|2[0-3]):[0-5][0-9] - ([0-1][0-9]|2[0-3]):[0-5][0-9])|([rR])uhetag";
        if (oeffnungszeit.matches(regex)) {
            return true;
        } else throw new NumberFormatException("Keine gültige Uhrzeit");
    }

    public boolean isRuhetag(String oeffnungszeit) {
        if (oeffnungszeit.matches("[rR]uhetag")) {
            return true;
        }else return false;
    }

// Getter & Setter

    public String getWochentag() {
        return wochentag;
    }

    public void setWochentag(String wochentag) {
        if (isWochentag(wochentag)) {
            this.wochentag = wochentag;
        }
    }

    public String getOeffnungszeit() {
        return oeffnungszeit;
    }

    public void setOeffnungszeit(String oeffnungszeit) {
        if (isOeffnungszeit(oeffnungszeit)) {
            this.oeffnungszeit = oeffnungszeit;
        }
    }
}
