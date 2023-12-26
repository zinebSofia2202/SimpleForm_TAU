package Fonctionalities;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgetPasswordPage;
import pages.SendPasswordPage;
import pages.SubmitPage;

public class ForgetPassTests extends BaseTests {
    @Test
    public void testSuccessfullySend() {
        forgetPasswordPage.setEmail("tomsmith.aa@gmail.com");
        SendPasswordPage sendPasswordPage = forgetPasswordPage.clickSendBtn();
    }
}