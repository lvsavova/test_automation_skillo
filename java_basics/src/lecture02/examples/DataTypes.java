package lecture02.examples;

public class DataTypes {
    public static void main(String[] args) {
        //Stores whole numbers from -128 to 127
        byte byteNumber = 56;

        //Stores whole numbers from -32,768 to 32,767
        short shortNumber = 5100;

        //Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int intNumber = 1000004;

        //Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long longNumber = 9000123133l;

        //Stores fractional numbers. Sufficient for storing 15 decimal digits
        double doubleNumber = 4.5546467834547;

        // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        float floatNumber = 4.55654f;

        //Stores true or false values
        boolean booleanValue = true;

        //Stores a single character/letter or ASCII values
        char charValue = 'g';

        String s1 = new String("How are you?");

        String s2 = " I am fine, thank you!";

        String s3 = s1 + s2;

        System.out.println(s3);


    }
}