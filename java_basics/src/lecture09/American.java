package lecture09;

public class American extends Person {
    public American(String name, String sex, String job, String EGN, String religion) {
        super(name, sex, "English", "American", EGN, religion, job, "USA");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    @Override
    public Boolean isAdult() {
        return this.age >= 21;
    }

    public void watchAmericanFootball() {
        System.out.println("I am watching American Football");
    }
}
