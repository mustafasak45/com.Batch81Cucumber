Feature: TC Verify Test Cases


  @PracticeTC07_0

  Scenario: TC_07_Test_Cases
      #Given :verildiğinde demek,
  #When : --zaman ,given dan sonra yazılır.
  #Then : genelde aseertion yapıldıgında kullanılır.
  #And :tekrarlayan adımlarda kullanılır

    Given Tarayiciyi baslatarak "http://automationexercise.com" url'sine gidin
    Then Ana sayfanin basariyla gorunur oldugunu dogrulayin
    And Test Case buttonu na tiklayin
    Then Kullanicinin test case sayfasina basariyla yonlendirildigini dogrulayin
    And ilgili sayfanin ekran goruntusunu alin