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

        plugin={"html:target/cucumber-reports.html",     // yukrıdaki kodun aynısı
                "json:target/json-reports/cucumber.json",//Belirtilen adresde package de json raporu oluşturulur. CTRL+ALT+L ile kodları hizala
            "junit:target/xml-report/cucumber.xml" },    //Belirtilen adrese xml formatın rapor verir

        features = "src/test/resources/features",
        glue = "stepDefinetions",
        //tags = "@gp1 or @gp2",              //gruplandırma yaptık @gp1 or @gp2 adında
        tags = "@US016",                //@Background yazan feature'yi calistirir
        dryRun = false                        //true yapınca browser'i calistirmadan test eder
)

public class Runner {

    /*
Runner Class'i TestNG'deki XML mantigi ile calisir
Calistirmak istedigimiz senaryolari tag belirtiriz
ve belirttigimiz taglari calistirir XML'deki gibi istedigimiz testleri calitrimak icin kullaniriz
Runner Class body'si bostur ve Runner Class'ini ekleyecegimiz notasyonlar aktive eder
Bu class'da kullanacagimiz 2 adeet notasyon vardir
1-@RunWith(Cucumber.class)  notasyonu Runner Class'ina calisma ozelligi ekler,
Bu notasyon oldugu icin Cucumber frameworkumuz de Junit kullanmayi tercih ederiz
2-@CucumberOptions notasyonu icin de

features :Runner dosyasinin feature dosyasini nereden bulacagimizi tarif eder
glue:stepDefinitions yolunu belirtiriz
tags :Hangi tagi calistirmak istiyorsak onu belli eder
dryRun: 2 secenek vardir
a-)dryRun=true --> dersek testimizi calistirmadan eksik adimlari bize verir
b-)dryRun=false-->Testlerimizi drive ile calistirir
 */

}
