package week02;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Q1 {
    // Bir arraye random olarak oluşturulan 10 tarih ekleyin ve bu tarihleri en eskiden en yeniye doğru sıralayınız.
    //      Yıl değişkeni için 2013 ile 2023 arasında değer üretin
    //      Ay değişkeni için 1 ile 12 arasında değer üretin
    //      Gun değişkeni için 1 ile 28 arasında değer üretin
    //       LocalDate classını kullanarak bu 3 değişkeni bir metod içine gönderin ve random tarih üretiniz.

    static LocalDate tarihler[] = new  LocalDate[10];

    public static void main(String[] args) {

        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            int yil = rnd.nextInt(2013,2024);
            int ay = rnd.nextInt(1,13);
            int gun = rnd.nextInt(1,29);

            tarihOlustur(yil,ay,gun,i);

        }
        Arrays.sort(tarihler);
        for (LocalDate each: tarihler) {
            System.out.println(each);
        }
    }

    private static void tarihOlustur(int yil, int ay, int gun, int index) {
        tarihler[index] = LocalDate.of(yil,ay,gun);

    }
}
