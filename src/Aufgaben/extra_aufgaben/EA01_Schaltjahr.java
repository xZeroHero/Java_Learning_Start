package aufgaben.extra_aufgaben;

public class EA01_Schaltjahr {

    public static void main(String[] args) {
        System.out.println(schaltjahr(2120));
    }

    public static String schaltjahr(int jahr){
        String antwort = "Kein Schaltjahr";

        if (jahr % 4 == 0){
            if (jahr % 100 == 0){
                if (jahr % 400 == 0) antwort = "Schaltjahr";
            }
            else antwort = "Schaltjahr";
        }
        return antwort;
    }
}
