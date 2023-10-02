package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionTest extends BaseTest{

    @Test(groups = {"smoke"})
    public void positiveSubtractionTesting() {
        int expected = 4;
        int firstNum = 9;
        int secondNum = 5;
        Assert.assertEquals(expected, calculator.subtraction(firstNum,secondNum));
    }

    @Test(groups = {"extended"}, retryAnalyzer = Retry.class)
    public void negativeSubtractionTesting() {
        int expected = 1;
        int firstNum = -2;
        int secondNum = -3;
        Assert.assertEquals(expected, calculator.subtraction(firstNum,secondNum));
    }

    @Test(groups = {"extended"})
    public void testingSubtractionWithNull() {
        int expected = -2;
        int firstNum = 0;
        int secondNum = -2;
        Assert.assertEquals(-8, calculator.addition(0,-8));
    }

}
