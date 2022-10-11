package stepDefinetions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        blueRentACarsPage.emailTextbox.sendKeys(ConfigReader.getProperty("wrongEmailBlueRentalCars"));
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        blueRentACarsPage.passwordTextbox.sendKeys(ConfigReader.getProperty("wrongPasswordBlueRentalCars"));
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        blueRentACarsPage.ikinciLogin.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertFalse(blueRentACarsPage.ddm.isDisplayed());
    }
}
