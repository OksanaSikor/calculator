package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTest extends BaseTest{
    @Test(groups = {"smoke"}, priority = 1)
    public void positiveDivisionTesting() {
        int expected = 3;
        int firstNum = 9;
        int secondNum = 3;
        Assert.assertEquals(expected, calculator.division(firstNum,secondNum));
    }

    @Test(groups = {"extended"}, retryAnalyzer = Retry.class, priority = 2)
    public void negativeDivisionTesting() {
        int expected = -10;
        int firstNum = 5;
        int secondNum = -2;
        Assert.assertEquals(expected, calculator.division(firstNum,secondNum));
    }

    @Test(expectedExceptions = ArithmeticException.class, groups = {"smoke", "exceptions"}, retryAnalyzer = Retry.class)
    public void testingDivisionByNull() {
        int firstNum = 5;
        int secondNum = 0;
        calculator.division(firstNum,secondNum);
    }
}
