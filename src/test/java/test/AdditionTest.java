package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdditionTest extends BaseTest{

    @Test(groups = {"smoke"}, dataProvider = "numbersForCalculation", description = "Addition test", invocationCount = 2, threadPoolSize = 2)
    public void positiveSumTesting(int expected, int firstNum, int secondNum) {
        Assert.assertEquals(expected, calculator.addition(firstNum,secondNum));
    }

    @DataProvider
    public Object[][] numbersForCalculation() {
        return new Object[][]{
                {10, 3, 7},
                {-8, -5, -3},
                {0, 0, 0}
        };
    }

    @Test(groups = {"extended"}, description = "Testing of Addition With Negative Numbers")
    public void negativeSumTesting() {
        int expected = -5;
        int firstNum = 0;
        int secondNum = -5;
        Assert.assertEquals(expected, calculator.addition(firstNum,secondNum));
    }

    @Test(groups = {"extended"}, description = "Testing of Addition With Null")
    public void testingSumWithNull() {
        int expected = 13;
        int firstNum = 0;
        int secondNum = 13;
        Assert.assertEquals(expected, calculator.addition(firstNum,secondNum));
    }
}
