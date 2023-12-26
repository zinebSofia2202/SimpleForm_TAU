package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {
    //create the driver
    private WebDriver driver;
    //create its by elements
    private By PasswordField = By.id("email");
    private By SendBtn = By.tagName("i");

    //create the constructor
    public ForgetPasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    //methode of enter the element in the fields
    public void setEmail(String email) {

        driver.findElement(PasswordField).sendKeys(email);
    }
    public SendPasswordPage clickSendBtn() {
        driver.findElement(SendBtn).click();
        return new SendPasswordPage(driver);
    }

}
