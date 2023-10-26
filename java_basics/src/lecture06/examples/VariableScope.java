package lecture06.examples;

public class VariableScope {
    public static void main(String[] args) {
        if (5 > 3) {
            int blockVariable = 5;
            blockVariable = 6;
            System.out.println(blockVariable);
        }
    }

    public static void sayHello() {
        String message = "Hello World!";
        System.out.println(message);
    }
}
