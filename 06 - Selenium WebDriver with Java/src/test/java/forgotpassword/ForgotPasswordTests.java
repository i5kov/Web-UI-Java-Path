package forgotpassword;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTest {

    @Test
    public void testForgotPasswordEmailSent() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPasswordLink();
        forgotPasswordPage.fillEmailField("testmail@test.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        assertTrue(emailSentPage.getEmailSentMessageText().contains("e-mail's been sent"),
                    "E-mail about forgotten password is not sent!");
    }
}