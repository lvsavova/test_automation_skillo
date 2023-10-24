package lecture05.examples.linear.dynamic;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();
        System.out.println("1. Add elements to queue");
        pq.add("TestA");
        pq.add("TestB");
        pq.add("TestC");
        pq.add("TestD");
        pq.add("TestE");
        System.out.println(pq);

        System.out.println("2. Call remove method");
        pq.remove();
        System.out.println(pq);

        System.out.println("3. Iterate a queue");
        for (String i : pq) {
            System.out.println(i);
        }
    }
}
