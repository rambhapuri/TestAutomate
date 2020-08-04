package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(),"You successfuly clicked an alert", "Result Incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String value = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(value,"I am a JS Confirm","test is incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();
        String text = "Hello World";
        alertPage.alert_SetInput(text);
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(), "You entered: Hello World","Incorrect Text");
    }
}
