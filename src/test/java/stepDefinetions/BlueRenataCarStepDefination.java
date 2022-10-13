package stepDefinetions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BlueRentACarsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRenataCarStepDefination {
    BlueRentACarsPage blueRentACarsPage=new BlueRentACarsPage();
    @Given("kullanici bluerentacar ana sayfasinda")
    public void kullaniciBluerentacarAnaSayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("bluerentalCarsUrl"));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        blueRentACarsPage.loginButton.click();

    }


    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        blueRentACarsPage.ikinciLogin.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(blueRentACarsPage.ikinciLogin.isDisplayed());
    }

    @And("{string} username girer")
    public void usernameGirer(String username) {
        blueRentACarsPage.emailTextbox.sendKeys(username);
    }

    @And("{string} password girer")
    public void passwordGirer(String pass) {
        blueRentACarsPage.passwordTextbox.sendKeys(pass);
    }

}
