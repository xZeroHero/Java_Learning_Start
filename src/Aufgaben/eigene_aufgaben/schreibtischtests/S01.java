package aufgaben.eigene_aufgaben.schreibtischtests;

public class S01 {

    public static void main(String[] args) {

        // Aufgabe 1
        // Was wird ausgegeben?

        int output = 4;

        for (int i = 2; i <= 16; i *= 2){
            output +=i;
            System.out.printf("%d ", output);
        }



        //Spacer
        System.out.println();
        System.out.println("_______________");



        // Aufgabe 2
        // Was wird ausgegeben?

        output = 0;

        for (int i = 2; i > 0; i--){
            output -= i;
            System.out.printf("%d ", output);
        }




        //Spacer
        System.out.println();
        System.out.println("_______________");



        // Aufgabe 3
        // Was wird ausgegeben?

        output = 0;



        for (int i = 1; i <= 4; i++){
            int x = 1;
            while (x <= i){
                System.out.print(x);
                x++;
            }
            System.out.println();
        }


    }

}
