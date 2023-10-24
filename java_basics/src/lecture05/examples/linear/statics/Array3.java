package lecture05.examples.linear.statics;

public class Array3 {
    public static void main(String[] args) {
        String[] carBrands = {"Audi", "Bmw", "Volvo", "Mercedes"};
        carBrands[1] = "Karuca";
        for (int i = 0; i < 4; i++) {
            System.out.println(carBrands[i]);
        }
    }
}
