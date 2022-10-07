@Background
Feature: US001 Background Kullanimi

  Background: Ortak adimlar
    Given Kullanici amazon sayfasina gider

  Scenario: TC01 kullanici amazonda nutella aratir

    Then Kullanici nutella aratir
    And Sonuclarin nutella icerdigini test eder


  Scenario: TC01 kullanici amazonda Selenium aratir

    Then Kullanici Selenium aratir
    And Sonuclarin Selenium icerdigini test eder


  Scenario: TC01 kullanici amazonda iphone aratir

    Then Kullanici iphone aratir
    And Sonuclarin iphone icerdigini test eder
    And Sayfayi kapatir