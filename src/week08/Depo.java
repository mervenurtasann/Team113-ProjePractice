package week08;

import java.util.Scanner;

public class Depo {
    static Scanner scan = new Scanner(System.in);

    public static void anaMenu() throws InterruptedException {

        String tercih = "";
        do {
            System.out.println("\t------------ YILDIZ KOLEJI ------------\n" +
                    "\t------------  ANA MENU  ------------\n" +
                    "\n" +
                    "\t1-Okul Bilgileri Goruntule\t\t\n" +
                    "\t2-Ogretmen Menu\n" +
                    "\t3-Ogrenci Menu\t\t\n" +
                    "\tQ-CIKIS\n");
            System.out.println("Menuden tercihinizi yapiniz");
            tercih = scan.nextLine();

            switch (tercih) {
                case "1":  // Okul bilgileri
                    okulBilgileriniYazdir();
                    break;
                case "2":  // Ogretmen menu
                    Ogretmen.ogretmenMenu();
                    break;
                case "3":  // Ogrenci menu
                    break;
                case "q":  // Cikis
                case "Q":
                    break;
                default:
                    System.out.println("Gecerli bir tercih giriniz");
            }


        } while (!tercih.equalsIgnoreCase("q"));

        Depo.projeDurdur();
    }

    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("\t------------ YILDIZ KOLEJI ------------\n" +
                "\t\tAdres : " + Okul.adres +
                "\n\t\tTelefon : " + Okul.telefon);
        Thread.sleep(5000);
    }

    public static void projeDurdur() {
        System.out.println("Okul projesinden ciktiniz");
    }
}
