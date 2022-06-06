package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Google {
    public static final String URL = "https://www.google.com";
    private final WebDriver driver;

    private final By inputSearch = By.xpath("//input[@class='gLFyf gsfi']");
    private final By btnSearch = By.xpath("//div[@class='CqAVzb lJ9FBc']//input[@class='gNO89b']");

    public Google(WebDriver driver) {
        this.driver = driver;
    }

    public Google setValueSearch(String value) {
        driver.findElement(inputSearch).sendKeys(value);
        return this;
    }

    public Google clickSearch() {
        driver.findElement(btnSearch).click();
        return this;
    }

}
