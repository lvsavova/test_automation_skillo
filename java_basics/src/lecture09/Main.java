package lecture09;

public class Main {
    public static void main(String[] args) {
        Bulgarian bulgarian = new Bulgarian("Gosho", "Male", "8912125647", "Orthodox", "QA");
        System.out.println(bulgarian.toString());
        bulgarian.sayHello();
        bulgarian.danceHoro();
        bulgarian.celebrateEaster();
        System.out.println("--------------------------");

        Italian italian = new Italian("Bella", "Female", "dancer", "8909125647", "Catholic");
        System.out.println(italian.toString());
        italian.sayHello();
        italian.cookPizza();
        italian.celebrateEaster();
        System.out.println("--------------------------");

        American american = new American("John", "Male", "Architect", "0549125647", "Islam");
        System.out.println(american.toString());
        american.sayHello();
        american.watchAmericanFootball();
        american.celebrateEaster();
        System.out.println("--------------------------");
    }
}
