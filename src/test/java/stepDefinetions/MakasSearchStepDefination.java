package stepDefinetions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import pages.GooglePage;
import pages.MorhipoPage;
import pages.TrenyolPage;
import utilities.ConfigReader;
import utilities.Driver;

public class MakasSearchStepDefination {

    GooglePage googlePage=new GooglePage();
    TrenyolPage trenyolPage=new TrenyolPage();
    MorhipoPage morhipoPage=new MorhipoPage();

     int trenyolMakasSonucu;
     int morhipoMakasSonucu;
     String trendyolHandle;
     String morhipoHandle;
    @Given("Google'a gidildi")
    public void googleAGidildi() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
    }

    @Then("Trendyol aratildi")
    public void trendyolAratildi() {
        googlePage.searchBox.sendKeys("Trendyol", Keys.ENTER);
    }

    @Then("Trendyol linki bulunup tiklandi")
    public void trendyolLinkiBulunupTiklandi() {
        googlePage.trendyolLinki.click();
        trendyolHandle=Driver.getDriver().getWindowHandle();
    }

    @Then("Makas aratildi")
    public void makasAratildi() {
        trenyolPage.trendyolsearchbox.sendKeys("Makas",Keys.ENTER);

    }
    @Then("Toplam urun sayisi alindi")
    public void toplamUrunSayisiAlindi() {
        String temp;
        temp=(trenyolPage.trendyolMakasSonucu.getText().replaceAll("\\D",""));
        trenyolMakasSonucu=Integer.parseInt(temp);
    }
    @Then("Yeni sekmede morhipo'ya gidildi")
    public void yeniSekmedeMorhipoYaGidildi() {
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("morhipoUrl"));
        morhipoHandle=Driver.getDriver().getWindowHandle();
    }
    @Then("Morhipo'da makas aratildi")
    public void morhipoDaMakasAratildi() {
        morhipoPage.morhipoSearchBox.sendKeys("Makas",Keys.ENTER);
    }
    @Then("Toplam urun sayisini alindi")
    public void toplamUrunSayisiniAlindi() {
        morhipoMakasSonucu=Integer.parseInt(morhipoPage.morhipoMakasSonucu.getText());
    }
    @Then("Iki sitedeki toplam makas sayisi karsilastirildi")
    public void ıkiSitedekiToplamMakasSayisiKarsilastirildi() {
    }
    @Then("Urun sayisi fazla olan site kapatildi")
    public void urunSayisiFazlaOlanSiteKapatildi() {
        if (trenyolMakasSonucu>morhipoMakasSonucu){
           Driver.getDriver().switchTo().window(trendyolHandle).close();
        }
        else Driver.getDriver().switchTo().window(morhipoHandle).close();
    }
    @And("Acik kalan diger sayfada kapatildi")
    public void acikKalanDigerSayfadaKapatildi() {
        Driver.quitDriver();
    }
}
