package lecture10.examples.inheritedLifecycle;

import org.testng.annotations.*;

public class ChildClassTests extends BaseClassTests {
    @BeforeMethod
    public void beforeMethodChild() {
        System.out.println("[CHILD][@BeforeMethod]");
    }

    @AfterMethod
    public void afterMethodChild() {
        System.out.println("[CHILD][@AfterMethod]");
    }

    @BeforeClass
    public void beforeClassChild() {
        System.out.println("[CHILD][@BeforeClass]");
    }

    @AfterClass
    public void afterClassChild() {
        System.out.println("[CHILD][@AfterClass]");
    }

    @Test
    public void testName() {
        System.out.println("[CHILD][@Test]");
    }

}
