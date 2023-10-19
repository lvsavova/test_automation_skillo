package lecture04.examples.operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        num2 = num1; // num2 now has the same value as num1
        System.out.println("num2 = num1 Output: " + num2);

        num2 += num1; //num2 = num2 + num1 // 20

        System.out.println("num2 += num1 Output: " + num2);

        num2 -= num1; //num2 = num2 - num1
        System.out.println("num2 -= num1 Output: " + num2);

        num2 *= num1; // num2 = num2 * num1
        System.out.println("num2 *= num1 Output: " + num2);

        num2 /= num1; // num2 = num2 / num1
        System.out.println("num2 /= num1 Output: " + num2);

        num2 %= num1; // num2 = num2 % num1
        System.out.println("num2 %= num1 Output: " + num2);

    }
}
