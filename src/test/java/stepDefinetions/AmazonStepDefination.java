package stepDefinetions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class AmazonStepDefination {
    AmazonPage amazonPage=new AmazonPage();

    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
    }

    @Then("Kullanici nutella aratir")
    public void kullaniciNutellaAratir() {
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);

    }

    @And("Sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        Assert.assertTrue( amazonPage.aramaSonucWE.getText().contains("Nutella"));
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("Sonuclarin Selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        Assert.assertTrue( amazonPage.aramaSonucWE.getText().contains("Selenium"));

    }

    @Then("Kullanici Selenium aratir")
    public void kullaniciSeleniumAratir() {
        amazonPage.aramaKutusu.sendKeys("Selenium", Keys.ENTER);

    }

    @Then("Kullanici iphone aratir")
    public void kullaniciIphoneAratir() {
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);

    }

    @And("Sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        Assert.assertTrue( amazonPage.aramaSonucWE.getText().contains("iphone"));
    }
    @Then("Kullanici {string} aratir")
    public void kullaniciAratir(String arananKelime) { //burada parametre girdik feature dosyasında "" içinde
                                                        // yazdıgımızı burada parametre alacaktır
        amazonPage.aramaKutusu.sendKeys(arananKelime,Keys.ENTER);
    }
    @And("Sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {//burada parametre girdik feature dosyasında "" içinde
        // yazdıgımızı burada parametre alacaktır
        String actualKelime=amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualKelime.contains(arananKelime));
    }

    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arananUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(arananUrl));
    }

    @Then("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.waitFor(saniye);
    }

    @And("Url {string} icerdigine bakar")
    public void urlIcerdigineBakar(String expectedUrl) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }

    @And("Sign in butonuna tiklar")
    public void signInButonunaTiklar() {
    amazonPage.signinDdm.click();

    }

    @And("Faker kullanarak e-posta gonderir")
    public void fakerKullanarakEPostaGonderir() {
        Faker faker=new Faker();
        amazonPage.epostaBox.sendKeys(faker.internet().emailAddress(),Keys.ENTER);


    }

    @And("Gonderdigi e-postanin ekran goruntusunu alir")
    public void gonderdigiEPostaninEkranGoruntusunuAlir() throws IOException {
        ReusableMethods.getScreenshotWebElement("eposta",amazonPage.epostaBox);
    }

    @And("Continiue'a tiklar")
    public void continiueATiklar() {
        amazonPage.continueButton.click();
    }

    @Then("There was a problem mesajini dogrular")
    public void thereWasAProblemMesajiniDogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("There was a problem"));

    }
    @And("Need help e tiklar")
    public void needHelpETiklar() {
        amazonPage.needHelp.click();
    }

    @And("Forgot your password e tiklar")
    public void forgotYourPasswordETiklar() {
        amazonPage.forgotYourPass.click();

    }
    @And("Password assistance metnini dogrular")
    public void passwordAssistanceMetniniDogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Password assistance"));
    }
    @And("Geri gider")
    public void geriGider() {
        Driver.getDriver().navigate().back();
    }
    @And("Create your account butonuna tiklar")
    public void createYourAccountButonunaTiklar() {
        amazonPage.createYourAmznAccount.click();
    }

    @Then("Create account metnini dogrular")
    public void createAccountMetniniDogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Create account"));

    }
}
