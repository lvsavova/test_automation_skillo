package lecture04.examples.loops;

public class ForIterateArray {
    public static void main(String[] args) {
        int[] arr = {2, 11, 45, 9, 56, 45, - 100};
        // i starts with 0 as array index starts with 0 too
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}
