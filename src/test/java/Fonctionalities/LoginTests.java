package Fonctionalities;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import base.BaseTests;
import pages.FormPage;
import pages.SubmitPage;

public class LoginTests extends BaseTests{
    @Test
    public void testSuccessfullyLogin(){
        formPage.setFirst("tomsmith");
        formPage.setSecond("Super");
        formPage.setJob("Super");
       // formPage.setOption("0-1");
        SubmitPage submitPage =formPage.clickLoginBtn();
       // Assert.assertTrue(submitPage.getAlertMsg().contains("The form was successfully submitted!"));

    }
}
