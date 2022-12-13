@AllBrowserRun
Feature: deneme

  @firefoxRun
  Scenario: firefox seneryosu
    Given amazona gidilir
    Then nutella aratilir
    And sayfadan cikilir

  @chromeRun
  Scenario: chrome seneryosu
    Given amazona chrome ile gidilir
    Then nutella aratilir
    And sayfadan cikilir

  @edgeRun
  Scenario: edge seneryosu
    Given amazona edge ile gidilir
    Then nutella aratilir
    And sayfadan cikilir