package lecture05.examples.linear.dynamic;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo"); //adding element in ArrayList
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(1, "Mercedes"); //change element
        cars.remove(2);//Remove element
        System.out.println(cars);
        System.out.println(cars.get(0) /*Aceess element*/);
        //Loop through ArrayList
        for (String i : cars) {
            System.out.println(i);
        }
        Collections.sort(cars); //Sorting ArrayList
        //Loop through ArrayList
        for (String i : cars) {
            System.out.println(i);
        }
    }
}

