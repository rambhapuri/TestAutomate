package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        //assertEquals(secureAreaPage.getAlertText(),"You logged into a secure area!","Alert Text is Incorrect");
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert Text is Incorrect");
    }

    @Test
    public void testUnSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("kiran");
        loginPage.setPassword("admin");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(!secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert Text is Incorrect");
    }
}
