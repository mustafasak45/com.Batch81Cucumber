@Background
Feature: Saucedemo Login

  Background: Tekrarlar
    Given Sauce Sitesine girer


  Scenario: TC01 Kullanici Dogru Username ve Password girer


    Then Kullanici adi ve sifre girilir
    And Dogru giris yaptigi kontrol edilir
    And Sayfayi kapatir


  Scenario: TC02 Kullanici Dogru Username ve yanlis Password girer


    Then Kullanici adi ve  yanlis sifre girilir
    And Yanlis giris yaptigi kontrol edilir
    And Sayfayi kapatir

  Scenario: TC03 Kullanici yanlis Username ve yanlis Password girer


    Then Yanlis Kullanici adi ve  yanlis sifre girilir
    And Yanlis giris yaptigi kontrol edilir
    And Sayfayi kapatir