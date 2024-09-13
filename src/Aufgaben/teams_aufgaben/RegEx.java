package aufgaben.teams_aufgaben;

/**
 * Reguläre Ausdrücke (Regular Expressions, Regex)
 *
 * Ein regulärer Ausdruck ist eine Folge von Buchstaben und Symbolen,
 * die ein Suchmuster (Pattern) bilden.
 * Reguläre Ausdrücke können verwendet werden, um Zeichenketten (Strings)
 * zu bearbeiten, zu prüfen oder in ihnen etwas zu suchen.
 *
 * Java SE 22 API Documentaion:
 * https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/regex/Pattern.html#sum
 *
 * @author Thomas Freese
 * @version 09.09.2024
 */
public class RegEx {
    public static void main(String[] args) {
        String s; // die zu prüfende Zeichenkette
        String pattern; // das Pattern = der reguläre Ausdruck = RegEx
        boolean matched; // passt das Pattern?

        // einfache Gleichheit
        s = "Moin";
        pattern = "Moin";
        matched = s.matches(pattern);
        System.out.printf("%-10s%-10s %b\n", s, pattern, matched);

        // genau ein beliebiges Zeichen .
//        s = "Moin";
        s = "Mais";
        pattern = "M.i.";
        matched = s.matches(pattern);
        System.out.printf("%-10s%-10s %b\n", s, pattern, matched);

        // Wiederholungen (Quantoren)
        s = "MMMoin";
        pattern = ".oin"; // 1
        pattern = ".+oin"; // 1..n
        pattern = ".*oin"; // 0..n
        pattern = ".?oin"; // 0..1
        pattern = ".{3}oin"; // n
        pattern = ".{3,5}oin"; // min, max
        pattern = ".{3,}oin"; // min

        pattern = "M+oin"; // 1..n
        matched = s.matches(pattern);
        System.out.printf("%-10s%-10s %b\n", s, pattern, matched);

        // Gruppen bilden durch runde Klammern
        s = "Moin";
        pattern = "M(oi)+n";
        matched = s.matches(pattern);
        System.out.printf("%-10s%-10s %b\n", s, pattern, matched);

        // Muster mit ODER verknüpfen
//        s = "Meier";
//        s = "Maier";
//        s = "Mayer";
        s = "Meyer";
        pattern = "M(ei|ai|ay)er";
        matched = s.matches(pattern);
        System.out.printf("%-10s%-10s %b\n", s, pattern, matched);


        s = "Frau Meier";
        s = "Herr Müller";
//        s = "Müller";
        pattern = "((Herr|Frau) )?.+";
        matched = s.matches(pattern);
        System.out.printf("%-10s%-10s %b\n", s, pattern, matched);

        // Zeichenklassen
        s = "Maier";
        s = "Meier";

        pattern = "M[ae]ier";
//        pattern = "M[äöüß]ier";
        matched = s.matches(pattern);
        System.out.printf("%-10s%-10s %b\n", s, pattern, matched);

        // Beispiel: PLZ
        s = "28310";
//        pattern = "[0123456789][0123456789][0123456789][0123456789][0123456789]";
//        pattern = "[0123456789]{5}";
        pattern = "[0-9]{5}";

        matched = s.matches(pattern);
        System.out.printf("%-10s%-10s %b\n", s, pattern, matched);

        // Beispiel: PLZ optional mit deutschem Länderkennzeichen
//        s = "28310";
//        s = "D-28310";
        s = "D-26310";
//        pattern = "[0-9]{5}";
//        pattern = "[\\d]{5}"; // vordefinierte Zeichenklassen
//        pattern = "(D-)?[0-9]{5}";
        matched = s.matches(pattern);
        System.out.printf("%-10s%-10s %b\n", s, pattern, matched);

        // Beispiel: Vorname
        s = "Hans-peter";
//        pattern = "[A-Z][a-z]+";
//        pattern = "[A-Z][a-z]{3,}";
//        pattern = "[A-ZÄÖÜ][a-zäöüß-]{3,}";
        matched = s.matches(pattern);
        System.out.printf("%-10s%-10s %b\n", s, pattern, matched);

        s = "sdgAfaKjk";
//        pattern = "[A-z]+"; // inkl. dazwischenliegende Zeichen!
        pattern = "[A-Za-z]+";
        matched = s.matches(pattern);
        System.out.printf("%-10s%-10s %b\n", s, pattern, matched);


        /*
            Beispiel: Datum tt.mm.jjjj
         */
        // Eine einfache Prüfung
        s = "09.09.2024";
//        pattern = "[0-9]{2}[.][0-9]{2}[.][0-9]{4}";
//        pattern = "[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}"; // maskieren des Punktes
//        pattern = "\\d{2}\\.\\d{2}\\.\\d{4}"; // vordefinierte Zeichenklasse \d = [0-9]
        pattern = "([0-9]{2}[.]){2}[0-9]{4}";
        matched = s.matches(pattern);
        System.out.printf("%-15s%-40s %b\n", s, pattern, matched);


        // genauere Prüfung
        s = "25.08.2024";
        pattern = "(0[1-9]|[12][0-9]|3[01])[.](0[1-9]|1[012])[.][1-9][0-9]{3}";
        matched = s.matches(pattern);
        System.out.printf("%-15s%-40s %b\n", s, pattern, matched);

        // zerlegt in Teilzeichenketten
        s = "31.02.2024";
        String patternTag = "(0[1-9]|[12][0-9]|3[01])";
        String patternMonat = "(0[1-9]|1[012])";
        String patternJahr = "[1-9][0-9]{3}";
        pattern = patternTag + "[.]" + patternMonat + "[.]" + patternJahr;
        matched = s.matches(pattern);
        System.out.printf("%-15s%-40s %b\n", s, pattern, matched);


    }

}
