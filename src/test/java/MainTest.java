import org.testng.annotations.Test;
import pageobject.Google;
import pageobject.GoogleCalculator;
import settings.SettingsTest;

public class MainTest extends SettingsTest {

    @Test
    public void Test() {
        Google google = new Google(driver);
        GoogleCalculator googleCalculator = new GoogleCalculator(driver);

        driver.get(Google.URL);
        google.setValueSearch("Калькулятор")
                .clickSearch();
        googleCalculator.clickOne()
                .clickMultiplication()
                .clickTwo()
                .clickMinus()
                .clickThree()
                .clickPlus()
                .clickOne()
                .clickEqually()
                .assertFormula("1 × 2 - 3 + 1 =")
                .assertResult("0");
    }
}
