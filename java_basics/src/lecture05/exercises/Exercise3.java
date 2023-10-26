package lecture05.exercises;

import java.util.Scanner;

public class Exercise3 {
    // Print elements of a given 2-d matrix with dynamic rows and columns taken from user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rowsNumber = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columnsNumber = scanner.nextInt();

        int[][] matrix = new int[rowsNumber][columnsNumber];

        for (int row = 0; row < rowsNumber; row++) {
            System.out.println("Enter elements for row number " + row);
            for (int column = 0; column < columnsNumber; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }

        // Print the array
        for (int row = 0; row < rowsNumber; row++) {
            for (int column = 0; column < columnsNumber; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
