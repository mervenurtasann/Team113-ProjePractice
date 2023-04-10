package week08;

import javax.management.openmbean.SimpleType;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ogretmen {
    static Map<String, String> ogretmenlerMap = new HashMap<>();
    static Scanner scan = new Scanner(System.in);

    public static void feykOgretmenEkle() {
        ogretmenlerMap.put("123456987411", "Ali, Can, 1980, Matematik");
        ogretmenlerMap.put("123456987412", "Veli, Yan, 1981, Fizik");
        ogretmenlerMap.put("123456987413", "Ayse, Can, 1982, Kimya");
        ogretmenlerMap.put("123456987414", "Ali, San, 1983, Kimya");
        ogretmenlerMap.put("123456987415", "Alp, Yan, 1984, Matematik");
    }

    public static void ogretmenMenu() throws InterruptedException {

        String tercih = "";

        do {

            System.out.println("============= YILDIZ KOLEJI =============\n" +
                    "=========== OGRETMEN MENU ============\n" +
                    "\n" +
                    "\t   1- Ogretmenler Listesi Yazdir\t\n" +
                    "\t   2- Soyisimden Ogretmen Bulma\n" +
                    "\t   3- Branstan Ogretmen Bulma\n" +
                    "\t   4- Bilgilerini Girerek Ogretmen Ekleme\n" +
                    "\t   5- Kimlik No Ile Kayit Silme \t\n" +
                    "\t   A- ANAMENU\n" +
                    "\t   Q- ÇIKIŞ\n");
            tercih = scan.nextLine();

            switch (tercih) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "A":
                case "a":
                    Depo.anaMenu();
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.out.println("Gecerli tercih yapiniz");
            }


        } while (!tercih.equalsIgnoreCase("Q"));
        Depo.projeDurdur();
    }
}
