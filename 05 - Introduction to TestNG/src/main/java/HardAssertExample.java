import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void hardAssertExamples() {

        Assert.assertEquals(1, 2, "Values are not equals!");
        System.out.println("1. Verify equality of values");

        Assert.assertTrue(true, "Condition is not true!");
        System.out.println("2. Verify value of condition!");

    }
}