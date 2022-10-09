package stepDefinetions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.SauceDemoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class SaucedemoDefination {
    SauceDemoPage sauceDemoPage=new SauceDemoPage();

    @Given("Sauce Sitesine girer")
    public void sauceSitesineGirer() {
        Driver.getDriver().get(ConfigReader.getProperty("sauceUrl"));

    }
    @Then("Kullanici adi ve sifre girilir")
    public void kullaniciAdiVeSifreGirilir() {
        sauceDemoPage.usernameTextBox.sendKeys(ConfigReader.getProperty("userNameSauce"),
                Keys.TAB,
                ConfigReader.getProperty("passwordSauce"),
                Keys.ENTER);
    }

    @And("Dogru giris yaptigi kontrol edilir")
    public void dogruGirisYaptigiKontrolEdilir() {
        Assert.assertTrue(sauceDemoPage.logo.isDisplayed());

    }

    @And("Yanlis giris yaptigi kontrol edilir")
    public void yanlisGirisYaptigiKontrolEdilir() {
        Assert.assertTrue(sauceDemoPage.eror.isDisplayed());
    }

    @Then("Kullanici adi ve  yanlis sifre girilir")
    public void kullaniciAdiVeYanlisSifreGirilir() {
        sauceDemoPage.usernameTextBox.sendKeys(ConfigReader.getProperty("userNameSauce"),
                Keys.TAB,
                ConfigReader.getProperty("wrongPasswordSauce"),
                Keys.ENTER);
    }
    @Then("Yanlis Kullanici adi ve  yanlis sifre girilir")
    public void yanlisKullaniciAdiVeYanlisSifreGirilir() {
        sauceDemoPage.usernameTextBox.sendKeys(ConfigReader.getProperty("wrongUserNameSauce"),
                Keys.TAB,
                ConfigReader.getProperty("wrongPasswordSauce"),
                Keys.ENTER);
    }
}
