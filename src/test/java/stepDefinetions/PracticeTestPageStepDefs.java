package stepDefinetions;

import io.cucumber.java.en.*;  //import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HerokuappPage;
import utilities.Driver;

import java.util.List;
//import io.cucumber.java.en.Then;

public class PracticeTestPageStepDefs {

    HerokuappPage herokuappPage=new HerokuappPage();
    int down32Toplam;
    int clickTextToplam;
    int sonuc;
    @Given("{string} adresine gidin")
    public void adresine_gidin(String url) {

        Driver.getDriver().get(url);
    }
    @Given("{int} defa click me ye tiklayin")
    public void defa_click_me_ye_tiklayin(Integer sayi) {
        for (int i = 1; i <=sayi ; i++) {
            herokuappPage.clickButton.click();
        }
    }
    @Given("{int} defa Space dugmesine basin")
    public void defa_space_dugmesine_basin(Integer spaceTusu) {
        Actions actions=new Actions(Driver.getDriver());
        for (int i = 1; i <=spaceTusu ; i++) {

            actions.sendKeys(Keys.SPACE).perform();
        }
    }
    @Given("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void down_yazisindaki_iki_basamakli_sayilarin_hepsini_toplayin() {
    //   int toplam= herokuappPage.down32.stream().map(t->(Integer.parseInt(t.getText().replaceAll("\\D","")))).reduce(0,(t,u)->t+u);
    //    System.out.println("Lambdayla : "+toplam);

        List<WebElement> down32 = herokuappPage.down32;
        for (WebElement w: down32) {
          down32Toplam+=Integer.valueOf(w.getText().replaceAll("[^0-9]",""));
        }
        System.out.println(down32Toplam);
    }
    @Given("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tum_click_metinlerinin_uzunlugunun_toplamini_onceki_toplamdan_cikarin() {
      //  clickTextToplam=herokuappPage.clickText.stream().map(t->t.getText().length()).reduce(0, Integer::sum);
        //Lambdayla

        List<WebElement> clickText=herokuappPage.clickText;

        for (WebElement w:clickText) {
            clickTextToplam+=w.getText().length();
        }
        sonuc=down32Toplam-clickTextToplam;
        System.out.println("sonuc = " + sonuc);
    }
    @Then("sonucun {int} oldugunu dogrulayin")
    public void sonucun_oldugunu_dogrulayin(int result) {

        Assert.assertEquals("Sonuc esit degil",result,sonuc);
    }
}
