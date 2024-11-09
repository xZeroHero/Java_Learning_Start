package aufgaben.objektorientierung.a41_nerds;

public class Watch extends Article {

    private String battery;


    public Watch(String articleName, double price, String battery) {
        super(articleName, price);
        setBattery(battery);
    }

    public String toString() {
        return String.format("%s\nStromversorgung: %s\n%s Euro", getArticleName(), getBattery(), getPrice());
    }


    public static String binaryTime(String hourBinary, String minuteBinary, String timeFormat){
        int hours = Integer.parseInt(hourBinary, 2);
        if (hours == 0) hours = 12;
        int minutes = Integer.parseInt(minuteBinary, 2);
        isHourFormat(hours);
        isMinuteFormat(minutes);

        return String.format("%02d:%02d %s", hours, minutes, timeFormat);
    }

    public static String binaryTime(String hourBinary, String minuteBinary){
        int hours = Integer.parseInt(hourBinary, 2);
        if (hours == 0) hours = 12;
        int minutes = Integer.parseInt(minuteBinary, 2);
        isHourFormat(hours);
        isMinuteFormat(minutes);

        return String.format("%02d:%02d Uhr", hours, minutes);
    }


    public static void isHourFormat(int hours){ // Checks if >12
        if (hours > 12) throw new NumberFormatException("Keine gültige Eingabe");
    }

    public static void isMinuteFormat(int minutes){ // Checks if >12
        if (minutes > 60) throw new NumberFormatException("Keine gültige Eingabe");
    }



    //Getter & Setter
    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

}
