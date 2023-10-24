package lecture04.exercises;

import java.util.Scanner;

public class Exercise1 {
    //    Write a program which calculates if a triangle can be built by 3 given angles.
    //    The angles are taken from the user input.
    //    There are two possible outputs – if the triangle can’t be built based on the
    //    angle values or the triangle can be built based on the angle values.
    //    If the triangle is possible the output should contain also the type of the triangle
    //    – acute (остроъгълен), right-angled (правоъгълен), obtuse (тъпоъгълен), equilateral (равностранен),
    //    isosceles (равнобедрен), multifaceted (разностранен).
    //    Hint: Use logical and comparison operators and if statements

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input angles.");
        System.out.print("Angle 1 = ");
        int angle1 = scanner.nextInt();

        System.out.print("Angle 2 = ");
        int angle2 = scanner.nextInt();

        System.out.print("Angle 3 = ");
        int angle3 = scanner.nextInt();

        int angleSum = angle1 + angle2 + angle3;

        // Check if the triangle exists
        if (angleSum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("A triangle with such angles exists.");

            // Check if the triangle is acute / right / obtuse
            if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
                System.out.println("The triangle is obtuse");
            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("The triangle is a right triangle");
            } else {
                System.out.println("The triangle is obtuse");
            }

            // Check if the triangle is equilateral / isosceles / multifaceted
            if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("The triangle is equilateral");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("The triangle is isosceles");
            } else {
                System.out.println("The triangle is multifaceted");
            }

        } else {
            System.out.println("A triangle with such angles does not exist.");
        }
    }
}
