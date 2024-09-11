package aufgaben.teams_aufgaben;

public class A34_Regular_Expression {

    public static void main(String[] args) {

        //Aufgabe 1 Binärzahlen

        String binary = "01011";
        String regex = "^[01]+$";

        System.out.println(binary.matches(regex));

        //Aufgabe 2 Hexadezimalzahlen

        String hex = "12F10";
        regex = "^[0-9A-Fa-f]+$";
        System.out.println(hex.matches(regex));

        //Aufgabe 3 Dateinamen mit .txt

        String datei = "da34_te-i.txt";
        regex = "^\\S+\\.txt$";
//        regex = "[A-Za-z0-9-_]+\\.txt";
        System.out.println(datei.matches(regex));

        //Aufgabe 4 Wörter mit "en"
        String wort = "Hanssen";
        regex = "^[A-Z][a-z]*en$";
        System.out.println(wort.matches(regex));

        //Aufgabe 5 Telefonnummern
        String telefonnummer = "1234 123456";
        regex = "^\\d{3,5}[-/ ]{0,1}\\d{4,}$";
        System.out.println(telefonnummer.matches(regex));

        //Aufgabe 6 Uhrzeit

        String time = "00:15:59";
        regex = "^([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$";
        System.out.println(time.matches(regex));

        //Aufgabe 7 Preis in Eur
        String preis = "12,50 Euro";
        regex = "^\\d+,\\d{2} *(€|Euro|EUR)$";
        System.out.println(preis.matches(regex));

        //Aufgabe 8 Tausenderzeichen

        String zahl = "12.454,33";
        regex = "^\\d{1,3}(\\.\\d{3})*(,\\d{2})$";
        System.out.println(zahl.matches(regex));

        //Aufgabe 9 IP-Adressen

        String ip = "19.255.255.255";
        regex = "^([01][0-9]*[0-9]*|2[0-5][0-5]|[0-9])([.]([01][0-9]*[0-9]*|2[0-5][0-5]|[0-9])){3}$";
        System.out.println(ip.matches(regex));

        //Aufgabe 10 URl

        String url = "https://abc.def.defe.de";
        regex = "^(https?://|\\w{2,})(.\\w+)*.[A-Z,a-z]{2,5}/*$";
        System.out.println(url.matches(regex));

    }
}
