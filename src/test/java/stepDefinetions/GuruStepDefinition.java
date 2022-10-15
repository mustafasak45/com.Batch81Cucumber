package stepDefinetions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {
    GuruPage guruPage=new GuruPage();
    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String baslik) {
        int index=0;

        for (int i = 0; i <guruPage.tableHeadsList.size() ; i++) {
            if (guruPage.tableHeadsList.get(i).getText().contains(baslik)){
                System.out.println(guruPage.tableHeadsList.get(i).getText());
                index=i+1;
                List<WebElement> sutunElement = Driver.getDriver().findElements(By.xpath("(//table//tbody)[2]//tr//td["+index+"]"));

                sutunElement.forEach(t-> System.out.println(t.getText()));
            }
        }

    }
}
