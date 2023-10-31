package lecture07.examples.exceptions;

import java.io.*;

public class ExceptionsExample {
    public static void main(String[] args)   {
        testFileNotFoundExceptionException();
    }

    // Checked exception
    static void testFileNotFoundExceptionException() {
        try {
            File file = new File("java_basics/src/lecture07/examples/exceptions/file.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    // Unchecked exception
    static void testArrayIndexOutOfBoundsException() {
        int[] num = {1, 2, 3, 4};
        System.out.println(num[5]);
    }

    // Unchecked exception
    static void testStringIndexOutOfBoundsException() throws StringIndexOutOfBoundsException {
        String str = "Skillo";
        System.out.println(str.charAt(100));
    }

    // Unchecked exception
    static void testNullPointerException() {
        String str = null;
        System.out.println(str.length());
    }

    static void testTryCatch(String path) {
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found! Please check the file name and try it again!");
        }
    }

    static void testTryMultipleCatch(int number, String factorAsString) {
        try {
            int factor = Integer.parseInt(factorAsString);
            if (number % factor == 0)
                System.out.println(factor + " is a factor of " + number);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic " + ex);
        } catch (NumberFormatException ex) {
            System.out.println("Number Format Exception " + ex);
        }
    }

    static void testTryCatchMultipleExceptions(int number, String factorAsString) {
        try {
            int factor = Integer.parseInt(factorAsString);
            if (number % factor == 0)
                System.out.println(factor + " is a factor of " + number);
        } catch (ArithmeticException | NumberFormatException ex) {
            System.out.println("Exception encountered " + ex);
        } finally {
            System.out.println("Finally");
        }
    }

    static void testThrowsException(String path) throws FileNotFoundException {
        File file = new File(path);
        FileReader fileReader;
        fileReader = new FileReader(file);
    }

    static void testThrowException(int number, int factor) {
        try {
            if (number % factor == 0)
                System.out.println(factor + " is a factor of " + number);
        } catch (ArithmeticException | NumberFormatException ex) {
            throw new IllegalArgumentException("Incorrect input! Please enter only numbers bigger than 0!");
        }
    }

    static void testTryFinally(String path) throws IOException {
        FileInputStream fis = null;
        BufferedReader in = null;
        try {
            fis = new FileInputStream(path);
            in = new BufferedReader(new InputStreamReader(fis));
            String temp;

            while ((temp = in.readLine()) != null) {
                System.out.println(temp);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
    }
}
