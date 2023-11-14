package lecture09;

public class Bulgarian extends Person {

    public Bulgarian(String name, String sex, String EGN, String religion, String job) {
        super(name, sex, "Bulgarian", "Bulgarian", EGN, religion, job, "Bulgaria");
    }

    @Override
    public void sayHello() {
        System.out.println("Здравей");
    }

    @Override
    public Boolean isAdult() {
        return this.age >= 18;
    }

    public void danceHoro() {
        System.out.println("Аз танцувам хоро!");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(this.name);
        sb.append("EGN: ").append(this.EGN);
        return sb.toString();
    }
}
