Feature: Class Calismasi

  Scenario Outline: Bes farkli kullanici girisi

  Given kullanici editor.datatables.net adresine gider
  Then new butonuna basar
  And "<firsname>" girer
  And "<lastname>" girer
  And "<position>" girer
  And "<office>" girer
  And "<extension>" girer
  And "<startDate>" girer
  And "<salary>" girer
  And Create tusuna basar
  When kullanici "<firsname>" ile arama yapar
  And Kullanici 1 saniye bekler
  Then isim bolumunde "<firsname>" oldugunu dogrular
  And Kullanici 2 saniye bekler


    Examples:
      | firsname  | lastname | position | office      | extension | startDate  | salary |
      | Ali       | Veli     | Qa       | Google      | Senior    | 2022-10-12 | 15000  |
      | Ahmet     | Mehmet   | Qa       | Google      | Junior    | 2022-10-12 | 10500  |
      | Hasan     | Duman    | Dev      | Amazon      | Junior    | 2022-10-12 | 25000  |





