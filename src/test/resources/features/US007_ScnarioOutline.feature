Feature: US007 Scenario Outline Kullanimi

  Scenario Outline: TC01 Config ile Scenario Outline Kullanimi
    Given Kullanici "<arananUrl>" sayfasina gider
    Then Kullanici 3 saniye bekler
    When Url "<arananKelime>" icerdigine bakar
    And Sayfayi kapatir
    Examples:
      | arananUrl             | arananKelime       |
      | amznUrl               | amazon             |
      | faceUrl               | face               |
      | bluerentalCarsUrl     | bluerentalcars     |
      | automationexerciseUrl | automationexercise |
      | googleUrl             | google             |