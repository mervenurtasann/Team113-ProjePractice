package week03;

import java.util.Scanner;

public class ATM {
    /*
        ATM
        Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

        Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.

        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekraninageri donsun.

        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
     */

    static String kartNo = "123456";
    static String sifre = "1234";
    static Scanner scan = new Scanner(System.in);
    static double bakiye = 50000;

    public static void main(String[] args) {
        giris();
    }

    private static void giris() {
        /*
            Kullanicidan giriş için kart numarasi ve şifresini isteyin,
            eger herhangi birini yanlis girerse tekrar isteyin.
            Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
            Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
         */
        System.out.println("Kart numarisini giriniz : ");
        String kKartNo = scan.nextLine().replace(" ", "");

        System.out.println("Sifrenizi giriniz : ");
        String kSifre = scan.next();

        if (kSifre.equals(sifre) && kKartNo.equals(kartNo)) {
            menu();

        } else {
            System.out.println("Kullanici adi veya sifre yanlis girildi.");
            scan.nextLine(); // dummy ------> ard arda scanner objesi kullanildiginda alinan hatayi engellemek amacli kullandik
            giris();
        }
    }

    private static void menu() {
        // Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.
        System.out.println("Yapmak istediginiz islemi seciniz :\n" +
                "1. Bakiye sorgulama\n" +
                "2. Para Yatirma\n" +
                "3. Para Cekme\n" +
                "4. Para Gonderme\n" +
                "5. Sifre Degistirme\n" +
                "6. Cikis\n" +
                "Seciminiz : ");
        int secim = scan.nextInt();

        switch (secim) {
            case (1): {
                // BAKIYE SORGULAMA
                bakiyeSorgula();
            }
            case (2): {
                // PARA YATIRMA
                System.out.println("Yatırmak istediginiz miktari giriniz : ");
                double miktar = scan.nextDouble();
                paraYatirma(miktar);
            }
            case (3): {
                // PARA CEKME
                // Para çekme işleminde mevcut bakiyeden buyuk para çekilemez,
                System.out.println("Cekmek istediginiz miktari giriniz : ");
                double miktar = scan.nextDouble();
                paraCekme(miktar);
            }
            case (4):{
                // PARA GONDERME
                /*
                para gonderme işleminde mevcut bakiyeden buyuk para çekilemez
                Para gönderme işleminde istenen iban TR ile baslamali ve
                toplam 26 karakterli olmali, eger değilse menü ekraninageri donsun.
                 */
                paraGonderme();

            }
            case (5):{
                // SIFRE DEGISTIRME
                /*
                    Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra,
                    sifre değişiklik işlemini yapmali,
                 */
                sifreDegistir();
            }
            case (6):{
                System.out.println("GULE GULE");
                System.exit(0);
            }
            default:{
                System.out.println("HATALI GIRIS YAPTINIZ");
                menu();
            }
        }
    }

    private static void sifreDegistir() {
        System.out.println("Eski sifrenizi giriniz : ");
        String eSifre = scan.next();
        if (eSifre.equals(sifre)){
            System.out.println("Yeni sifre giriniz : ");
            sifre = scan.next();
            scan.nextLine(); // dummy
            giris();
        }else {
            System.out.println("Hatali giris yaptiniz");
            sifreDegistir();
        }
    }

    private static void paraGonderme() {
        scan.nextLine(); // dummy
        System.out.println("Para gondermek istediginiz iban numarasini giriniz : ");
        String iban = scan.nextLine().toUpperCase().replace(" ", "");
        if (iban.length() == 26 && iban.startsWith("TR")){
            System.out.println("Gondermek istediginiz miktari giriniz : ");
            double miktar = scan.nextDouble();
            if (miktar <= bakiye){
                System.out.println(miktar + " TL " + iban + " no'lu hesaba gonderildi");
                bakiye -= miktar;
                bakiyeSorgula();
            } else {
                System.out.println("Gondermek istediginiz tutara sahip degilsiniz");
                paraGonderme();
            }
        }
    }

    private static void paraCekme(double miktar) {
        //  Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        if (miktar <= bakiye) {
            bakiye -= miktar;
            bakiyeSorgula();
        } else {
            System.out.println("Cekmek istediginiz tutara sahip degilsiniz.");
            bakiyeSorgula();
        }
    }

    private static void paraYatirma(double miktar) {
        bakiye += miktar;
        bakiyeSorgula();
    }

    private static void bakiyeSorgula() {
        System.out.println("Bakiyeniz : " + bakiye);
        menu();
    }
}
