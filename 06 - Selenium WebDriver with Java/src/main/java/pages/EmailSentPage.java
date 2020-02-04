package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage extends BasePage {

    private final By emailSentMessage = By.id("content");

    public EmailSentPage(WebDriver driver) {
        super(driver);
    }

    public String getEmailSentMessageText() {
        return driver.findElement(emailSentMessage).getText();
    }
}
