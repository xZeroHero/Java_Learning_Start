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
        String answer = "";
        switch (grade){
            case (1):
        }
        return "";
    }

    public static void main(String[] args) {
        int prozent = 92;
        int note = grade(prozent);
        System.out.println(STR."Note: \{note}\nBewertung: \{bewertung(note)}");
    }


}
