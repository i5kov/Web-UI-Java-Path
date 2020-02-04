package slider;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTest {

    @Test
    public void testSliderRange() {
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSliderLink();
        String expectedMainHeaderPage = "Horizontal Slider";
        assertEquals(horizontalSliderPage.getMainHeaderPageText(), expectedMainHeaderPage,
                    String.format("You are not at '%s' page", expectedMainHeaderPage));
        String sliderValue = "4";
        horizontalSliderPage.moveSliderPointer(sliderValue);
        assertEquals(horizontalSliderPage.getSliderRange(), sliderValue,
                    "Selected range on the slider is not correct!");
    }
}
