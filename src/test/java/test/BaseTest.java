package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import page.Calculator;

@Listeners(TestListener.class)
public class BaseTest {

    Calculator calculator;

    @BeforeClass(groups = {"smoke"})
    public void beforeClass() {
        calculator = new Calculator();
    }

    @AfterClass
    public void afterClass() {
        calculator = null;
    }
}
