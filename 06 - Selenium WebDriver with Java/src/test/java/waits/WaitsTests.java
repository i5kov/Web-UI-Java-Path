package waits;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicallyLoadedElementsPage;

import static org.testng.Assert.assertEquals;

public class WaitsTests extends BaseTest {

    @Test
    public void testWaitElementToBePresented() {
        String expectedLoadedText = "Hello World!";
        var dynamicallyLoadedElementsPage = homePage.clickDynamicLoadingLink().clickExample2Link();
        dynamicallyLoadedElementsPage.clickStartButton();
        assertEquals(dynamicallyLoadedElementsPage.getLoadedText(), expectedLoadedText,
                    "The loaded text is not the same as expected one!");
    }
}
