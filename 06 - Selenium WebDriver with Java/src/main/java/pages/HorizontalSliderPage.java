package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class HorizontalSliderPage extends BasePage {

    private By mainHeaderPage   = By.cssSelector(".example > h3");
    private By slider           = By.cssSelector("input[type='range']");
    private By range            = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    public void moveSliderPointer(String value) {
        while(!getSliderRange().equals(value)){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getSliderRange() {
        return driver.findElement(range).getText();
    }

    public String getMainHeaderPageText() {
        return getPageHeader(mainHeaderPage);
    }



}
