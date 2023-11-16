package lecture10.examples;

import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderMultipleParamsTests {
    @DataProvider(name = "generateNumbers")
    public Object[][] generateNumbers() {
        return new Object[][]{
                {2, 3, 5},
                {5, 7, 9}
        };
    }

    @Test(dataProvider = "generateNumbers")
    public void testDataProviderMultipleParameters(int a, int b, int expectedSum) {
        int sum = a + b;
        Assert.assertEquals(expectedSum, sum);
    }

}
