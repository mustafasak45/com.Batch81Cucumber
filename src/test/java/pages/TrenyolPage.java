package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrenyolPage {
    public TrenyolPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='vQI670rJ']")
    public WebElement trendyolsearchbox;

    @FindBy(xpath = "//*[@class='dscrptn']")
    public WebElement trendyolMakasSonucu;
}
