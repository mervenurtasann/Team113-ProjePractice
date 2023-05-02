package hastaneProjesi;

import java.util.Scanner;

public class HastaneRunner {
    private static VeriBankasi hastane = new VeriBankasi();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Hasta durumunu girin: ");
        String hastaDurumu = scan.nextLine();
        String unvan = doktorUnvan(hastaDurumu);
        System.out.println("Hasta durumuna göre doktor unvanı: " + unvan);

        System.out.print("Bir doktor unvanı girin: ");
        String doktorUnvan = scan.nextLine();
        Doktor doktor = doktorBul(doktorUnvan);
        System.out.println("Doktor bilgileri: " + doktor);

        System.out.print("Bir hasta durumu girin: ");
        String hastaDurumuBul = scan.nextLine();
        Durum hasta = hastaDurumuBul(hastaDurumuBul);
        System.out.println("Hasta durumu: " + hasta);

        System.out.print("Bir hasta durumu girin: ");
        String hastaDurumuBul2 = scan.nextLine();
        Hasta hasta2 = hastaBul(hastaDurumuBul2);
        System.out.println("Hasta bilgileri: " + hasta2);

    }

    public static String doktorUnvan(String aktuelDurum) {
        if (aktuelDurum.equalsIgnoreCase("Allerji")) {
            return "Alergyst";
        } else if (aktuelDurum.equalsIgnoreCase("Covid-19")) {
            return "Immunology";
        } else if (aktuelDurum.equalsIgnoreCase("Brain tumors")) {
            return "Neurosurgery";
        } else if (aktuelDurum.equalsIgnoreCase("Primate infectious")) {
            return "Ortopedics";
        } else if (aktuelDurum.equalsIgnoreCase("Migren")) {
            return "Cardiothoracic";
        } else if (aktuelDurum.equalsIgnoreCase("Heart diseases")) {
            return "Cardiology";
        } else {
            return "yanlis unvan";
        }
    }

    public static Doktor doktorBul(String unvan) {
        Doktor doktor = new Doktor();
        for (int i = 0; i < VeriBankasi.unvanlar.length; i++) {
            if (VeriBankasi.unvanlar[i].equalsIgnoreCase(unvan)) {
                doktor.setIsim(VeriBankasi.doctorIsimleri[i]);
                doktor.setSoyIsim(VeriBankasi.doctorSoyIsimleri[i]);
                doktor.setUnvan(VeriBankasi.unvanlar[i]);
            }
        }
        return doktor;

    }

    public static Durum hastaDurumuBul(String aktualDurum) {
        Durum hastaDurumu = new Durum();
        switch (aktualDurum.toLowerCase()) {
            case "allerji":
                hastaDurumu.setAktualDurum("Allerji");
                hastaDurumu.setAciliyet(false);
                break;
            case "covid-19":
                hastaDurumu.setAktualDurum("Covid-19");
                hastaDurumu.setAciliyet(false);
                break;
            case "brain tumors":
                hastaDurumu.setAktualDurum("Brain tumors");
                hastaDurumu.setAciliyet(false);
                break;
            case "primate infectious":
                hastaDurumu.setAktualDurum("Primate infectious");
                hastaDurumu.setAciliyet(false);
                break;
            case "migren":
                hastaDurumu.setAktualDurum("Migren");
                hastaDurumu.setAciliyet(true);
                break;
            case "heart diseases":
                hastaDurumu.setAktualDurum("Heart diseases");
                hastaDurumu.setAciliyet(true);
                break;
            default:
                System.out.println("Gecerli bir durum degil");
                break;
        }
        return hastaDurumu;
    }

    public static Hasta hastaBul(String aktualCase) {
        Hasta hasta = new Hasta();
        for (int i = 0; i < VeriBankasi.hastaIDleri.length; i++) {
            if (VeriBankasi.durumlar[i].equalsIgnoreCase(aktualCase)) {
                hasta.setHastaID(VeriBankasi.hastaIDleri[i]);
                hasta.setIsim(VeriBankasi.hastaIsimleri[i]);
                hasta.setSoyIsim(VeriBankasi.hastaSoyisimleri[i]);
                break;
            }
        }
        return hasta;
    }
}
