package stepDefinetions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class denemeStepDefs {
    WebDriver driver;
    @Given("amazona gidilir")
    public void amazonaGidilir() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.1.103:4444"),new FirefoxOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
    }

    @Then("nutella aratilir")
    public void nutellaAratilir() {
        /*AmazonPage amazonPage= new AmazonPage();
        ReusableMethods.jsScrollClick(amazonPage.aramaKutusu);
        amazonPage.aramaKutusu.sendKeys("nutella", Keys.ENTER);*/
        WebElement aramakutusuwe= driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        aramakutusuwe.sendKeys("nutella",Keys.ENTER);
        ReusableMethods.waitFor(3);

    }

    @And("sayfadan cikilir")
    public void sayfadanCikilir() {
        driver.close();
    }

    @Given("amazona chrome ile gidilir")
    public void amazonaChromeIleGidilir() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.1.103:4444"),new ChromeOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("amznUrl"));
    }

    @Given("amazona edge ile gidilir")
    public void amazonaEdgeIleGidilir() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.1.103:4444"),new EdgeOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("amznUrl"));
    }
}
