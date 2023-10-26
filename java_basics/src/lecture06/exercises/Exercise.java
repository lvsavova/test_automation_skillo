package lecture06.exercises;

public class Exercise {
    public static void main(String[] args) {
        System.out.println(findSmallestNumber(3, 6, 10));
    }

    // Write a Java method to find the smallest number among three numbers
    public static int findSmallestNumber(int num1, int num2, int num3) {
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        return smallest;
    }
}
