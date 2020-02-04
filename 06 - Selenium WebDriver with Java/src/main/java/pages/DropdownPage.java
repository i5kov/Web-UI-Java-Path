package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class DropdownPage extends BasePage {

    private final By dropdownField = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void selectDropdownOption(String option) {
        findDropdownElement(dropdownField).selectByVisibleText(option);
    }

    public List<String> getSelectedOptionsText() {
        List<String> selectedOptions = new ArrayList<>();
        List<WebElement> allSelectedOptions = findDropdownElement(dropdownField).getAllSelectedOptions();

        for (WebElement selectedOption : allSelectedOptions) {
            selectedOptions.add(selectedOption.getText());
        }
        return selectedOptions;
    }
}