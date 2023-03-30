package week04.geometrikSekiller;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hesap yapmak istediginiz geometrik sekli seciniz : \n" +
        "1. kare\n" +
        "2. dikdörtgen");
        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();
        if (secim==1){
            Kare kare = new Kare();
            kare.alan();
            kare.cevre();
        } else if (secim ==2) {
            Dikdortgen dikdortgen = new Dikdortgen();
            dikdortgen.alan();
            dikdortgen.cevre();
        }
    }
}
