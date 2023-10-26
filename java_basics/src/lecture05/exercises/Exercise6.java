package lecture05.exercises;

public class Exercise6 {
    // Find sum of the diagonal of a given 2d matrix with 4 rows and 4 columns
    public static void main(String[] args) {
        int[][] matrix2d = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;
        for(int rowIndex = 0; rowIndex < matrix2d.length; rowIndex++) {
            for(int columnIndex = 0; columnIndex < matrix2d[rowIndex].length; columnIndex++) {
                if (rowIndex == columnIndex) {
                    sumDiagonal1 += matrix2d[rowIndex][columnIndex];
                }
                if (rowIndex + columnIndex == matrix2d.length) {
                    sumDiagonal2 += matrix2d[rowIndex][columnIndex];
                }
            }
        }
        System.out.println("The sum of the first diagonal is: " + sumDiagonal1);
        System.out.println("The sum of the second diagonal is: " + sumDiagonal2);
    }
}
