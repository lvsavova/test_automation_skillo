package lecture07.examples.exceptions;

public class NestedExceptionsExample {
    public static void throwit() throws RuntimeException {
        System.out.println("throwit");
        throw new RuntimeException();
    }

    public static void notThrowit() {
        throwit();
    }

    public static void main(String[] args) {
        try {
            System.out.println("hello");
            notThrowit();
        } catch (Exception e) {
            System.out.println("caught");
        } finally {
            System.out.println("finally");
        }
        System.out.println("after");
    }
}
