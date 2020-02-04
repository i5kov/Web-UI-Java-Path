package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends BasePage {

    private final By jsAlertButton      = By.xpath("//button[text()='Click for JS Alert']");
    private final By jsConfirmButton    = By.xpath("//button[text()='Click for JS Confirm']");
    private final By jsPromptButton     = By.xpath("//button[text()='Click for JS Prompt']");
    private final By result             = By.id("result");

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void clickJSAlertButton() {
        findElementAndClick(jsAlertButton);
    }

    public void clickJSConfirmButton() {
        findElementAndClick(jsConfirmButton);
    }

    public void clickJSPromptButton() {
        findElementAndClick(jsPromptButton);
    }

    public void alert_clickOkButton() {
        driver.switchTo().alert().accept();
    }

    public void alert_clickCancelButton() {
        driver.switchTo().alert().dismiss();
    }

    public void alert_fillInAlertField(String text) {
        driver.switchTo().alert().sendKeys(text);
        alert_clickOkButton();
    }

    public String getResult() {
        return driver.findElement(result).getText();
    }
}
