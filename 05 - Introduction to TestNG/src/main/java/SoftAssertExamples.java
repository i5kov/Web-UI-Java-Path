import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExamples {

    private SoftAssert softAssert = new SoftAssert();

    @Test
    public void softAssertExamples() {

        softAssert.assertEquals(1, 2, "Values are not equals!");
        System.out.println("1. Verify equality of values");

        softAssert.assertTrue(true, "Condition is not true!");
        System.out.println("2. Verify value of condition!");

        softAssert.assertAll();
    }
}