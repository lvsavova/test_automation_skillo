package lecture05.examples.linear.statics;

public class Array {
    public static void main(String[] args) {
        String[] carBrands = {"Audi", "Bmw", "Volvo", "Mercedes"};
        int[] evenNumbers = {2, 4, 6, 8, 10};
        double[] degrees = {0, 0.5, 1, 1.5, 2, 2.5};

        System.out.println(carBrands[0]);
        System.out.println(evenNumbers[2]);
        System.out.println(degrees[5]);

        System.out.println(carBrands.length);
        System.out.println(evenNumbers.length);
        System.out.println(degrees.length);
    }
}
