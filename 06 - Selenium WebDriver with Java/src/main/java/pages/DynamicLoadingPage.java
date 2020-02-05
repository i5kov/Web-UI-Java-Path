package pages;

import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage extends BasePage {

    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    public DynamicallyLoadedElementsPage clickExample2Link() {
        findElementAndClick("Example 2: Element rendered after the fact");
        return new DynamicallyLoadedElementsPage(driver);
    }


}
