package lecture06.examples;

public class MethodParametersExample {
    public static void main(String[] args) {
        String weasley1 = "Ron";

        sayHi(weasley1);
        sayHi("Fred");
        sayHi("Ginny");

        sayAge(weasley1, 15);
        sayAge("Fred", 17);
        sayAge("Ginny", 14);
    }

    static void sayHi(String name) {
        System.out.println("Hi " + name + "!");
    }

    static void sayAge(String name, int age) {
        System.out.println(name + " is " + age + " years old");
    }
}
