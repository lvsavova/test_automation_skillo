package lecture08.examples.polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create a Animal object
        Animal myPig = new Pig(); // Create a Pig object
        Animal myDog = new Dog(); // Create a Dog object

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(myAnimal);
        animals.add(myPig);
        animals.add(myDog);

        for( Animal animal: animals) {
            animal.animalSound();
        }
    }
}
