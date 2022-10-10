@parametre
Feature: US002 Parametre Kullanimi

  Background: Her seneryoda tekrar edenler
    Given Kullanici amazon sayfasina gider


  Scenario: TC01 Kullanici amazonda parametre arama yapar

    Then Kullanici "nutella" aratir
    And Sonuclarin "nutella" icerdigini test eder
    And Sayfayi kapatir

  Scenario: TC02 Kullanici amazonda parametre arama yapar

    Given Kullanici amazon sayfasina gider
    Then Kullanici "SQL" aratir
    And Sonuclarin "SQL" icerdigini test eder
    And Sayfayi kapatir