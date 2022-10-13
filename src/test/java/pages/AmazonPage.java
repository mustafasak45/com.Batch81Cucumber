package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucWE;

    @FindBy(xpath = "//*[@id='nav-link-accountList']")
    public WebElement signinDdm;

    @FindBy(xpath = "(//*[@class='nav-action-inner'])[1]")
    public WebElement signinButton;

    @FindBy(xpath = "//*[@id='ap_email']")
    public WebElement epostaBox;

    @FindBy(xpath = "(//*[@id='continue'])[1]")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@class='a-expander-prompt']")
    public WebElement needHelp;

    @FindBy(xpath = "//*[@id='auth-fpp-link-bottom']")
    public WebElement forgotYourPass;


    @FindBy(xpath = "//*[@id='createAccountSubmit']")
    public WebElement createYourAmznAccount;
}
