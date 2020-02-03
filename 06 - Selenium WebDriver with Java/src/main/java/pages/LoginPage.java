package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton   = By.cssSelector("#login button[type='submit']");
    private final By errorMessage  = By.cssSelector(".error");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fillUsernameField(String username) {
        findElementAndEnterTextInIt(usernameField, username);
    }

    public void fillPasswordField(String password) {
        findElementAndEnterTextInIt(passwordField, password);
    }

    public SecureAreaPage clickLoginButton() {
        findElementAndClick(loginButton);
        return new SecureAreaPage(driver);
    }

    public String getErrorMessageText() {
        return driver.findElement(errorMessage).getText();
    }
}
