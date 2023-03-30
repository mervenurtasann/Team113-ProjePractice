package week04.geometrikSekiller;

import java.util.Scanner;

public class Dikdortgen implements Iislemler {
    Scanner scan = new Scanner(System.in);

    @Override
    public void alan() {
        System.out.println("Kisa kenari giriniz : ");
        int kenar1 = scan.nextInt();
        System.out.println("Uzun kenari giriniz : ");
        int kenar2 = scan.nextInt();
        System.out.println("Dikdortgenin alani : " + (kenar2 * kenar1));
    }

    @Override
    public void cevre() {
        System.out.println("Kisa kenari giriniz : ");
        int kenar1 = scan.nextInt();
        System.out.println("Uzun kenari giriniz : ");
        int kenar2 = scan.nextInt();
        System.out.println("Dikdortgenin cevresi : " + (2 * (kenar2 + kenar1)));

    }
}
