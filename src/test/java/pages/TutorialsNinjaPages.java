package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialsNinjaPages {
    public TutorialsNinjaPages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Phones & PDAs']")
    public WebElement phonesPDAsButton;

    @FindBy(tagName = "//h4")
    public List<WebElement> telephoneNames;
}
