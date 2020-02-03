package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickFormAuthenticationLink() {
        findElementAndClick("Form Authentication");
        return new LoginPage(driver);
    }

}
