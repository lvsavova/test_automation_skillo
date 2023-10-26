package lecture06.examples;

public class ComplexMethods {
    public static void main(String[] args) {
        System.out.println(checkAge(20));
    }
    // Create a checkAge() method with an integer variable called age
    static String checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            return "Access denied - You are not old enough!";

        // If age is greater than 18, print "access granted"
        } else {
            return "Access granted - You are old enough!";
        }
    }

}
