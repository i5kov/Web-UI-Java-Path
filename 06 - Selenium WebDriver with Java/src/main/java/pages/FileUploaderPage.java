package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class FileUploaderPage extends BasePage {

    private final By pageHeader       = By.cssSelector(".example > h3");
    private final By chooseFileButton = By.id("file-upload");
    private final By uploadButton     = By.id("file-submit");
    private final By uploadedFiles    = By.id("uploaded-files");

    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    public void clickUploadButton() {
        findElementAndClick(uploadButton);
    }

    public void uploadFile(String absolutePathOfFile) {
        driver.findElement(chooseFileButton).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getAbsolutePath(File fileName) {
        return fileName.getAbsolutePath();
    }

    public String getUploadedFiles() {
        return driver.findElement(uploadedFiles).getText();
    }

    public String getMainHeaderTextPage() {
        return getPageHeader(pageHeader);
    }
}