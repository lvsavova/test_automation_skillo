package lecture05.examples.linear.dynamic;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(100, "Ivan");
        hm.put(101, "Georgi");
        hm.put(102, "Stoyan");
        System.out.println("1. Initial list of elements:");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("2. Updated list of elements ( replaced 102 key value ):");
        hm.replace(102, "Miroslav");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("3. Updated list of elements ( replaced 101 key value ):");
        hm.replace(101, "Georgi", "Anton");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("4. Updated list of elements ( replace all element values ):");
        hm.replaceAll((k, v) -> "Asen");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
