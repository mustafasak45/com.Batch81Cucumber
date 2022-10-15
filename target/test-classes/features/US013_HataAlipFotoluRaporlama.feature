@US013
Feature: US004 Parametre Kullanimi
   Scenario: TC01 Parametre Kullanimi

     Given Kullanici "morhipoUrl" sayfasina gider
     Then Kullanici 3 saniye bekler
     When Url "asdf" icerdigine bakar
     And Sayfayi kapatir
