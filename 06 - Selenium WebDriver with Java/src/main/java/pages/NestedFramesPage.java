package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage extends FramesPage {

    private static final String TOP_FRAME       = "frame-top";
    private static final String BOTTOM_FRAME    = "frame-bottom";
    private static final String LEFT_FRAME      = "frame-left";
    private By frameBody                        = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    public String getLeftFrameText() {
        switchToFrame(TOP_FRAME);
        switchToFrame(LEFT_FRAME);
        String leftFrameText = getFrameText();
        switchToMainFrame();
        switchToMainFrame();
        return leftFrameText;
    }

    public String getBottomFrameText() {
        switchToFrame(BOTTOM_FRAME);
        String bottomFrameText = getFrameText();
        switchToMainFrame();
        return bottomFrameText;
    }

    public String getFrameText() {
        return driver.findElement(frameBody).getText();
    }

    private void switchToFrame(String frameName) {
        driver.switchTo().frame(frameName);
    }

    private void switchToMainFrame() {
        driver.switchTo().parentFrame();
    }
}