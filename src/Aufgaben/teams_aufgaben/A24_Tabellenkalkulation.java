package aufgaben.teams_aufgaben;

public class A24_Tabellenkalkulation {

    public static void main(String[] args) {

        double[][] zahlen = {
                {12.50, 7.30, 5.20},
                {10.80, 6.70, 19.40},
                {120.00, 0.90, 123, 234},
                {12, 1,0, 21},
                {}
        };

        //Aufgabe a
        System.out.println("Aufgabe a:");

        for (int i = 0; i < zahlen.length; i++) {
            for (int x = 0; x < zahlen[i].length; x++) {
                System.out.printf("%8.2f", zahlen[i][x]);
            }
            System.out.println();
        }

//        Spacer
        System.out.println("\n_______________________________________________\n");

        for (double[] array : zahlen) {
            for (double zahl : array) {
                System.out.printf("%8.2f", zahl);
            }
            System.out.println();
        }

        //        Spacer
        System.out.println("\n_______________________________________________\n");


        //Aufgabe b

        System.out.println("Aufgabe b:");


        for (double[] array : zahlen) {
            double sum = 0.00;
            for (double zahl : array) {
                sum += zahl;
                System.out.printf("%8.2f", zahl);
            }
            System.out.printf(" = %8.2f", sum);
            System.out.println();
        }

        //        Spacer
        System.out.println("\n_______________________________________________\n");


        //Aufgabe c

        System.out.println("Aufgabe c:");


        int maxLength = 0;

        // Längstes Array im 2D Array wird bestimmt
        for (double[] array : zahlen) {
            if (array.length > maxLength) maxLength = array.length;
        }

        double[] sumColumn = new double[maxLength];

        for (int i = 0; i < zahlen.length; i++) {
            double sumRow = 0.00;

            for (int j = 0; j < maxLength; j++) {
                if (j < zahlen[i].length) {
                    sumRow += zahlen[i][j];
                    System.out.printf("%8.2f", zahlen[i][j]);
                    sumColumn[j] += zahlen[i][j];
                } else {
                    System.out.printf("%8.0f", 0.00);

                }
            }

            //Ausgabe der Zeile
            System.out.printf(" = %8.2f", sumRow);
            System.out.println();

        }

        //Ausgabe der Spaltensummen
        for (double sum : sumColumn) {
            System.out.printf("%8.2f", sum);
        }











        /*int indexColumn = 0;
        int maxLength = 0;

        // Längstes Array im 2D Array wird bestimmt
        for (double[] array : zahlen) {
            if (array.length > maxLength) maxLength = array.length;
        }

        double[] sumColumn = new double[maxLength];


        for (double[] array : zahlen) {
            double sum = 0.00;
            int index = 0;
            for (double zahl : array) {
                sum += zahl;
                System.out.printf("%6.2f", zahl);


                index++;

            }
            if (index < maxLength) {
                for (int y = maxLength; y > index; y--) {
                    System.out.printf("%6.2f", 0.00);
                }
            }
            System.out.printf(" = %6.2f", sum);
            System.out.println();
        }


        while (indexColumn <= maxLength) {
            for (double[] array : zahlen) {
                double sum = 0.00;
                int index = 0;
                for (double zahl : array) {
                    if (index == indexColumn) {
                        sumColumn[indexColumn] += zahl;
                    }
                    index++;
                }

            }
            indexColumn++;
        }


        for (double sum : sumColumn) {
            System.out.printf("%6.2f", sum);
        }*/


    }

}
