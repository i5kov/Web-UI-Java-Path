package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickFormAuthenticaionLink();
        loginPage.fillUsernameField("tomsmith");
        loginPage.fillPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getMessageAfterLogin().contains("You logged into a secure area!"),
                "Message after login is not correct!");
    }

    @Test
    public void testLoginWithoutPassword() {
        LoginPage loginPage = homePage.clickFormAuthenticaionLink();
        loginPage.fillUsernameField("tomsmith");
        loginPage.clickLoginButton();
        assertTrue(loginPage.getErrorMessageText().contains("password is invalid!"),
                  "The text of error message is not correct!");
    }

    @Test
    public void testLoginWithoutUsername() {
        LoginPage loginPage = homePage.clickFormAuthenticaionLink();
        loginPage.fillPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        assertTrue(loginPage.getErrorMessageText().contains("username is invalid!"),
                  "The text of error message is not correct!");
    }
}