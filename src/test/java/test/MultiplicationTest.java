package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiplicationTest extends BaseTest{

    @BeforeMethod
    public void beforeMethodMessage(){
        System.out.println(" ==== Preparation for Test Method ===");
    }

    @AfterMethod
    public void afterMethodMessage(){
        System.out.println(" ==== Cleaning after Test Method ===");
    }

    @Test(groups = {"smoke"})
    public void positiveMultiplicationTesting() {
        int expected = 50;
        int firstNum = 5;
        int secondNum = 10;
        Assert.assertEquals(expected, calculator.multiplication(firstNum,secondNum));
    }

    @Test(groups = {"extended"})
    public void negativeMultiplicationTesting() {
        int expected = 0;
        int firstNum = 0;
        int secondNum = -5;
        Assert.assertEquals(expected, calculator.multiplication(firstNum,secondNum));
    }
}
