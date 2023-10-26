package lecture06.examples;

public class MethodOverloading {
    public static void main(String[] args) {
        int mySum1 = sumNumbers(8, 5);
        double mySum2 = sumNumbers(4.3, 6.26);
        System.out.println("int: " + mySum1);
        System.out.println("double: " + mySum2);
    }
    static int sumNumbers(int x, int y) {
        return x + y;
    }
    static double sumNumbers(double x, double y) {
        return x + y;
    }
}
