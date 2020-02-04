package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    protected final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void findElementAndClick(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    protected void findElementAndClick(By selector) {
        driver.findElement(selector).click();
    }

    protected void findElementAndEnterTextInIt(By selector, String textToBeEntered) {
        driver.findElement(selector).sendKeys(textToBeEntered);
    }
    
    protected Select findDropdownElement(By selector) {
        return new Select(driver.findElement(selector));
    }

    protected String getPageHeader(By selector) {
        return driver.findElement(selector).getText();
    }
}