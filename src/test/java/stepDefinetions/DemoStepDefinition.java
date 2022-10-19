package stepDefinetions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class DemoStepDefinition {
    DemoPage demo = new DemoPage();
    Actions actions = new Actions(Driver.getDriver());

    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    String alertText;
    @When("kullanici Alerts buttonuna tiklar")
    public void kullaniciAlertsButtonunaTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //demo.alertWE.click();
        demo.alertWEList.stream().filter(t->t.getText().contains("Alerts")).forEach(WebElement::click);
    }

    @And("kullanici On button click, alert will appear after bes seconds karsisindaki click me  butonuna basar")
    public void kullaniciOnButtonClickAlertWillAppearAfterBesSecondsKarsisindakiClickMeButonunaBasar() {
        demo.fiveSecondsButton.click();
    }

    @And("kullanici Allertin gorunur olmasini bekler")
    public void kullaniciAllertinGorunurOlmasiniBekler() {

//            wait.until(ExpectedConditions.alertIsPresent());
//            alertText= Driver.getDriver().switchTo().alert().getText();



    }

    @And("kullanici Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder")
    public void kullaniciAllertUzerindekiYazininThisAlertAppearedAfterBesSecondsOldugunuTestEder() {

        System.out.println("ALERT MESAJI "+alertText);

        String text= "This alert appeared after 5 seconds";
        Assert.assertEquals(alertText,text);

    }

    @And("kullanici ok diyerek alerti kapatir")
    public void kullaniciOkDiyerekAlertiKapatir() {
      //  Driver.getDriver().switchTo().alert().accept();
    }

    @Then("“Will enable bes seconds” butonunun enable olmasini bekleyin")
    public void willEnableSecondsButonununEnableOlmasiniBekleyin() {
        wait.until(ExpectedConditions.elementToBeClickable(demo.enableButton));
    }
    @Then("“Visible After bes seconds” butonunun gorunur olmasini bekleyin")
    public void visibleAfterBesSecondsButonununEnableOlmasiniBekleyin() {
        wait.until(ExpectedConditions.visibilityOf(demo.visibleAfter5SecondButton));
    }
    @And("“Will enable bes seconds” butonunun enable oldugunu test edin")
    public void willEnableSecondsButonununEnableOldugunuTestEdin() {
        Assert.assertTrue(demo.enableButton.isEnabled());
        Assert.assertTrue(demo.visibleAfter5SecondButton.isDisplayed());
    }

}
