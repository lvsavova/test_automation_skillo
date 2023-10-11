package lecture02.exercises;

public class Exercise6 {
    // Write a simple program, without checks to print the result of quadratic equation.
    // ax^2 + bx + c = 0
    public static void main(String[] args) {
        double a = 1;
        double b = 3;
        double c = -4;

        // declared the two roots
        double root1;
        double root2;

        // discriminant (b^2 - 4ac)
        double discriminant = b * b - 4 * a * c;

        System.out.println("Discriminant = " + discriminant);

        //discriminant >= 0
        root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("\nDiscriminant > 0");
        System.out.println("root1 = " + root1);
        System.out.println("root2 = " + root2);

    }
}
