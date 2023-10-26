package lecture05.exercises;

public class Exercise1 {
    // Write program to print sum of a given array elements
    public static void main(String[] args) {
        int[] arr = { 5, 1, 2, 5, 66, 200 };
        int sum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];
        }
        System.out.println("The sum of the array elements is " + sum);
    }
}
