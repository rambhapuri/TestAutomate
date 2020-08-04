package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class hoverTests extends BaseTests {
    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not Displayed");
        assertEquals(caption.getTitle(),"name: user1","Caption Title Incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Link Text Incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link Incorrect");
    }
}
