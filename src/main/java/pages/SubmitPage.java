package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubmitPage {
    //create the driver
    private WebDriver driver;
    //create its by elements
    private By alertMsg = By.tagName("div");
    //create the constructor
    public SubmitPage(WebDriver driver) {
        this.driver = driver;
    }
    //create the methode of the next page type(not exist next page so the type is the type of the result of the alert msg)
    //to make sure of the page it's the secure page
    public String getAlertMsg(){
        return driver.findElement(alertMsg).getText();
    }
}
