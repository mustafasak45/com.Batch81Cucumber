Feature: US1009 Ck Hotels Login

  Scenario Outline: TC11 kullanici gecerli bilgilerle giris yapar

    Given kullanici bluerentacar ana sayfasinda
    Then Login yazisina tiklar
    And "<gecersizuser>" username girer
    And "<gecersizpass>" password girer
    And Login butonuna basar
    And Kullanici 3 saniye bekler
    Then sayfaya giris yapilamadigini kontrol eder

    Examples:
      | gecersizuser    | gecersizpass  |
      |mustafa@gmail.com|1234567        |
      |sak@gmail.com    |435674         |
      |manisa@gmail.com |454545         |

    Scenario: Kapatma Scnario su
    And Sayfayi kapatir