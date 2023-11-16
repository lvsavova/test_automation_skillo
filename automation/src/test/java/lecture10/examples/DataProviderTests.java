package lecture10.examples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTests {
    @DataProvider(name = "generateValues")
    public Object[][] generateValuesProvider() {
        return new Object[][] {
                {"First-Value", 1, "1"},
                {"Second-Value", 2, "2"},
                {"Third-Value", 3, "3"},
        };
    }
    @Test(dataProvider = "generateValues")
    public void testDataProvider(String val, int val2, String val3) {
        System.out.println("Passed Parameter Is : " + val);
        System.out.println("Passed Parameter Is : " + val2);
        System.out.println("Passed Parameter Is : " + val3);
    }
}
