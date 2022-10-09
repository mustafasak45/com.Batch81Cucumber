@All
  Feature: amazon arama

    Scenario: TC01 amazonda nutella aratma

      Given Amazona gider
      Then Arama kutusuna nutella yazar ve arar
      Then Arama sonuclarinin dogru oldugunu kontrol eder
      And Sayfa kapatilir

