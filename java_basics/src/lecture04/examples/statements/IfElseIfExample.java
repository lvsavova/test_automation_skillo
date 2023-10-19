package lecture04.examples.statements;

public class IfElseIfExample {
    public static void main(String[] args) {
        int num = 10000;
        if (num < 100 && num >= 1) {
            System.out.println("Its a two digit number");
        } else if (num < 1000 && num >= 100) {
            System.out.println("Its a three digit number");
        } else if (num < 10000 && num >= 1000) {
            System.out.println("Its a four digit number");
        } else {
            System.out.println("number is not between 1 & 10000");
        }
    }
}
