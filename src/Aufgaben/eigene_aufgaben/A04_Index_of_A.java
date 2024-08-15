package aufgaben.eigene_aufgaben;

public class A04_Index_of_A {

    public static void main(String[] args) {

        String text = "Was für ein schöner Tag heute ist".toLowerCase();
        int i = 0;
        String indexA = "";

        while (i < text.length()){
            if (text.charAt(i) == 'a'){
                indexA += i + ", ";
            }
            i++;
        }
        System.out.println(STR."index of every A: \{indexA}");

    }

}
