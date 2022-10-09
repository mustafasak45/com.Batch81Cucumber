package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinetions",
        //tags = "@gp1 or @gp2",              //gruplandırma yaptık @gp1 or @gp2 adında
        tags = "@Background",                //@Background yazan feature'yi calistirir
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
