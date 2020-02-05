package frames;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.NestedFramesPage;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTest {

    @Test
    public void testFramesText() {
        String expectedLeftFrameText = "LEFT";
        String expectedBottomFrameText = "BOTTOM";
        NestedFramesPage nestedFramesPage = homePage.clickFramesLink().clickNestedFramesLink();
        assertEquals(nestedFramesPage.getLeftFrameText(), expectedLeftFrameText,
                    String.format("The text is not correct or you're not in the %s frame!", expectedLeftFrameText));
        assertEquals(nestedFramesPage.getBottomFrameText(), expectedBottomFrameText,
                     String.format("The text is not correct or you're not in the %s frame!", expectedBottomFrameText));
    }
}