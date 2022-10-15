package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuappPage {
    public HerokuappPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@id='button']")
    public WebElement clickButton;

    @FindBy (xpath = "//*[text()=' down 32']")
    public List<WebElement> down32;

    @FindBy (xpath = "//p[text()='click']")
    public List<WebElement> clickText;


}
