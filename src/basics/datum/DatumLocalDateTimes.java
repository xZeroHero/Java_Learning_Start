package basics.datum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DatumLocalDateTimes {

    public static void main(String[] args) {


/*        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());*/


        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate date = LocalDate.of(2022, 9, 15);
        System.out.println(date);

        String eingabe = "05.02.2022";
        DateTimeFormatter dtf;
        dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy"); //05.02.2022
        dtf = DateTimeFormatter.ofPattern("dd MM 'bla' yyy"); //12 11 bla 2024
        dtf = DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy"); //Dienstag 12.11.2024
        dtf = DateTimeFormatter.ofPattern("EE dd.MM.yyyy"); //Di. 12.11.2024
        dtf = DateTimeFormatter.ofPattern("EEEE, dd.MMM yyyy"); //Dienstag, 12.Nov. 2024
        dtf = DateTimeFormatter.ofPattern("EEEE, dd.MMMM yyyy"); //Dienstag, 12.November 2024
        dtf = DateTimeFormatter.ofPattern("EEEE, dd.MMMM yyyy", Locale.US); //Tuesday, 12.November 2024
        dtf = DateTimeFormatter.ofPattern("EEEE, dd.MMMM yyyy 'KW:' w"); //Dienstag, 12.November 2024 KW:  46
        dtf = DateTimeFormatter.ofPattern("EEEE, dd.MMMM yyyy 'KW: 'w, qqqq"); //Dienstag, 12.November 2024 KW: 46, 4. Quartal
        //ld = LocalDate.parse(eingabe, dtf);
        System.out.println(ld);

        System.out.println(ld.format(dtf));

        ld = ld.plusDays(40);
        System.out.println(ld.format(dtf));




    }

}
