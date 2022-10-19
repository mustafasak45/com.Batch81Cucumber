package stepDefinetions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MedunnaPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class MedunnaNegativeStepDefs {
    MedunnaPage medunnaPage=new MedunnaPage();
    @When("login olmak icin signin e tiklar")
    public void loginOlmakIcinSigninETiklar() {
        ReusableMethods.waitForClickablility(medunnaPage.signinSymbol,5);
        medunnaPage.signinSymbol.click();
        medunnaPage.signinButton.click();
    }

    @And("username icin {string} kullanici adini gonderir")
    public void usernameIcinKullaniciAdiniGonderir(String username) {
        username= Faker.instance().name().username();
        medunnaPage.username.sendKeys(username);
    }

    @And("password icin {string} parolasini gonderir")
    public void passwordIcinParolasiniGonderir(String password) {
        password=Faker.instance().internet().password();
        medunnaPage.password.sendKeys(password);
    }
    @And("signine tiklar")
    public void signineTiklar() {
        medunnaPage.signinWithCredentials.click();

    }

    @Then("Authentication information not correct uyarisini dogrular")
    public void authenticationInformationNotCorrectUyarisiniDogrular() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.visibilityOf(medunnaPage.popUpMessage));

        Assert.assertTrue(medunnaPage.popUpMessage.isDisplayed());
    }
}
