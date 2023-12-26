package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.ForgetPasswordPage;
import pages.FormPage;

public class BaseTests {
    private WebDriver driver;
    protected FormPage formPage;
    protected ForgetPasswordPage forgetPasswordPage;
    @BeforeTest
    public void setup(){
        //set the place of the chrome driver
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //initialise the driver
        driver=new ChromeDriver();
        //open the url
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        formPage =new FormPage(driver);
        forgetPasswordPage=new ForgetPasswordPage(driver);

    }
    @AfterTest
    public void tearDown(){
        //driver.quit();
        System.out.println("Done");
    }
}
