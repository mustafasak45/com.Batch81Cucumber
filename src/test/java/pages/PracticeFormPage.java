package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeFormPage {

    public PracticeFormPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement passWord;

    @FindBy(xpath = "//*[@name='comments']")
    public WebElement textArea;

    @FindBy(xpath = "//*[@name='filename']")
    public WebElement chooseFile;

    @FindBy(xpath = "//*[@value='cb1']")
    public WebElement checkbox1;

    @FindBy(xpath = "//*[@value='cb2']")
    public WebElement checkbox2;

    @FindBy(xpath = "//*[@value='cb3']")
    public WebElement checkbox3;

    @FindBy(xpath = "//*[@value='rd2']")
    public WebElement radiobutton2;

    @FindBy(xpath = "//option[@value='ms3']")
    public WebElement selectItem3;

    @FindBy(xpath = "//*[@name='dropdown']")
    public WebElement ddm;

    @FindBy(xpath = "//*[@value='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@id='_valuefilename']")
    public WebElement fileName;

}
