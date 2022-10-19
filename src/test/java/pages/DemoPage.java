package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoPage {
    public DemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//*[.='Alerts'])[1]")
    public WebElement alertWE;

    @FindBy (xpath = "//*[@class='btn btn-light ']")
    public List<WebElement> alertWEList;


    @FindBy (xpath = "//*[@id='timerAlertButton']")
    public WebElement fiveSecondsButton;


    @FindBy (xpath = "//*[@id='enableAfter']")
    public WebElement enableButton;

    @FindBy (xpath = "//*[@id='visibleAfter']")
    public WebElement visibleAfter5SecondButton;

}
