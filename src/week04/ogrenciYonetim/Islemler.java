package week04.ogrenciYonetim;

import java.util.List;
import java.util.Scanner;

public class Islemler {
    Scanner scan = new Scanner(System.in);
    Ogrenci ogrenci;
    int numara = 1000;

    void menu(List<Ogrenci> ogrList) {
        System.out.println("============= İŞLEMLER =============\n" +
                "\t\t1-EKLEME\n" +
                "\t\t2-LISTELEME\n" +
                "\t\t3-ARAMA\n" +
                "\t\t4-SİLME\n" +
                "\t\tQ-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ : ");

        char secim = scan.next().toUpperCase().charAt(0);

        switch (secim) {
            case '1': {
                ekleme(ogrList);
            }
            case '2': {
                listele(ogrList);
            }
            case '3': {
                arama(ogrList);
            }
            case '4': {
                silme(ogrList);
            }
            case 'Q': {
                System.exit(0);
            }
            default:{
                System.out.println("YANLIS DEGER GIRDINIZ : ");
                menu(ogrList);
            }
        }
    }

    private void silme(List<Ogrenci> ogrList) {
        int flag = 0;
        System.out.println("SILINECEK TC NO YU GIRINIZ : ");
        String silinecekTcNo = scan.next();
        for (int i = 0; i < ogrList.size(); i++) {
            if (silinecekTcNo.equals(ogrList.get(i).getTcNo())) {
                ogrList.remove(i);
                flag = 1;
                listele(ogrList);
            }
        }
        if (flag == 0) {
            System.out.println("ARADIGINIZ TC NO YA AIT OGRENCI BULUNAMADI");
            menu(ogrList);
        }
        menu(ogrList);
    }


    private void arama(List<Ogrenci> ogrList) {
        int flag = 0;
        System.out.print("ARAMA YAPILACAK TC NO : ");
        String aranacakTcNo = scan.next();
        for (Ogrenci each : ogrList) {
            if (aranacakTcNo.equals(each.getTcNo())) {
                System.out.println("ARADIGINIZ OGRENCININ BILGILERI\n" + each);
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("ARADIGINIZ TC NO YA AIT OGRENCI BULUNAMADI");
            menu(ogrList);
        }
        menu(ogrList);
    }

    private void listele(List<Ogrenci> ogrList) {
        for (Ogrenci each : ogrList) {
            System.out.println(each);
        }
        menu(ogrList);
    }

    private void ekleme(List<Ogrenci> ogrList) {
        scan.nextLine();
        System.out.println("OGRENCININ ADINI GIIRINIZ : ");
        String ad = scan.nextLine();
        System.out.println("OGRENCININ SOYADINI GIRINIZ : ");
        String sAd = scan.nextLine();
        System.out.println("OGRENCININ TC NO SUNU GIRINIZ : ");
        String tcNo = scan.next();
        System.out.println("OGRENCININ YASINI GIRINIZ : ");
        int yas = scan.nextInt();
        System.out.println("OGRENCININ SINIGINI GIRINIZ : ");
        int sinif = scan.nextInt();
        ogrenci = new Ogrenci(ad, sAd, tcNo, yas, numara++, sinif);
        ogrList.add(ogrenci);
        listele(ogrList);
    }
}
