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

    public HorizontalSliderPage clickHorizontalSliderLink() {
        findElementAndClick("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertsPage clickJavaScriptAlertsLink() {
        findElementAndClick("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploaderPage clickFileUploadLink() {
        findElementAndClick("File Upload");
        return new FileUploaderPage(driver);
    }

}