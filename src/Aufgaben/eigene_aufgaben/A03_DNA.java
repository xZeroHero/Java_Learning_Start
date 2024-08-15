package aufgaben.eigene_aufgaben;

public class A03_DNA {

    public static void main(String[] args) {

        String dna = "ATTGC";
        int i = 0;
        String complementaryDNA = "";

        while (i < dna.length()){
            switch (dna.charAt(i)){
                case 'A':
                    complementaryDNA += "T";
                    break;
                case 'T':
                    complementaryDNA += "A";
                    break;
                case 'G':
                    complementaryDNA += "C";
                    break;
                case 'C':
                    complementaryDNA += "G";
                    break;
            }
            i++;
        }

        System.out.println(STR."Complementary DNA-String: \{complementaryDNA}");


    }

}
