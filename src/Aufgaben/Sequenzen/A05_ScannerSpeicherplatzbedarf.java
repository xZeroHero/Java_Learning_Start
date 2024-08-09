package Aufgaben.Sequenzen;

public class A05_ScannerSpeicherplatzbedarf {

    public static void main(String[] args) {

        System.out.println(STR."Speicherplatzbedarf: \{totalStorageOfScan(new int[]{600, 600}, 16, new double[]{21, 29.7}, 100)}MB");

    }

    public static double totalStorageOfScan(int[] scannerResolution, int farbtiefe, double[] paperSize, int pages){
        /**
         * Eingabe:
         * scannerResolution: [Pixel, Pixel]
         * Farbtiefe: Bit
         * paperSize: [Breite, Höhe] in cm
         * pages: Anzahl der Blätter
         *______________________________________________
         * Ausgabe des benötigten Grafikspeichers in MB
         * */

        // 1 inch = 0,254 cm
        final double ONE_CM_IN_INCH = 2.54;

        //Gesamtfläche in squareInch
        double paperArea = (paperSize[0] / ONE_CM_IN_INCH) * (paperSize[1] / ONE_CM_IN_INCH);
        int scannerResolutionSquareInch = scannerResolution[0] * scannerResolution[1];

        //Gesamtanzahl an Dots/Pixeln
        double dotsPerPaper = paperArea * scannerResolutionSquareInch;

        double totalBytes = (double) (dotsPerPaper * farbtiefe * pages) / 8;

        return  (double) Math.round((totalBytes / 1000 / 1000) * 1000) /1000;

    }
}
