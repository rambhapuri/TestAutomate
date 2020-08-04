package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {

    @Test
    public void testBackSpace(){
        var keypage = homePage.clickKeyPresses();
        keypage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keypage.getResult(),"You entered: BACK_SPACE");
    }

}
