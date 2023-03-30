package week04.geometrikSekiller;

import java.util.Scanner;

public class Kare implements Iislemler {
    Scanner scan = new Scanner(System.in);

    @Override
    public void alan() {
        System.out.println("Karenin kenar uzunlugunuz giriniz :");
        int kenar = scan.nextInt();
        System.out.println("Karenin alanın : " + (kenar * kenar));
    }

    @Override
    public void cevre() {
        System.out.println("Karenin kenar uzunlugunuz giriniz :");
        int kenar = scan.nextInt();
        System.out.println("Karenin cevresi : " + (kenar * 4));

    }
}
