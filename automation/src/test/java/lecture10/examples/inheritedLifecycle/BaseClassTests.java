package lecture10.examples.inheritedLifecycle;

import org.testng.annotations.*;

public class BaseClassTests {
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("[BASE][@BeforeMethod]");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("[BASE][@AfterMethod]");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("[BASE][@BeforeClass]");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("[BASE][@AfterClass]");
    }

    @Test
    public void testName() {
        System.out.println("[BASE][@Test]");
    }
}
