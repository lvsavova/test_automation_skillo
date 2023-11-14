package lecture08.exercises.shapes;

public class Square implements Shape {
    @Override
    public double getArea(double side) {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter(double side) {
        return 4 * side;
    }
}
