package week05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciIslemleri implements Iislemler {
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

    List<Ogrenci> ogrenciList = new ArrayList<>();
    int numara = 1000;

    void ogrenciMenu() {
        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LISTELEME\n" +
                "         4-SILME\n" +
                "         Q-CIKIS\n" +
                "    SEÇİMİNİZ:");

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
        System.out.println("OGRENCININ ADINI GIRINIZ : ");
        scan.nextLine();
        String ad = scan.nextLine();
        System.out.println("OGRENCININ SOYADINI GIRINIZ : ");
        String sAd = scan.nextLine();
        System.out.println("OGRENCININ TC NOSUNU GIRINIZ : ");
        String tcNo = scan.next();
        System.out.println("OGRENCININ YASINI GIRINIZ : ");
        int yas = scan.nextInt();
        scan.nextLine();
        System.out.println("OGRENCININ SINIFINI GIRINIZ : ");
        int sinif = scan.nextInt();
        Ogrenci ogrenci = new Ogrenci(ad, sAd, tcNo, yas, numara++, sinif);
        ogrenciList.add(ogrenci);
        listeme();
        ogrenciMenu();
    }

    @Override
    public void arama() {
        System.out.println("ARANACAK KISININ TC NOSUNU GIRINIZ : ");
        String tcNo = scan.next();
        int flag = 0;
        for (Ogrenci each : ogrenciList) {
            if (each.getTcNo().equals(tcNo)) {
                System.out.println("ARANAN KISI : " + each);
                flag = 1;
                ogrenciMenu();
            }
        }
        if (flag == 0) {
            System.out.println(tcNo + " TC NOLU KISI YOKTUR");
            ogrenciMenu();
        }
    }

    @Override
    public void listeme() {
        for (Ogrenci each : ogrenciList) {
            System.out.println(each);
        }
        ogrenciMenu();
    }

    @Override
    public void silme() {
        System.out.println("SILINECEK KISININ TC NOSUNU GIRINIZ : ");
        String tcNo = scan.next();
        boolean flag = true;

        for (int i = 0; i < ogrenciList.size(); i++) {
            if (ogrenciList.get(i).getTcNo().equals(tcNo)) {
                System.out.println("SILINECEK KISI : " + ogrenciList.get(i));
                ogrenciList.remove(i);
                flag = false;
                listeme();
            }
        }
        if (flag) {
            System.out.println(tcNo + " TC NOLU KISI YOKTUR");
            ogrenciMenu();
        }
    }

    @Override
    public void cikis() {
        AnaMenu anamenu = new AnaMenu();
        anamenu.menu();
    }
}
