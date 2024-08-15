package aufgaben.eigene_aufgaben;

public class A08_Quadratzahl {

    public static void main(String[] args) {

        int input = 5865;
        int temp = 1;
        int output = 0;

        for (int i = 1; temp<= input; i++){
            temp = i*i;
            output = i ;
        }

        System.out.println(STR."Die nächst höchste Quadratzahl ist \{output}² (\{temp}) ");

    }

}
