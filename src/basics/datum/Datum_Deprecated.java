package basics.datum;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Datum_Deprecated {

    public static void main(String[] args) {


        //Deprecated:
        Date date = new Date();
        System.out.println(date);


/*         //Unixzeit zählt die vergangenen Sekunden seit dem 01.01.1970, 00:00 Uhr
        System.out.println(date.getTime()); //Unixzeit in ms!

        System.out.println(date.getYear() + 1900);
        System.out.println(date.getMonth() + 1);



        //https:docs.oracle.com/javase/8/docs/api/java/util/Formatter.html#syntax

        System.out.printf("%Td.%Tm.%TY\n", date, date, date);//
        System.out.printf("%2$d %1$d %2$d\n", 123, 4711); // Beispiel mit int
        System.out.printf("%1$Td.%1$Tm.%1$TY\n", date);
        System.out.printf("%1$TH:%1$TM:%1$TS\n", date);
        System.out.printf("%tR Uhr\n", date); // Uhrzeit, 24 h H:M
        System.out.printf("%tT Uhr\n", date); // Uhrzeit, 24 h H:M:S*/


        //

        /* SimpleDateFormat (java.text)
         *
         *  https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/text/SimpleDateFormat.html
         */
        SimpleDateFormat sdf = new SimpleDateFormat("EEE dd.MM.yyyy, HH:mm");
        System.out.println(sdf.format(date));

        /*
         * Calendar (java.util)
         * */

        Calendar c;

        // Datum setzen (Monat: 0 bis 11 !)
        GregorianCalendar datum = new GregorianCalendar(2011, 11, 1); // y,m,d
        GregorianCalendar gc;
        // Datum und Uhrzeit des Systems
        gc = new GregorianCalendar();
        System.out.print(gc.get(Calendar.DAY_OF_MONTH) + ".");
        System.out.print((gc.get(Calendar.MONTH) + 1) + ".");
        System.out.println(gc.get(Calendar.YEAR));

        // Tags des Jahres
        System.out.println(gc.get(Calendar.DAY_OF_YEAR) + ". Tag des Jahres");

        // Wochen
        System.out.println(gc.get(Calendar.DAY_OF_WEEK) + ". Wochentag (So=1,..,Sa=7)");
        System.out.println(gc.get(Calendar.WEEK_OF_YEAR) + ". KW");
        System.out.println(gc.get(Calendar.WEEK_OF_MONTH) + ". Woche des Monats");

        // Uhrzeit
        System.out.print(gc.get(Calendar.HOUR_OF_DAY) + ":");

        // 24 h
        //System.out.print(gc.get(Calendar.HOUR)+":");

        // 12 h
        System.out.print(gc.get(Calendar.MINUTE) + ":");
        System.out.print(gc.get(Calendar.SECOND) + ":");
        System.out.println(gc.get(Calendar.MILLISECOND));

        // Schaltjahr?
        System.out.println("Schaltjahr = " + gc.isLeapYear(2001));

        // rechnen mit Datumsangaben
        gc.add(Calendar.YEAR, -10);

        // toString
        System.out.println(gc);

        // Formatierung mit SimpleDateFormat
        sdf = new SimpleDateFormat("EE dd.MM.yyyy, HH:mm' Uhr'");
        System.out.println(sdf.format(gc.getTime()));
    }


}
