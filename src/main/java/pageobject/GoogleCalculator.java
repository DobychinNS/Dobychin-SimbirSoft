package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GoogleCalculator {
    private final WebDriver driver;

    private final By btnOne = By.xpath("//div[@jsname='N10B9']");
    private final By btnMultiplication = By.xpath("//div[@jsname='YovRWb']");
    private final By btnTwo = By.xpath("//div[@jsname='lVjWed']");
    private final By btnMinus = By.xpath("//div[@jsname='pPHzQc']");
    private final By btnThree = By.xpath("//div[@jsname='KN1kY']");
    private final By btnPlus = By.xpath("//div[@jsname='XSr6wc']");
    private final By btnEqually = By.xpath("//div[@jsname='Pt8tGc']");

    public GoogleCalculator(WebDriver driver) {
        this.driver = driver;
    }

    public GoogleCalculator clickOne() {
        driver.findElement(btnOne).click();
        return this;
    }

    public GoogleCalculator clickTwo() {
        driver.findElement(btnTwo).click();
        return this;
    }

    public GoogleCalculator clickThree() {
        driver.findElement(btnThree).click();
        return this;
    }

    public GoogleCalculator clickMultiplication() {
        driver.findElement(btnMultiplication).click();
        return this;
    }

    public GoogleCalculator clickMinus() {
        driver.findElement(btnMinus).click();
        return this;
    }

    public GoogleCalculator clickPlus() {
        driver.findElement(btnPlus).click();
        return this;
    }

    public GoogleCalculator clickEqually() {
        driver.findElement(btnEqually).click();
        return this;
    }

    public GoogleCalculator assertFormula(String expected) {
        WebElement value = driver.findElement(By.xpath("//span[@class='vUGUtc']"));
        String formula = value.getText();
        Assert.assertEquals(formula, expected);
        return this;
    }

    public GoogleCalculator assertResult(String expected) {
        WebElement value = driver.findElement(By.xpath("//span[@class='qv3Wpe']"));
        String result = value.getText();
        Assert.assertEquals(result, expected);
        return this;
    }

}
