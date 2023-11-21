package lecture10.exercises;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// C:\Users\lvsav\IdeaProjects\sk07_automation\automation\src\test\java\lecture10\exercises\Exercises.java
// automation/src/test/java/lecture10/exercises/Exercises.java
public class Exercises {

    @DataProvider(name = "additionNumbers")
    public Object[][] generateAdditionNumbers() {
        Object[][] numbers = {
                {2, 3, 5},
                {-100, 5, -95},
                {6, 7, 13},
                {3, 5, 12}
        };
        return numbers;
    }

    @Test(groups = "sum", dataProvider = "additionNumbers")
    public void sum(int x, int y, int expectedResult) {
        int sumResult = x + y;
        Assert.assertEquals(sumResult, expectedResult,
                String.format("Incorrect sum result for (%s) + (%s)", x, y));
    }

    @DataProvider(name = "subtractNumbers")
    public Object[][] generateSubtractNumbers() {
        Object[][] numbers = {
                {2, 3, -1},
                {-100, 5, -105},
                {9, 7, 2},
                {9, 7, 3},
        };
        return numbers;
    }

    @Test(groups = "subtract", dataProvider = "subtractNumbers")
    public void subtract(int x, int y, int expectedResult) {
        int subtractResult = x - y;
        Assert.assertEquals(subtractResult, expectedResult,
                String.format("Incorrect subtract result for (%s) - (%s). Actual subtract - %s", x, y, subtractResult));
    }

    @DataProvider(name = "multiplyNumbers")
    public Object[][] generateMultiplyNumbers() {
        Object[][] numbers = {
                {2, 3, 6},
                {-100, 5, -500},
                {9, 7, 63},
        };
        return numbers;
    }

    @Test(groups = "multiply", dataProvider = "multiplyNumbers")
    public void multiply(int x, int y, int expectedResult) {
        int multiplyResult = x * y;
        Assert.assertEquals(multiplyResult, expectedResult,
                String.format("Incorrect multiply result for %s * %s", x, y));
    }

    @DataProvider(name = "divideNumbers")
    public Object[][] generateDivideNumbers() {
        Object[][] numbers = {
                {2, 3, 0},
                {-100, 5, -20},
                {9, 7, 1},
                {9, 0, 0},
                {9, 1, 1},
        };
        return numbers;
    }

    @Test(groups = "divide", dataProvider = "divideNumbers")
    public void divide(int x, int y, int expectedResult) {
        try {
            int divideResult = x / y;
            Assert.assertEquals(divideResult, expectedResult,
                    String.format("Incorrect divide result for %s / %s", x, y));
        } catch (ArithmeticException e) {
            if (y != 0) {
                throw e;
            }
            Assert.assertEquals(e.getMessage(), "/ by zero");
        }
    }

    @DataProvider(name = "remainderNumbers")
    public Object[][] generateRemainderNumbers() {
        Object[][] numbers = {
                {2, 3, 2},
                {-100, 5, 0},
                {9, 0, 2},
        };
        return numbers;
    }

    @Test(groups = "remainder", dataProvider = "remainderNumbers")
    public void remainder(int x, int y, int expectedResult) {
        try {
            int remainderResult = x % y;
            Assert.assertEquals(remainderResult, expectedResult,
                    String.format("Incorrect remainder result for %s / %s", x, y));
        } catch (ArithmeticException e) {
            if (y != 0) {
                throw e;
            }
            Assert.assertEquals(e.getMessage(), "/ by zero");
        }
    }
}
