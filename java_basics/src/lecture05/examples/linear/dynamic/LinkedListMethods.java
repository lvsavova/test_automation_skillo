package lecture05.examples.linear.dynamic;

import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        System.out.println("1. Adding Volvo element in empty linked list");
        cars.add("Volvo"); //adding element
        System.out.println(cars);

        System.out.println("2. Adding first element BMW and last element Ford");
        cars.addFirst("BMW"); //adding on first position
        cars.addLast("Ford"); //adding on last position
        System.out.println(cars);

        System.out.println("3. Added Mazda on position 2");
        cars.add(2, "Mazda"); //adding on 3-rd position
        System.out.println(cars);

        System.out.println("4. Called remove method");
        cars.remove(); //removes first element
        System.out.println(cars);

        System.out.println("5. Called removeFirst method");
        cars.removeFirst(); //removes first element
        System.out.println(cars);

        System.out.println("6. Called removeLast method");
        cars.removeLast(); //removes last element
        System.out.println(cars);

        System.out.println("7. Called removeAll method");
        cars.removeAll(cars); //remove all elements
        System.out.println(cars);

       // cars.remove(2);//Remove element
        System.out.println("8. Check if contains BMW element");
        boolean exists = cars.contains("BMW");
        System.out.println(exists);
        System.out.println(cars);
    }
}
