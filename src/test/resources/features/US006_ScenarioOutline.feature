Feature: US006 Kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC01 kullanici istedigi kelimeleri aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici "<istenenKelime>" aratir
    And Sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella | nutella |
      | selenium | selenium |
      | çökelek | çökelek |
