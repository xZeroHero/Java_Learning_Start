package basics.sammlungen.maps_demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Maps_Demo {

    public static void main(String[] args) {

        List<Integer> liste = new LinkedList<>();

        //Listen Zugriff über einen Index
        liste.add(2);
        int x = liste.get(0);
//        System.out.println(x);


        HashMap< String , Integer> hashMap = new HashMap<>();
        hashMap.put("abc", 20);
        hashMap.put("xyz", 19);
        hashMap.put("bla", 18);
        x = hashMap.get("xyz");
        System.out.println(hashMap);
        System.out.println(x);

        System.out.println(hashMap.containsValue(20));
        System.out.println(hashMap.containsKey("first"));

        //x = hashMap.get("blub"); //null

        System.out.println(hashMap.getOrDefault("blub", -1));

        for (String key : hashMap.keySet()){
            System.out.println(key + " | " +hashMap.get(key));
        }


    }

}
