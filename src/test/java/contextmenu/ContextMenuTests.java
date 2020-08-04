package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu(){
        var contextMenu = homePage.clickContextMenu();
        contextMenu.clickRightButton();
        String value = contextMenu.getContextMenuText();
        contextMenu.clickAcceptButton();
        assertEquals(value,"You selected a context menu", "Alert Text is Incorrect");
    }
}
