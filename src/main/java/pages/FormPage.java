package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;

public class FormPage {
    //create the driver
    private WebDriver driver;
    //create its by elements
    private By firstNameField = By.cssSelector("#first-name");
    private By lastNameField = By.cssSelector("#last-name");
    private By jobTitleField = By.cssSelector("#job-title");
    private By loginBtn = By.cssSelector("a[role='button']");
    private By menu = By.id("select-menu");

    //create the constructor
    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    //methode of enter the element in the fields
    public void setFirst(String first) {

        driver.findElement(firstNameField).sendKeys(first);
    }

    public void setSecond(String second) {

        driver.findElement(lastNameField).sendKeys(second);
    }

    public void setJob(String job) {

        driver.findElement(jobTitleField).sendKeys(job);
    }

   /* public void setOption(String option) {
                Select selectObject = new Select(driver.findElement(By.id("select-menu")));
        selectObject.selectByVisibleText(option);
        // getting the list of options in the dropdown with getOptions()
        List <WebElement> op = selectObject.getOptions();
        int size = op.size();
        for(int i =0; i<size ; i++){
            String options = op.get(i).getText();
            System.out.println(options);
        }
    }*/
    //methode of enter the element in the fields
    public SubmitPage clickLoginBtn() {
        driver.findElement(loginBtn).click();
        return new SubmitPage(driver);
    }
}
