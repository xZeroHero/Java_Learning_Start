package aufgaben.teams_aufgaben;

public class A28_Klassenspiegel_Methode {

    static int grade(int prozenzt) {
        int note = 0;
        if (prozenzt >= 0 && prozenzt <= 100) {
            if (prozenzt > 91) {
                note = 1;
            } else if (prozenzt > 80) {
                note = 2;
            } else if (prozenzt > 66) {
                note = 3;
            } else if (prozenzt > 49) {
                note = 4;
            } else if (prozenzt > 29) {
                note = 5;
            } else note = 6;
        }

        return note;
    }

    static String bewertung(int grade) {
        return switch (grade) {
            case (1) -> "sehr gut";
            case (2) -> "gut";
            case (3) -> "befriedigend";
            case (4) -> "ausreichend";
            case (5) -> "mangelhaft";
            case (6) -> "ungenügend";
            default -> "ungültige Eingabe";
        };
    }

    static void answer(int prozent) {
        int note = grade(prozent);
        System.out.printf(STR."%11s \{note}\n%11s \{bewertung(note)}", "Note |", "Bewertung |");
    }

    public static void main(String[] args) {
        answer(40);

    }


}
