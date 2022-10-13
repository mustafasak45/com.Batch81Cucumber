package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EditorDatabasePage {
    public EditorDatabasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@type='text']")
    public List<WebElement> textBoxList;

    @FindBy (xpath = "(//span)[9]")
    public WebElement newButton;

    @FindBy (xpath = "//*[@class='btn']")
    public WebElement createButton;


    @FindBy (xpath = "//*[@type='search']")
    public WebElement searchBox;

    @FindBy (xpath = "//tbody")
    public WebElement tablo;

    @FindBy (xpath = "//tbody//tr//td[2]")
    public WebElement tablodaIsim;


}
