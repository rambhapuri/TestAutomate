package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("C:\\Users\\rambhapuritech1\\IdeaProjects\\TestAutomate\\resources\\chromedriver.exe");
        assertEquals(fileUploadPage.getUploadedFiles(),"chromedriver.exe","Incorrect name");
    }
}
