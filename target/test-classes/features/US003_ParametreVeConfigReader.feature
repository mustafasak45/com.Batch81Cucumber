Feature: Parametre Kullanimi

  @amazon
  Scenario: TC01 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "amznUrl" sayfasina gider
    Then Kullanici 3 saniye bekler
     And Sayfayi kapatir

  @facebook
  Scenario: TC02 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "faceUrl" sayfasina gider
    Then Kullanici 2 saniye bekler
    And Url "facebook" icerdigine bakar
    And Sayfayi kapatir

 @trendyol
  Scenario: TC02 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "trendyolUrl" sayfasina gider
    Then Kullanici 2 saniye bekler
    And Url "trendyol" icerdigine bakar
    And Sayfayi kapatir
