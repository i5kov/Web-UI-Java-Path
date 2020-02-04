package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage extends BasePage {

    private final By mainHeaderPage   = By.cssSelector(".example > h3");
    private final By slider           = By.cssSelector("input[type='range']");
    private final By range            = By.id("range");

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
