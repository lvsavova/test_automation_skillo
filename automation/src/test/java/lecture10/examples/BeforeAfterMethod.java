package lecture10.examples;

import org.testng.annotations.*;

public class BeforeAfterMethod {
    @BeforeMethod
    public void setUp() {
        System.out.println("Before each test method");
    }

    @Test
    public void testMethod1() {
        System.out.println("Test method1");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test method2");
    }

    @AfterMethod
    public void cleanUp() {
        System.out.println("After each test method");
    }
}
