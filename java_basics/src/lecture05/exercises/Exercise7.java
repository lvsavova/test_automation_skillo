package lecture05.exercises;

public class Exercise7 {
    // Write a program which validate whether given string is palindrome (A palindrome is a sequence of characters which reads
    // the same backward as forward, such as madam or race car)
    public static void main(String[] args) {
        String word = "harryyrrah";
        int wordLength = word.length();
        boolean isPalindrom = true;

// Solution: perform a check by comparing the characters
        for (int i = 0; i < wordLength / 2; i++) {
            if (word.charAt(i) != word.charAt(wordLength - 1 - i)) {
                isPalindrom = false;
                break;
            }
        }

// Another solution: check if the word and the reversed word are the same
//        String reversedWord = "";
//        for (int i = word.length() - 1; i >= 0; i--) {
//            reversedWord = reversedWord + word.charAt(i);
//        }
//
//        isPalindrom = word.equals(reversedWord);

// Another solution: use the StringBuilder class
//        String reversed = new StringBuilder(word).reverse().toString();
//        isPalindrom = word.equalsIgnoreCase(reversed);

        if (isPalindrom) {
            System.out.println("The word \"" + word + "\" is a palindrom");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrom");
        }
    }
}
