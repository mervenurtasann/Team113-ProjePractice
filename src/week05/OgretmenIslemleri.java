package week05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgretmenIslemleri implements Iislemler {
    /*
    Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.
    ============= İŞLEMLER =============
         1-EKLEME
         2-ARAMA
         3-LİSTELEME
         4-SİLME
         Q-ÇIKIŞ
    SEÇİMİNİZ:
     */
    Scanner scan = new Scanner(System.in);
    List<Ogretmen> ogretmenList = new ArrayList<>();

    void ogretmenMenu() {
        System.out.println("============= OGRETMEN ISLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         Q-CIKIS\n" +
                "    SECIMINIZ:");
        char secim = scan.next().toUpperCase().charAt(0);
        switch (secim) {
            case '1': {
                ekleme();
            }
            case '2': {
                arama();
            }
            case '3': {
                listeme();
            }
            case '4': {
                silme();
            }
            case 'Q': {
                cikis();
            }
        }

    }

    @Override
    public void ekleme() {
        scan.nextLine();
        System.out.print("OGRETMENIN ADINI GIRINIZ : ");
        String ad = scan.nextLine();
        System.out.print("OGRETMENIN SOYADINI GIRINIZ : ");
        String sAd = scan.nextLine();
        System.out.print("TC NO GIRINIZ : ");
        String tcNo = scan.next();
        System.out.print("YASINI GIRINIZ : ");
        int yas = scan.nextInt();
        scan.nextLine();
        System.out.print("BOLUMU GIRINIZ : ");
        String bolum = scan.nextLine();
        System.out.print("SICIL NO GIRINIZ : ");
        int sicilNo = scan.nextInt();
        Ogretmen ogretmen = new Ogretmen(ad, sAd, tcNo, yas, bolum, sicilNo);
        ogretmenList.add(ogretmen);
        listeme();
    }

    @Override
    public void arama() {
        System.out.println("ARANACAK KISININ TC NO SUNU GIRINIZ : ");
        String aranacakTcNo = scan.next();
        int flag = 0;
        for (Ogretmen each : ogretmenList) {
            if (aranacakTcNo.equals(each.getTcNo())) {
                System.out.println(each);
                flag = 1;
                ogretmenMenu();
            } else {
                System.out.println("ARADIGINIZ KISI YOKTUR");
                ogretmenMenu();
            }
        }
    }

    @Override
    public void listeme() {
        for (Ogretmen each : ogretmenList) {
            System.out.println(each);
        }
        ogretmenMenu();
    }

    @Override
    public void silme() {
        System.out.println("SILINECEK TC NOYU GIRINIZ : ");
        String silinecekTcNo = scan.next();
        int flag = 0;
        for (int i = 0; i < ogretmenList.size(); i++) {
            if (silinecekTcNo.equals(ogretmenList.get(i).getTcNo())) {
                ogretmenList.remove(i);
                flag = 1;
                listeme();
            }
        }
        if (flag == 0) {
            System.out.println("SILINECEK KISI BULUNAMADI");
            ogretmenMenu();
        }
    }

    @Override
    public void cikis() {
        AnaMenu anaMenu = new AnaMenu();
        anaMenu.menu();
    }
}
