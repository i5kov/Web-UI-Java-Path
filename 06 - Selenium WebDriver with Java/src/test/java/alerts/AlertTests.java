package alerts;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AlertTests extends BaseTest {

    @Test
    public void testAcceptAlert() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlertsLink();
        alertsPage.clickJSAlertButton();
        alertsPage.alert_clickOkButton();
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert",
                    "Result message incorrect!");
    }

    @Test
    public void testCancelButtonAlert() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlertsLink();
        alertsPage.clickJSConfirmButton();
        alertsPage.alert_clickCancelButton();
        assertTrue(alertsPage.getResult().contains("Cancel"), "Cancel button at alert message not pressed!");
    }

    @Test
    public void testFillInTextInAlert() {
        String text = "test";
        AlertsPage alertsPage = homePage.clickJavaScriptAlertsLink();
        alertsPage.clickJSPromptButton();
        alertsPage.alert_fillInAlertField(text);
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Entered text is not valid!");
    }

}
