package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void findElementAndClick(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public void findElementAndClick(By selector) {
        driver.findElement(selector).click();
    }

    public void findElementAndEnterTextInIt(By selector, String textToBeEntered) {
        driver.findElement(selector).sendKeys(textToBeEntered);
    }


}
