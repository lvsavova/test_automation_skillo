package lecture05.exercises;

import java.util.LinkedList;

public class Exercise5 {
    // Reverse the order of the elements in a LinkedList using algorithm
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(7);
        linkedList.add(77);
        linkedList.add(6);
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(0);
        linkedList.add(-1);
        linkedList.add(-2);
        linkedList.add(-5);
        linkedList.add(-99);

        //Algorithm:
        // 1. Create a linked list with n elements
        // 2. Run the loop for n - 1 times where ‘n’ is the number of elements in the LinkedList (size()).
        // 3. On each iteration: get and remove the last element ( pollLast() ). Replace the
        // current element with the removed one
        for (int i = 0; i < linkedList.size() -1 ; i++) {
            int lastElem = linkedList.pollLast();
            linkedList.add(i, lastElem);
        }

        System.out.println(linkedList);
    }
}
