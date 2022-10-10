#// http://tutorialsninja.com/demo/index.php?route=common/home sayfasına gidiniz
#// Phones & PDAs'a tıklayınız
#// Telefonların markalarını alınız
#// Tüm öğeleri sepete ekleyiniz
#// Sepete tıklayınız
#// Sepetteki isimleri alınız
#// Sepetteki ve sayfadaki ürünlerin doğru olduğunu karşılaştırınız

  Feature:

    Scenario: Sepetteki urunler ile sayfadaki urunlerin kontrol edilmesi
      Given http://tutorialsninja.com/demo/index.php?route=common/home sayfasına gidildi
      Then Phones & PDAs'a tiklanildi
      Then Telefonlarin markalari alindi
      Then Tüm ogeleri sepete eklendi
      Then Sepete tiklandi
      Then Sepetteki isimleri alindi
      And Sepetteki ve sayfadaki urunlerin doğru oldugunu karsilastirildi