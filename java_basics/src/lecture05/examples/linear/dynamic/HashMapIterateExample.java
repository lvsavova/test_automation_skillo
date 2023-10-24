package lecture05.examples.linear.dynamic;


import java.util.HashMap;
import java.util.Map;

public class HashMapIterateExample {
    public static void main(String[] args) {
        //Creating HashMap
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        //Put elements in Map
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());
        }
        // Another way to iterate a HashMap
//        for (Integer i : map.keySet()) {
//            System.out.println(i + " " + map.get(i));
//        }
    }
}
