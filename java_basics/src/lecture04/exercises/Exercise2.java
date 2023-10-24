package lecture04.exercises;

public class Exercise2 {
    //    Write a program to print the days of the week based on the user digit 1-7 input.
    //    The message should be “The [user input digit]-st/nd/rd/th day of the week is [the day of the week]”
    //    Hint: Use switch-case.
    public static void main(String[] args) {
        int dayNumber = 3;
        String dayName;
        String suffix;

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                suffix = "st";
                break;
            case 2:
                dayName = "Tuesday";
                suffix = "nd";
                break;
            case 3:
                dayName = "Wednesday";
                suffix = "rd";
                break;
            case 4:
                dayName = "Thursday";
                suffix = "th";
                break;
            case 5:
                dayName = "Friday";
                suffix = "th";
                break;
            case 6:
                dayName = "Saturday";
                suffix = "th";
                break;
            case 7:
                dayName = "Sunday";
                suffix = "th";
                break;
            default:
                System.out.println("Invalid day number " + dayNumber + ". Please choose a day number between 1 and 7.");
                return;
        }
        System.out.println("The " + dayNumber + suffix + " day of the week is " + dayName);
    }
}



