package lecture08.examples.inheritance;

public class Car extends Vehicle {
    private int numberOfDoors;
    private boolean doorClosed = true;

    Car(String brand, String model, double length, double width, double weight, int numberOfDoors) {
        super(brand, model, length, width, weight);
        this.numberOfDoors = numberOfDoors;
    }

    public void closeOpenDoor() {
        this.doorClosed = !doorClosed;

        if (this.doorClosed) {
            System.out.println("The door is closed");
        } else {
            System.out.println("The door is opened");
        }
    }
}