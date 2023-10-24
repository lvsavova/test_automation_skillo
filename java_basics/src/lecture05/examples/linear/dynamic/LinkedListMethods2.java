package lecture05.examples.linear.dynamic;

import java.util.LinkedList;

public class LinkedListMethods2 {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();

        System.out.println("1. Added element Volvo in an empty linked list");
        cars.add("Volvo"); //adding element
        System.out.println(cars);

        System.out.println("2. Call method addFirst to add BMW");
        cars.addFirst("BMW"); //adding on first position
        System.out.println(cars);

        System.out.println("3. Call method addLast to add Ford");
        cars.addLast("Ford"); //adding on last position
        System.out.println(cars);

        System.out.println("4. Added Mazda element at position 2");
        cars.add(2, "Mazda"); //adding on 3-rd position
        System.out.println(cars);

        System.out.println("5. Get element at position 1");
        System.out.println(cars.get(1));

        System.out.println("6. Get first element");
        System.out.println(cars.getFirst());

        System.out.println("7. Get last element");
        System.out.println(cars.getLast());
    }
}
