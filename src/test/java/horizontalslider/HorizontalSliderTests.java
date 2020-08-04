package horizontalslider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testOneArrow(){
        String value = "3.5";
        var horizontalpage = homePage.clickHorizontalSlider();
        horizontalpage.setSliderValue(value);
        assertEquals(horizontalpage.getSliderValue(), value,"slider value is Incorrect");
    }
}
