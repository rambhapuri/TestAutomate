package forgotpassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testEmailSentMessage(){
        ForgotPasswordPage forgotpasswordPage = homePage.clickForgotPassword();
        forgotpasswordPage.setEmailField("kiran@rambhapuri.com");
        EmailSentPage emailsentpage = forgotpasswordPage.clickRetrieveButton();
        Assert.assertTrue(emailsentpage.getAlertText().contains("Your e-mail's been sent!"),"Incorrect Content");
    }
}
