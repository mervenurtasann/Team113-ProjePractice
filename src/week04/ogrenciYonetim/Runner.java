package week04.ogrenciYonetim;

import week04.ogrenciYonetim.Islemler;
import week04.ogrenciYonetim.Ogrenci;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    /*
    ÖĞRENCİ YÖNETİM PLATFORMU KODLAYINIZ.
    1. BU PROGRAMDA ÖĞRENCİ KAYITLARI İLE İLGİLİ İŞLEMLER YAPILABİLMEKTEDİR. KAYITLARDA ŞU BİLGİLER OLMALIDIR:
    -AD SOYAD
    -KİMLİK NO
    -YAŞ
    -NUMARA
    -SINIF  BİLGİLERİNİ İÇERMELİDİR.
    2. ============= İŞLEMLER =============
         1-EKLEME
         2-ARAMA
         3-LİSTELEME
         4-SİLME
         Q-ÇIKIŞ
        SEÇİMİNİZ:
     ŞEKLİNDE BİR MENÜ OLUŞTURULMALI.
    3. ARAMA VE SİLME İŞLEMLERİ KİMLİK NO YA GÖRE YAPILMALIDIR.
    NOT: PROJEYİ YAPARKEN NESNE YÖNELİMLİ PROGRAMLAMANIN BİZE SAĞLADIĞI İMKANLARI KULLANMAYA DİKKAT EDİNİZ.
     */
    public static void main(String[] args) {
        List<Ogrenci> ogrList = new ArrayList<>();
        Ogrenci ogrenci1 = new Ogrenci("Merve", "Tasan", "1111", 26, 2579, 1);
        ogrList.add(ogrenci1);
        Ogrenci ogrenci2 = new Ogrenci("Merve", "Tasan", "2222", 28, 2579, 1);
        ogrList.add(ogrenci2);
        Ogrenci ogrenci3 = new Ogrenci("Merve", "Tasan", "3333", 29, 2579, 1);
        ogrList.add(ogrenci3);
        Islemler islemler = new Islemler();
        islemler.menu(ogrList);

    }
}
