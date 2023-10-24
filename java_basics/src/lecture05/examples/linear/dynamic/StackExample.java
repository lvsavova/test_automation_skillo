package lecture05.examples.linear.dynamic;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> elements = new Stack<>();
        // Pushing new items to the Stack
        System.out.println("1. Push items to a stack");
        elements.push("Test1");
        elements.push("Test2");
        elements.push("Test3");
        elements.push("Test4");
        System.out.println(elements);

        System.out.println("2. Call method pop");
        elements.pop();
        System.out.println(elements);

        System.out.println("3. Push an element Test5");
        elements.push("Test5");
        System.out.println(elements);

    }
}
