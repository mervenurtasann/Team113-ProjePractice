package week08;

import javax.management.openmbean.SimpleType;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
                case "1": // Ogretmenler Listesi Yazdir
                    ogretmenListesiYazdir();
                    break;
                case "2": // Soyisimden Ogretmen Bulma
                    soyisimdenOgretmenBulma();
                    break;
                case "3": // Branstan Ogretmen Bulma
                    branstanOgretmenBulma();
                    break;
                case "4": // Bilgilerini Girerek Ogretmen Ekleme
                    ogretmenEkleme();
                    break;
                case "5": // Kimlik No Ile Kayit Silme
                    tcNoIleOgretmenSil();
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


        } while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    public static void tcNoIleOgretmenSil() {
        System.out.println("Silinecek ogretmen kimlik no giriniz");
        String silinecekOgretmen = scan.nextLine();

        String silinecekValue = ogretmenlerMap.get(silinecekOgretmen);

        String sonucValue = ogretmenlerMap.remove(silinecekOgretmen);

        try {
            boolean sonuc = sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("Istediginiz Tc numarasi ile ogretmen bulunamadi");
        }
    }

    public static void ogretmenEkleme() {
        System.out.println("Tc no : ");
        String tcNo = scan.nextLine();
        System.out.println("Isim : ");
        String isim = scan.nextLine();
        System.out.println("Soyisim : ");
        String soyisim = scan.nextLine();
        System.out.println("Dogum Yili : ");
        String dogumYili = scan.nextLine();
        System.out.println("Brans : ");
        String brans = scan.nextLine();

        String eklenecekValue = isim + ", " + soyisim + ", " + dogumYili + ", " + brans;
        ogretmenlerMap.put(tcNo, eklenecekValue);
    }

    public static void branstanOgretmenBulma() throws InterruptedException {
        System.out.println("aradiginiz Ogretmenin bransini giriniz");
        String istenenSoyisim = scan.nextLine();

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "======BRANS ILE OGRETMEN ARAMA ========\n" +
                "TcNo        Isim   Soyisim   D.Yili  Brans");

        for (Map.Entry<String, String> each : ogretmenEntrySet
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuarr[] = eachValue.split(", ");
            if (istenenSoyisim.equalsIgnoreCase(eachValuarr[3])) {
                System.out.printf("%11s %-6s  %-8s %4s    %s \n", eachKey, eachValuarr[0], eachValuarr[1],
                        eachValuarr[2], eachValuarr[3]);
            }
        }
        Thread.sleep(5000);
    }

    public static void soyisimdenOgretmenBulma() throws InterruptedException {
        System.out.println("aradiginiz Ogretmenin soyismini giriniz");
        String istenenSoyisim = scan.nextLine();

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "======SOYISIM ILE OGRETMEN ARAMA ========\n" +
                "TcNo        Isim   Soyisim   D.Yili  Brans");

        for (Map.Entry<String, String> each : ogretmenEntrySet
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuarr[] = eachValue.split(", ");
            if (istenenSoyisim.equalsIgnoreCase(eachValuarr[1])) {
                System.out.printf("%11s %-6s  %-8s %4s    %s \n", eachKey, eachValuarr[0], eachValuarr[1],
                        eachValuarr[2], eachValuarr[3]);
            }
        }
        Thread.sleep(5000);
    }

    public static void ogretmenListesiYazdir() throws InterruptedException {

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "=========== OGRETMEN LISTESI ============\n" +
                "TcNo           Isim   Soyisim   Dogum Yili   Brans");

        for (Map.Entry<String, String> each : ogretmenEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(",");
            System.out.printf("%11s   %-6s  %-8s %4s      %s \n", eachKey, eachValueArr[0], eachValueArr[1],
                    eachValueArr[2], eachValueArr[3]);

        }
        Thread.sleep(5000);

    }
}
