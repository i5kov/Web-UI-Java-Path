package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicallyLoadedElementsPage extends BasePage {

    private final By startButton    = By.cssSelector("#start button");
    private final By loadedText     = By.id("finish");

    public DynamicallyLoadedElementsPage(WebDriver driver) {
        super(driver);
    }

    public void clickStartButton() {
        long timeOutInSeconds = 5;
        findElementAndClick(startButton);
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText();
    }

}
