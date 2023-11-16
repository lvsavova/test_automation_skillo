package lecture10.examples;

import org.testng.annotations.Test;

public class TestMethods {
    @Test
    public void myFirstTestNGTestCase() {
        System.out.println("This is my first testNG test case");
    }

    @Test(groups = "example")
    public void groupExample() {
        System.out.println("This is a test");
    }

}
