package alerts;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FileUploaderPage;

import java.io.File;

import static org.testng.Assert.assertEquals;

public class UploadFileTests extends BaseTest {

    @Test
    public void testUploadFile() {
        String expectedPageHeader = "File Uploader";
        String expectedUploadFile = "chromedriver.exe";
        FileUploaderPage fileUploaderPage = homePage.clickFileUploadLink();
        assertEquals(fileUploaderPage.getMainHeaderTextPage(), expectedPageHeader,
                        String.format("You are not at [%s] page!", expectedPageHeader));
        String absolutePath = fileUploaderPage.getAbsolutePath(new File("resources/" + expectedUploadFile));
        fileUploaderPage.uploadFile(absolutePath);
        assertEquals(fileUploaderPage.getUploadedFiles(), expectedUploadFile, "Uploaded file not correct!");
    }
}