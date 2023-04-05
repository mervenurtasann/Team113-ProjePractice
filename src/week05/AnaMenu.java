package week05;

import java.util.Scanner;

public class AnaMenu {
    /*
        2.  Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için aşağıdaki gibi bir menü gösterilsin.
        ====================================
         ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
        ====================================
         1- ÖĞRENCİ İŞLEMLERİ
        2- ÖĞRETMEN İŞLEMLERİ
        Q- ÇIKIŞ
     */
    void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\t====================================\n" +
                "\tOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "\t====================================\n" +
                "\t1- OGRENCI ISLEMLERI\n" +
                "\t2- OGRETMEN ISLEMLERI\n" +
                "\tQ- CIKIS");
        char secim = scan.next().toUpperCase().charAt(0);
        switch (secim) {
            case '1': {
            }
            case '2': {
                OgretmenIslemleri ogretmenIslemleri = new OgretmenIslemleri();
                ogretmenIslemleri.ogretmenMenu();
            }
            case 'Q': {
                System.exit(0);
            }
            default:
                System.out.println("HATALI GIRIS YAPTINIZ");
                menu();
        }
    }
}
