package lecture05.examples.linear.dynamic;

import java.util.HashSet;

public class HashSetMethods {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Niki");
        set.add("Ivan");
        set.add("Georgi");
        set.add("Stoyan");
        System.out.println("1. An initial list of elements: " + set);
        //Removing specific element from HashSet
        set.remove("Ivan");
        System.out.println("2. After invoking remove(Ivan) method: " + set);

        HashSet<String> set1 = new HashSet<String>();
        set1.add("Ekaterina");
        set1.add("Maya");
        set.addAll(set1);
        System.out.println("3. Add set to another set: " + set);
        //Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println("4. After invoking removeAll() method: " + set);

        //Removing elements on the basis of specified condition
        set.removeIf(str -> str.contains("Nik"));
        System.out.println("5. After invoking removeIf() method: " + set);

        //Removing all the elements available in the set
        System.out.println("6. After invoking clear() method: " + set);
    }
}
