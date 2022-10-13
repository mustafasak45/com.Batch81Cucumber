@PracticeAmazon
Feature: Amazon Practice

  @PracticeAmazonTC01
  Scenario: Amazon Sign in Test

      And Kullanici amazon sayfasina gider
      And Sign in butonuna tiklar
      And Faker kullanarak e-posta gonderir
      And Gonderdigi e-postanin ekran goruntusunu alir
      And Continiue'a tiklar
      Then There was a problem mesajini dogrular
      And Need help e tiklar
      And Forgot your password e tiklar
      And Password assistance metnini dogrular
      And Geri gider
      And Create your account butonuna tiklar
    Then Create account metnini dogrular
      And Sayfayi kapatir