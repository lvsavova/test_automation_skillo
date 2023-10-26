package lecture05.exercises;

public class Exercise2 {
    // Print elements of a given 2-d matrix with 4 rows and 3 columns
    public static void main(String[] args) {
        int[][] matrix2d = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11 ,12}
        };

        for (int i = 0; i < matrix2d.length; i++) {
            for (int j = 0; j < matrix2d[i].length; j++) {
                System.out.print(matrix2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
