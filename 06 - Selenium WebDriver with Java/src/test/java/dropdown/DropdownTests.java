package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTest {

    @Test
    public void testDropdownSelection() {
        DropdownPage dropdownPage = homePage.clickDropdownLink();
        String optionToBeSelected = "Option 1";
        dropdownPage.selectDropdownOption(optionToBeSelected);
        List<String> selectedOptionsText = dropdownPage.getSelectedOptionsText();
        int numberOfSelectedOptions = 1;
        assertEquals(selectedOptionsText.size(), numberOfSelectedOptions, "Selected options are more than 1!");
        assertTrue(selectedOptionsText.contains(optionToBeSelected), "The desired option is not selected!");
    }
}