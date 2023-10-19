package lecture04.examples.loops;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int j = 0; j <= 6; j++) {
            if (j == 4) {
                continue;
            }
            System.out.print(j + " ");
        }
    }
}
