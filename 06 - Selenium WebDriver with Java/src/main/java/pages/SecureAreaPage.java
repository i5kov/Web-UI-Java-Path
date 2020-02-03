package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePage {

    private final By messageAfterLogin = By.id("flash");

    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    public String getMessageAfterLogin() {
        return driver.findElement(messageAfterLogin).getText();
    }
}
