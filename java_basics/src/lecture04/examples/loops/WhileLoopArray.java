package lecture04.examples.loops;

public class WhileLoopArray {
    public static void main(String[] args) {
        int[] arr = {2, 11, 45, 9};
        //i starts with 0 as array index starts with 0 too
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }
}
