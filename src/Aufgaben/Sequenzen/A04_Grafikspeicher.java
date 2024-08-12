package aufgaben.sequenzen;


public class A04_Grafikspeicher {
    public static void main(String[] args) {



        System.out.println(STR."Farbtiefe: 16, Auflösung: 1280x1024\nBenötigter Speicher: \{graphicStorage(16, new int[]{3000, 1024})} MB ");
        System.out.println(STR."Farbtiefe: 16, Auflösung: 1280x1024\nBenötigter Speicher: \{graphicStorage(32, new int[]{4500, 3454})} MB ");
        System.out.println(STR."Farbtiefe: 16, Auflösung: 1280x1024\nBenötigter Speicher: \{graphicStorage(48, new int[]{303, 102})} MB ");


    }

    public static double graphicStorage(int farbtiefe, int[] resolution){
        /**
         * Eingabe für Farbtiefe in Bit
         *
         * Ausgabe des benötigten Grafikspeichers in MB
         * */

        int totalPixel = resolution[0] * resolution[1];
        double totalBytes = (double) (totalPixel * farbtiefe) / 8;
        return  (double) Math.round((totalBytes / 1000 / 1000) * 1000) /1000;
    }
}
