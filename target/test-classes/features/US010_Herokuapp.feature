Feature: US1011ClassWork
  Scenario: Herocap sitesi buton tarama
    Given   Kullanici "heroUrl" sayfasina gider
    When Add Element butona basar
    And Delete butonu gorunur oluncaya kadar bekler
    Then Delete butonunun gorunur oldugunu test eder
    And Delete butonuna basarak butonu siler
    Then AddRemove Elements yazisinin gorunurlugunu test eder
    And Kullanici 3 saniye bekler
    And Delete butonunun gorunmedigini test eder
    And Kullanici 3 saniye bekler
    And Sayfayi kapatir