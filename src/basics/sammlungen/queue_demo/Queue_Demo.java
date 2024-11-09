package basics.sammlungen.queue_demo;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Demo {

    public static void main(String[] args) {

        Queue<String> schlange = new LinkedList<>();

        schlange.offer("Frida");
        schlange.offer("Helmut");
        schlange.add("Uschi");
        schlange.add("Elke");


        System.out.println(schlange);


        // .poll() entfernt und returned den ersten Eintrag der Schlange

/*        String person = schlange.poll();
        System.out.println(person);

        System.out.println(schlange);


        person = schlange.peek();
        System.out.println(person);

        System.out.println(schlange);*/

        while (!schlange.isEmpty()){
            String person = schlange.poll();
            System.out.println(person);

            System.out.println(schlange);
        }

    }

}
