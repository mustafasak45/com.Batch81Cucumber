package stepDefinetions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TutorialsNinjaPages;
import utilities.ConfigReader;
import utilities.Driver;

public class TutorialsNinjaStepDefination {
    TutorialsNinjaPages tutorialsNinjaPages=new TutorialsNinjaPages();
    @Given("http:\\/\\/tutorialsninja.com\\/demo\\/index.php?route=common\\/home sayfasına gidildi")
    public void httpTutorialsninjaComDemoIndexPhpRouteCommonHomeSayfasınaGidildi() {
        Driver.getDriver().get(ConfigReader.getProperty("tutorialsninjaUrl"));
    }

    @Then("Phones & PDAs'a tiklanildi")
    public void phonesPDAsATiklanildi() {
        tutorialsNinjaPages.phonesPDAsButton.click();
    }

    @Then("Telefonlarin markalari alindi")
    public void telefonlarinMarkalariAlindi() {
    }

    @Then("Tüm ogeleri sepete eklendi")
    public void tümOgeleriSepeteEklendi() {
    }

    @Then("Sepete tiklandi")
    public void sepeteTiklandi() {
    }

    @Then("Sepetteki isimleri alindi")
    public void sepettekiIsimleriAlindi() {
    }

    @And("Sepetteki ve sayfadaki urunlerin doğru oldugunu karsilastirildi")
    public void sepettekiVeSayfadakiUrunlerinDoğruOldugunuKarsilastirildi() {
    }
}
