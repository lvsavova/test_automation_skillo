package lecture04.exercises;

import java.util.Scanner;

public class Exercise4 {
    //    Write a Java program to calculate the revenue from a sale based on the unit price
    //    and quantity of a product input by the user.
    //    The discount rate is 15% for the quantity purchased between 100 and 120 units,
    //    and 20% for the quantity purchased greater than 120 units.
    //    If the quantity purchased is less than 100 units, the discount rate is 0%. See the example output as shown below:
    //    Enter unit price: 25
    //    Enter quantity: 110
    //    The revenue from sale: 2337.5$
    //    Discount: 412.5$(15.0%)

    public static void main(String[] args) {
        System.out.print("Enter unit price: ");
        Scanner scanner = new Scanner(System.in);

        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        double discountRate = 0;

        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.15;
        } else if (quantity > 120) {
            discountRate = 0.20;
        }

        double revenueWithoutDiscount = unitPrice * quantity;
        double revenue = 0;
        double discount = revenueWithoutDiscount * discountRate;
        revenue = revenueWithoutDiscount - discount;

        System.out.println("The revenue from sale is: " + revenue);
        System.out.println("Discount: " + discount);
    }
}
