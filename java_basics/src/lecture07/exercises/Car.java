package lecture07.exercises;


//Create a Car class which has 5 attributes name / color / release year / horse power / second hand tick.
//        Name and color must be from string type / release year and horse power to be integers / second hand is boolean.
//        Requirements:
//        • If name or color is not specified set N/A as value
//        • If release year or horse power is not specified set -1 as value
//        • If second hand is not specified set false as value
//        Create a constructors of Car class for the following cases:
//        • Create a car by provided name / color / release year / horse power / second hand
//        • Create a car by provided name / color / second hand
//        • Create a car by provided name / color / release year / horse power
//        • Create a car by provided name / release year / horse power / second hand
//        • Create a car by provided nothing
//        Create Car object using each constructor
public class Car {
    private String name;
    private String color;
    private int releaseYear;
    private int horsePower;
    private boolean secondHandTick;

    public Car(String name, String color, int releaseYear, int horsePower, boolean secondHandTick) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHandTick = secondHandTick;
    }

    public Car(String name, String color, boolean secondHandTick) {
        this(name, color, -1, -1, secondHandTick);
    }

    public Car(String name, String color, int releaseYear, int horsePower){
        this(name, color, releaseYear, horsePower, false);
    }

    public Car(String name, int releaseYear, int horsePower, boolean secondHandTick){
        this(name, "N/A", releaseYear, horsePower, secondHandTick);
    }

    public Car(int releaseYear, int horsePower, boolean secondHandTick){
        this("N/A", "N/A", releaseYear, horsePower, secondHandTick);
    }
    public Car() {
    }

}
