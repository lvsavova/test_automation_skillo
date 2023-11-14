package lecture06.exercises;

public class Exercise {
    public static void main(String[] args) {
        System.out.println(countWords2("count count  count"));
    }

    // Write a Java method to find the smallest number among three numbers
    public static int findSmallestNumber(int num1, int num2, int num3) {
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        return smallest;
    }

    //Write a Java method to compute the average of three numbers
    public static double computeAverageNumber(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // Write a Java method to display the middle character of a string
    // a) If the length of the string is even there will be two middle characters.
    // b) If the length of the string is odd there will be one middle character.
    public static void displayMiddleCharacter(String text) {
        String middleChar = "";
        int length = text.length();
        int middle = length / 2;
        // Solution with substring method
//        if (length % 2 == 0) {
//            middleChar = text.substring(middle - 1, middle + 1);
//        } else {
//            middleChar = text.substring(middle, middle + 1);
//        }

        // Second solution with charAt method
        if (length % 2 == 0) {
            middleChar = text.charAt(middle - 1) + text.charAt(middle) + "";
            System.out.println("The middle characters of the text \"" + text + "\" are: " +
                    text.charAt(middle - 1) + " and " + text.charAt(middle));
        } else {
            middleChar = "" + text.charAt(middle);
        }

        System.out.println("The middle of the text \"" + text + "\" is " + middleChar);
    }

    // Write a Java method to count all the words in a string
    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split(" ");
        return words.length;
    }

    public static int countWords2(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        int wordCount = 1;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Check if the character is a space
            if (c == ' ') {
                wordCount++;
            }
        }

        return wordCount;
    }

    // Write a method named isEven that accepts an int argument.
    // The method should return true if the argument is even, or false otherwise.
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // A takes as input a non-negative integer and returns true if the number is a palindrome;
    // Non-negative integer is called a palindrome if it reads forward and backward in the same way.
    // For example, the numbers 5, 121, 3443, and 123454321 are palindromes.
    public static boolean isNumberPalindrome(int number) {
        if (number < 0) {
            throw new RuntimeException("The number should be positive!");
        }
        int original = number;
        int reverse = 0;

        // Construct the reverse number
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return original == reverse;
    }

    public static boolean isNumberPalindrome2(int number) {
        if (number < 0) {
            throw new RuntimeException("The number should be positive!");
        }
        String numberAsString = Integer.toString(number);

        int numberDigits = numberAsString.length();
        for (int i = 0; i < numberDigits / 2; i++) {
            if (numberAsString.charAt(i) != numberAsString.charAt(numberDigits - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
