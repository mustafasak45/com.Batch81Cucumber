package stepDefinetions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {  //TC de fail aldığımızda raporda ekran fotosu almak için kullanılan classtır
    @After
    public void tearDown(Scenario scenario){//scenario'lar için oldugunu belirtir bu parametre

        final byte[] screenshot=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        if (scenario.isFailed()) {
        scenario.attach(screenshot, "image/png","screenshots");
    }
        Driver.closeDriver();
    }

    /*
    Cucumber'da stepdefinitions package'i icerisinde @Before, @After gibi bir notasyon varsa extends
    TestBase dememize gerek kalmadan her scenario'dan once ve/veya sonra bu method'lar calisir.
    Fakat biz bunu istemeyiz

    Cucumber'da @Beforei @After kulanma ihtiyacımız olursa bunu stepDefinitions package' altında olusturacagimiz
    Hooks class'ina koyariz

    biz her Scenario'dan sonra test sonucunu kontrol edip Failed olan scenario'lar icin ScreenShoot olması
    amacıyla @After method'u kullanacağız


     */

}
