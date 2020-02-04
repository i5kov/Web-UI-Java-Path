package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends BasePage {

    private final By emailField               = By.id("email");
    private final By retrievePasswordButton   = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void fillEmailField(String email) {
        findElementAndEnterTextInIt(emailField, email);
    }

    public EmailSentPage clickRetrievePasswordButton() {
        findElementAndClick(retrievePasswordButton);
        return new EmailSentPage(driver);
    }

}
