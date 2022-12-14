package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {
    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@jsaction='paste:puy29d;']")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[@class='LC20lb MBeuO DKV0Md'])[1]")
    public WebElement trendyolLinki;


}
