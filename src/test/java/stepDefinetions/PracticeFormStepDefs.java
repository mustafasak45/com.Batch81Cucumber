package stepDefinetions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.PracticeFormPage;

import java.util.Random;

public class PracticeFormStepDefs {
    PracticeFormPage practiceFormPage=new PracticeFormPage();

    @Given("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void username_password_ve_textarea_kisimlarini_doldurur(String username, String password, String textarea) {

        //burada Faker verilmesinin nedeni Scenario Outline'da belirtilen giriş isteği verilerini değilde
        //buradaki Faker verilerini gönderir. Bunu yapılmasının sebebi birden fazla aynı siteye giriş yapılabilmeyi denemek için
        //yapılabilir
        username= Faker.instance().name().username();
        password= Faker.instance().internet().password();
        textarea= Faker.instance().shakespeare().asYouLikeItQuote();

        practiceFormPage.userName.sendKeys(username);
        practiceFormPage.passWord.sendKeys(password);
        practiceFormPage.textArea.clear();
        practiceFormPage.textArea.sendKeys(textarea);

    }
    @Given("bir dosya yukler")
    public void bir_dosya_yukler() {
        //1. Yöntem
      //  practiceFormPage.chooseFile.sendKeys("C:\\Users\\myComputeR\\Desktop\\test.txt");

        //2. Yöntem
        String homeDricetory = System.getProperty("user.home");//C:\\Users\\myComputeR\ dizini herkesde değiştiği için dinamik olarak bu kullanılır
        String filePath=homeDricetory+"/Desktop/test.txt";
        practiceFormPage.chooseFile.sendKeys(filePath);

    }
    @Given("checkbox1 i secer")
    public void checkbox1_i_secer() {
        if (!practiceFormPage.checkbox1.isSelected()){
            practiceFormPage.checkbox1.click();
        }
        if (practiceFormPage.checkbox2.isSelected()){
            practiceFormPage.checkbox2.click();
        }
        if (practiceFormPage.checkbox3.isSelected()){
            practiceFormPage.checkbox3.click();
        }

    }
    @Given("radio2 yi secer")
    public void radio2_yi_secer() {
        practiceFormPage.radiobutton2.click();

    }
    @Given("selection item3 secer")
    public void selection_item3_secer() {
        practiceFormPage.selectItem3.click();
    }
    @Given("dropdown itmem4 secer")
    public void dropdown_itmem4_secer() {
        Select select=new Select(practiceFormPage.ddm);
        Random random=new Random();
        int rastgele=random.nextInt(select.getOptions().size()-1);
        select.selectByIndex(rastgele);
    }
    @Given("submite tiklar")
    public void submite_tiklar() {

        practiceFormPage.submitButton.click();
    }
    @Given("dosyanin yuklendigini dogrular")
    public void dosyanin_yuklendigini_dogrular() {

        Assert.assertTrue(practiceFormPage.fileName.isDisplayed());

    }
}
