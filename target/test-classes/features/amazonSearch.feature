@All
Feature: Amazon Search
  @gp1
  Scenario: TC01 kullanici amazonda nutella aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici nutella aratir
    And Sonuclarin nutella icerdigini test eder

  @gp3
  Scenario: TC01 kullanici amazonda Selenium aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici Selenium aratir
    And Sonuclarin Selenium icerdigini test eder


  @gp2
  Scenario: TC01 kullanici amazonda iphone aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici iphone aratir
    And Sonuclarin iphone icerdigini test eder
    And Sayfayi kapatir