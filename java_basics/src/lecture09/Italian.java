package lecture09;

public class Italian extends Person {
    public Italian(String name, String sex, String job, String EGN, String religion) {
        super(name, sex, "Italian", "Italian", EGN, religion, job, "Italy");
    }

    @Override
    public void sayHello() {
        System.out.println("Ciao!");
    }

    @Override
    public Boolean isAdult() {
        return this.age >= 18;
    }

    public void cookPizza() {
        System.out.println("I am cooking a pizza!");
    }
}
