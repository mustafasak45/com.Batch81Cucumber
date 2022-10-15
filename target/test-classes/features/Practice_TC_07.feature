@Practice_TC_07
Feature: TC Verify Test Case
  @practice
  Scenario: TC_07_Test_Cases
    Given Tarayiciyi baslatarak "http://automationexercise.com/" url'sine gidin
    Then  Ana sayfanin basariyla gorunur oldugunu dogrulayin
    And   Test Case buttonuna tiklayin
    Then  Kullanicinin test case sayfasina basariyla yonlendirildigini dogrulayin
    And   ilgili sayfanin ekran goruntusunu alin

#Given başta olur
#Given :verildiğinde demek,
#And bizim step definitions içindeki methodları oluşturur
# And :tekrarlayan adımlarda kullanılır
#Ingilizce dilbilgisi mantığı ile hareket eder her türlü çalışır
#Then gegelde assort yapıldığı yere konulur yani doğrulamadır

#And ve demek olduğu için gramere göre kullanılır


#When : --zaman ,given dan sonra yazılır.
#Then : genelde aseertion yapıldıgında kullanılır.

