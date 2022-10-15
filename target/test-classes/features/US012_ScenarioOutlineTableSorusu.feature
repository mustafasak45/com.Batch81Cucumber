@US012
Feature: US012 ClassWork

  Scenario Outline: TC01_Kullanici_Sutun_Basligi_ile_Liste_Alabilmeli

    Given Kullanici "guruUrl" sayfasina gider
    And "<Baslik>" sutunundaki tum degerleri yazdirir
    Examples:
      | Baslik |
      | Company |
      | Group |
      | Prev Close (Rs) |
      | Current Price (Rs) |
      | % Change |


    Scenario: kapatmak

      Given Sayfayi kapatir