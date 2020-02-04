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

    public DropdownPage clickDropdownLink() {
        findElementAndClick("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage clickForgotPasswordLink() {
        findElementAndClick("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

<<<<<<< HEAD
    public HorizontalSliderPage clickHorizontalSliderLink() {
        findElementAndClick("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

=======
>>>>>>> 8eeb8c64271eb9df60b164f1d02c8e095e0a899b
}