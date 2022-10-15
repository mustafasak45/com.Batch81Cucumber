@xxx
Feature: US004 Parametre Kullanimi
   Scenario: TC01 Parametre Kullanimi
     Given Kullanici "trendyolUrl" sayfasina gider
     Then Kullanici 3 saniye bekler
     When Url "trend" icerdigine bakar
     And Sayfayi kapatir