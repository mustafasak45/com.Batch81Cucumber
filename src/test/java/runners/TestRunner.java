package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin={"html:target/cucumber-reports.html"}, //rapor yazdırma istenildiginde kullanılır. target packagesinin altında olur
        //cucumber-reports.html adında oluşur ve bu rapor sadece runnerdan alınır
        //Soldaki oluşan target/cucumber-reports.html dosya yoluyla rapor görüntülenir
        //stepDefinition altında Hooks classı sayesinde Runner de çalışrırılan fail testin
        //fotosu raporda verilir

        plugin={"html:target/cucumber-reports1.html",     // yukrıdaki kodun aynısı
                "json:target/json-reports/cucumber1.json",//Belirtilen adresde package de json raporu oluşturulur. CTRL+ALT+L ile kodları hizala
                "junit:target/xml-report/cucumber1.xml" },    //Belirtilen adrese xml formatın rapor verir

        features = "src/test/resources/features",
        glue = "stepDefinetions",
        //tags = "@gp1 or @gp2",              //gruplandırma yaptık @gp1 or @gp2 adında
        tags = "@US004",                //@Background yazan feature'yi calistirir
        dryRun = false                        //true yapınca browser'i calistirmadan test eder
)
public class TestRunner {

}
