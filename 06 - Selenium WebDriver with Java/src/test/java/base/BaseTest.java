package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest {

    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.linkText("Example 1: Menu Element")).click();
        String h3Title = driver.findElement(By.tagName("h3")).getText();
        int linksCount = driver.findElements(By.cssSelector("ul li > a")).size();
        System.out.println(String.format("Links at [%s] page are %d", h3Title, linksCount));
        driver.quit();
    }

    public static void main(String[] args) {
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();
    }
}