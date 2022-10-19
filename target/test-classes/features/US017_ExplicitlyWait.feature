Feature: US017 Class work

  Scenario: explicitly wait
    Given Kullanici "demoaqUrl" sayfasina gider
    Then “Will enable bes seconds” butonunun enable olmasini bekleyin
    Then “Visible After bes seconds” butonunun gorunur olmasini bekleyin
    And “Will enable bes seconds” butonunun enable oldugunu test edin
