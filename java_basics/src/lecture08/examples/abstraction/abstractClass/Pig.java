package lecture08.examples.abstraction.abstractClass;

// Subclass (inherit from Animal)
class Pig extends Animal {

    public void animalSound() {
        System.out.println("I am a piggie");
    }

    public void eat() {
        System.out.println("A pig eats");
    }
}