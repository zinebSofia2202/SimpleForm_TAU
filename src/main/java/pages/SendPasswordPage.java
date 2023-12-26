package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendPasswordPage {
    //create the driver
    private WebDriver driver;
    //create its by elements
    private By Msg = By.cssSelector("body h1");
    //create the constructor
    public SendPasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    //create the methode of the next page type(not exist next page so the type is the type of the result of the alert msg)
    //to make sure of the page it's the secure page
    public String getMsg(){
        return driver.findElement(Msg).getText();
    }
}