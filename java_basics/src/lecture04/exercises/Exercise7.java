package lecture04.exercises;

public class Exercise7 {
    //   Given a list iterate it and display numbers which are divisible by 5 and if you find a number greater than 150
    //   stop the loop iteration list1 = [12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200]
    public static void main(String[] args) {
        int[] list1 = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200, 5};
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] > 150) {
                continue;
            }
            if (list1[i] % 5 == 0) {
                System.out.println("Number that is divided by 5: " + list1[i]);
            }
        }
    }
}
