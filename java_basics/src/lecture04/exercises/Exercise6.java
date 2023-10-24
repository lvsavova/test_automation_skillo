package lecture04.exercises;

import java.util.Scanner;

public class Exercise6 {
    //    Write a program which advices the user where to go to a vacation based on the type of the vacation and the budget.
    //    There should be two options – Beach, Mountain. If the user puts a different value then the program
    //    should print a message that there is no information about this type of vacation.
    //    Budgets are considered per day per person. If the budget per day for Beach type vacation is smaller than 50
    //    then the program should advise Bulgaria as a destination, otherwise Outside Bulgaria.
    //    If the budget per day for Mountain type vacation is smaller than 30 then the program should advise
    //    Bulgaria as a destination, otherwise Outside Bulgaria.
    public static void main(String[] args) {
        String adviseBulgaria = "Advisable destination: Bulgaria";
        String adviseOutside = "Advisable destination: Outside Bulgaria";

        System.out.print("Please enter the type of vacation (Beach | Mountain): ");
        Scanner scanner = new Scanner(System.in);
        String typeOfVacation = scanner.nextLine();

        System.out.print("Please enter number of days: ");
        int days = scanner.nextInt();

        System.out.print("Please enter number of people: ");
        int numberPeople = scanner.nextInt();

        System.out.print("Please enter budget: ");
        double budget = scanner.nextInt();

        double dailyBudget = budget / (days * numberPeople);

        switch (typeOfVacation) {
            case "Beach":
                if (dailyBudget < 50) {
                    System.out.println(adviseBulgaria);
                } else {
                    System.out.println(adviseOutside);
                }
                break;
            case "Mountain":
                if (dailyBudget < 30) {
                    System.out.println(adviseBulgaria);
                } else {
                    System.out.println(adviseOutside);
                }
                break;
            default:
                System.out.println("No information available about the type of vacation: " + typeOfVacation);
                break;
        }
    }
}
