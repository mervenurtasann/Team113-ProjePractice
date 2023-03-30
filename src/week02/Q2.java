package week02;

import java.util.*;

public class Q2 {
    // Girilen desimal değeri binary değere çeviren metodu oluşturunuz
    //       Örnek --->  12 = 1  1  0  0


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Desimal deger giriniz :");
        int sayi = scan.nextInt();

        System.out.println("Bolen degeri giriniz : ");
        int bolen = scan.nextInt();

        System.out.println(sayi + " desimal degerin binary karsiligi : " + binaryDonusum(sayi,bolen));
    }

    private static ArrayList<Integer> binaryDonusum(int sayi,int bolen) {
        ArrayList<Integer> binary = new ArrayList<>();

        while (sayi >= 1) {
            binary.add(sayi % bolen);
            sayi /= bolen;

        }
        ArrayList<Integer> tersLst = new ArrayList<>();
        // Collections.reverse(binary);
        for (int i = binary.size()-1 ; i >= 0; i--) {
            tersLst.add(binary.get(i));
        }

        return tersLst;
    }
}
