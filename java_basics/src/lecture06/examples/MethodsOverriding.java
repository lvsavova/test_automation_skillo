package lecture06.examples;

class Animal {
    public void displayInfo() {
        System.out.println("Parent class");
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    public void displayInfo() {
        System.out.println("Child class");
        super.displayInfo();
        System.out.println("I am a dog.");
    }

}

class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}
