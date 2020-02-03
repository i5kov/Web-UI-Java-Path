package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest {

    private static final String USERNAME = "tomsmith";
    private static final String PASSWORD = "SuperSecretPassword!";

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        loginPage.fillUsernameField(USERNAME);
        loginPage.fillPasswordField(PASSWORD);
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getMessageAfterLogin().contains("You logged into a secure area!"),
                "Message after login is not correct!");
    }

    @Test
    public void testLoginWithoutPassword() {
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        loginPage.fillUsernameField(USERNAME);
        loginPage.clickLoginButton();
        assertTrue(loginPage.getErrorMessageText().contains("password is invalid!"),
                  "The text of error message is not correct!");
    }

    @Test
    public void testLoginWithoutUsername() {
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        loginPage.fillPasswordField(PASSWORD);
        loginPage.clickLoginButton();
        assertTrue(loginPage.getErrorMessageText().contains("username is invalid!"),
                  "The text of error message is not correct!");
    }
}