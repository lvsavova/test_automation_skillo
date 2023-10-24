package lecture05.examples.linear.dynamic;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterateExample {
    public static void main(String[] args) {
        //Creating HashSet and adding elements
        HashSet<String> set = new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Two");
        set.add("Two");
        set.add("Two");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
//        for (String i : set) {
//            System.out.println(i);
//        }
        System.out.println(set.size());

    }
}
