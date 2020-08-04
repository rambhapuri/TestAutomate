package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void TestWaitUntilVisible(){
    var loadingPage = homePage.clickDynamicLoad().clickExample1();
    loadingPage.clickStart();
    assertEquals(loadingPage.getLoadedText(),"Hello World!", "Incorrect Text");
    }

    @Test
    public void TestWaitUntilStartVisible(){
        var loadingPage = homePage.clickDynamicLoad().clickExample2();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Incorrect Text");
    }
}