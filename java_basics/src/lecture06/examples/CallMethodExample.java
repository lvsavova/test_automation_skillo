package lecture06.examples;

public class CallMethodExample {
    public static void main(String[] args) {
        // One method can be called many times
        for (int i = 0; i <= 10; i++) {
            myMethod();
        }
    }
    static void myMethod() {
        System.out.println("I just got executed!");
    }

}
