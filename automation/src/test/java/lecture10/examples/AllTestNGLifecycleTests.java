package lecture10.examples;

import org.testng.annotations.*;

public class AllTestNGLifecycleTests {

    @BeforeSuite
    public void testBeforeSuite() {
        System.out.println("@BeforeSuite");
    }

    @BeforeTest
    public void testBeforeTest() {
        System.out.println("--@BeforeTest");
    }

    @BeforeClass
    public void testBeforeClass() {
        System.out.println("----@BeforeClass");
    }

    @BeforeMethod(alwaysRun = true)
    public void testBeforeMethod() {
        System.out.println("------@BeforeMethod");
    }

    @Test
    public void testName() {
        System.out.println("--------@Test");
    }

    @Test
    public void testName1() {
        System.out.println("--------@Test");
    }

    @AfterMethod
    public void testAfterMethod() {
        System.out.println("------@AfterMethod");
    }

    @AfterClass
    public void testAfterClass() {
        System.out.println("----@AfterClass");
    }

    @AfterTest
    public void testAfterTest() {
        System.out.println("--@AfterTest");
    }

    @AfterSuite
    public void testAfterSuite() {
        System.out.println("@AfterSuite");
    }
}