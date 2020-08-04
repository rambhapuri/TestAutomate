package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testFrames(){
        var framesPage = homePage.clickWYSIWYG();
        String text1 = "Hello ";
        String text2 = "World";
        framesPage.clearTextArea();

        framesPage.setTextArea(text1);
        framesPage.decreseIndent();
        framesPage.setTextArea(text2);
        assertEquals(framesPage.getTextFromEditor(), text1+text2, "Incorrect text message");
    }

    @Test
    public void testNestedFrames(){
        var nestedFramesPage = homePage.clickFrames().clickNestedFrame();

        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Incorrect Text");
    }
}
