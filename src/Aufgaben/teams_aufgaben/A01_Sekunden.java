package aufgaben.teams_aufgaben;


public class A01_Sekunden {
    public static void main(String[] args) {

        System.out.printf("210 seconds are %.1f minutes\n", secondsToMinutes(210));
        System.out.println("_____________________________");
        System.out.printf("120 seconds are %.1f minutes\n", secondsToMinutes(120));
        System.out.println("_____________________________");
        System.out.printf("483 seconds are %.1f minutes\n", secondsToMinutes(483));
    }

    public static double secondsToMinutes(int s){

        return (double) s / 60 ;
    }
}
