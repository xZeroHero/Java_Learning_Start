package basics.sammlungen.stack_demo;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> stapel = new Stack<>();

        stapel.push("♡10");
        stapel.push("♢9");
        stapel.push("♧3");
        stapel.push("♤5");



        System.out.println(stapel);

        while (!stapel.isEmpty()){
            System.out.println(stapel.pop());
            System.out.println(stapel);
        }

    }

}
