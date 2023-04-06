package week06;

import java.util.Random;
import java.util.Scanner;

public class Runner {
    static Scanner scan = new Scanner(System.in);

    static StringBuilder tahmin;

    public static void main(String[] args) {

        Hayvan[] hayvanlar = {new Kedi(), new Kopek(), new Inek(), new Kuzu()};

        Random rnd = new Random();
        int randomSayi = rnd.nextInt(4);

        Hayvan randomHayvan = hayvanlar[randomSayi];

        int flag = 3;

        System.out.println("HAYVAN TAHMIN OYUNUNA HOSGELDINIZ!!");
        System.out.println("AKLIMDAN GECIRDIGIM HAYVAN ISMINI TAHMIN EDEBILIR MISIN");
        while (flag != 0) {

            System.out.print("Bu hayvan ");
            randomHayvan.hareket();
            tahmin = new StringBuilder(scan.next().toLowerCase());

            if (randomHayvan.isDogruTahmin(tahmin)) {
                System.out.println("Dogru Tahmin, Tebrikler!");
                break;
            } else {
                System.out.println("Yanlis Tahmin, lutfen tekrar deneyiniz");
                flag--;
            }
            System.out.println("Bu hayvanin eti yenir mi? " + randomHayvan.isYenir());
            tahmin = new StringBuilder(scan.next().toLowerCase());

            if (randomHayvan.isDogruTahmin(tahmin)) {
                System.out.println("Dogru Tahmin, Tebrikler!");
                break;
            } else {
                System.out.println("Yanlis Tahmin, lutfen tekrar deneyiniz");
                flag--;
            }
            System.out.println("Bu sesi hangi hayvan cikarir? " + randomHayvan.getSes());
            tahmin = new StringBuilder(scan.next().toLowerCase());

            if (randomHayvan.isDogruTahmin(tahmin)) {
                System.out.println("Dogru Tahmin, Tebrikler!");
                break;
            } else {
                System.out.println("Yanlis Tahmin, lutfen tekrar deneyiniz");
                flag--;
            }
        }
        if (flag == 0) {
            System.out.println("Tahmin hakkiniz doldu. Dogru hayvan ismi : " + randomHayvan.isim + " olacakti");
        }
    }
}
