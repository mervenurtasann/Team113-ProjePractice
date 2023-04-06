package week07;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim = 0;

        while (secim != 5) {
            secim = mainMenu(input);

            switch (secim) {
                case 1:
                    toplamaIslemi(input);
                    break;
                case 2:
                    cikarmaIslemi(input);
                    break;
                case 3:
                    carpmaIslemi(input);
                    break;
                case 4:
                    bolmeIslemi(input);
                    break;
                case 5:
                    System.out.println("Programdan cikis yapildi");
                    break;
                default:
                    System.out.println("Gecersiz secim. Lutfen tekrar deneyin.");
                    break;
            }
        }
    }

    public static int mainMenu(Scanner input) {
        System.out.println("*** Hesap Makinesi ***");
        System.out.println("1. Toplama");
        System.out.println("2. Cikarma");
        System.out.println("3. Carpma");
        System.out.println("4. Bolme");
        System.out.println("5. Cikis");
        System.out.print("Seciminiz (1-5): ");
        int secim = input.nextInt();
        return secim;
    }

    public static void toplamaIslemi(Scanner input) {
        System.out.print("Toplama işlemi için kaç sayı kullanacaksınız: ");
        int count = input.nextInt();
        if (count < 2) {
            System.out.println("En az iki sayı girmelisiniz.");
            return;
        }
        double sonuc = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". sayıyı girin: ");
            double sayi = input.nextDouble();
            sonuc += sayi;
        }
        System.out.println("Sonuç: " + sonuc);
    }

    public static void cikarmaIslemi(Scanner input) {
        System.out.print("Çıkarma işlemi için ilk sayıyı girin: ");
        double sonuc = input.nextDouble();
        System.out.print("Kaç sayı çıkartmak istiyorsunuz?: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Çıkarma işlemi için " + i + ". sayıyı girin: ");
            double sayi = input.nextDouble();
            sonuc -= sayi;
        }
        System.out.println("Sonuç: " + sonuc);
    }

    public static void carpmaIslemi(Scanner input) {
        System.out.print("Çarpma işlemi için kaç sayı kullanacaksınız: ");
        int count = input.nextInt();
        if (count < 2) {
            System.out.println("En az iki sayı girmelisiniz.");
            return;
        }
        double sonuc = 1;
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". sayıyı girin: ");
            double sayi = input.nextDouble();
            sonuc *= sayi;
        }
        System.out.println("Sonuç: " + sonuc);
    }

    public static void bolmeIslemi(Scanner input) {
        System.out.print("Bolmek istediginiz ilk sayiyi girin: ");
        double sayi1 = input.nextDouble();
        System.out.print("Bolen ikinci sayiyi girin: ");
        double sayi2 = input.nextDouble();
        if (sayi2 == 0) {
            System.out.println("Sifira bolme hatasi");
        } else {
            double sonuc = sayi1 / sayi2;
            System.out.println(sayi1 + " / " + sayi2 + " = " + sonuc);
        }

    }
}
