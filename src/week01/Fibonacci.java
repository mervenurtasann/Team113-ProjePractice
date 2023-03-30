package week01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    // Kullanicidan alınan bir tamsayiya kadar FIBONACCI dizisi olusturun 1 1 2 3 5 8

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir sayi giriniz : ");
        int sayi = scan.nextInt();
        fibonacci(sayi);

    }

    public static void fibonacci(int sayi) {
        ArrayList<Integer> fibo = new ArrayList<>();
        fibo.add(1);
        fibo.add(1);

        for (int i = 2; i < sayi; i++) {
            fibo.add(fibo.get(i - 2) + fibo.get(i - 1));
        }
        System.out.println(fibo);
    }

}
