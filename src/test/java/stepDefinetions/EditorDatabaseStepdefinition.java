package stepDefinetions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditorDatabasePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class EditorDatabaseStepdefinition {
    int i=1;
    EditorDatabasePage editorDatabasePage=new EditorDatabasePage();

    @Given("kullanici editor.datatables.net adresine gider")
    public void kullaniciEditorDatatablesNetAdresineGider() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }
    @Then("new butonuna basar")
    public void newButonunaBasar() {
        editorDatabasePage.newButton.click();
    }
    @And("{string} girer")
    public void girer(String enter) {
        editorDatabasePage.textBoxList.get(i).sendKeys(enter, Keys.TAB);
        ReusableMethods.waitFor(1);
        i++;
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        editorDatabasePage.createButton.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String enter) {
        editorDatabasePage.searchBox.sendKeys(enter);

    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String isim) {
        Assert.assertTrue(editorDatabasePage.tablodaIsim.getText().contains(isim));
    }
}
