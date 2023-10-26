package lecture05.exercises;

public class Exercise4 {
    // Find the biggest element of an array and print it in the console
    public static void main(String[] args) {
        int[] arr = {-1, 200, 5, 6 ,203, -500, 300000};
        int max = arr[0];

        for (int elem: arr) {
            if (elem > max ) {
                max = elem;
            }
        }
        System.out.println("The biggest number in the array is: " + max);
    }
}
