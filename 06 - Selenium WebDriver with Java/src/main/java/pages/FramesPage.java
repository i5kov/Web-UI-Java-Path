package pages;

import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage {

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public NestedFramesPage clickNestedFramesLink() {
        findElementAndClick("Nested Frames");
        return new NestedFramesPage(driver);
    }

}
