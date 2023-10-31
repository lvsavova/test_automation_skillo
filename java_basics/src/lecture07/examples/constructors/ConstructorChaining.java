package lecture07.examples.constructors;

public class ConstructorChaining {
    public static void main(String[] args) {
        System.out.println("1. Creating object A");
        A a = new A();
        System.out.println("2. Creating object B");
        B b = new B();
        System.out.println("3. Creating object C");
        C c = new C();

    }
}
// C -> B -> A
class A {
    public A() {
        System.out.println("Calling constructor of class A");
    }
}

class B extends A{
    public B() {
        System.out.println("Calling constructor of class B");
    }
}

class C extends B{
    public C() {
        System.out.println("Calling constructor of class C");
    }
}
