package lecture04.exercises;

public class Exercise8 {
    //    Reverse the following list using for loop list1 = [10, 20, 30, 40, 50]
    public static void main(String[] args) {
        int[] list1 = {10, 20, 30, 40, 50};
        int index = list1.length;
        while (index >= 0) {
            System.out.print(list1[index] + " ");
            index--;
        }

        // Second solution
//        for (int i = list1.length - 1; i >= 0; i--) {
//            System.out.print(list1[i] + " ");
//        }
    }
}
