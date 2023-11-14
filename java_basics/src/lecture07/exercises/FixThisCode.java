package lecture07.exercises;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FixThisCode {
    private static FileWriter getFileWriter(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath, true);
        return fileWriter;
    }
    protected static void closeFileWriter(FileWriter fileWriter) throws IOException {
        fileWriter.close();
    }
    public static void printToFile(FileWriter fileWriter, String text, int repeat) throws IOException {
        for (int i = 0; i < repeat; i++) {
            fileWriter.write(text + "\n");
        }
    }
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the file path: ");
        String filePath = scanner.nextLine();
        System.out.println("Please enter how many times to add the text in the file: ");
        int howManyTimesToPrintTheTextToFile = 0;
        try {
            howManyTimesToPrintTheTextToFile = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new RuntimeException("Incorrect Format! ", e);
        }
        System.out.println("Please provide the text: ");
        String textToAdd = scanner.nextLine();
        try {
            fileWriter = getFileWriter(filePath);
            printToFile(fileWriter, textToAdd, howManyTimesToPrintTheTextToFile);
        } catch (IOException e) {
            throw new RuntimeException("Unable to print text to file. ", e);
        }  finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.printf("Unable to close the file");
                }
            }
        }
    }
}