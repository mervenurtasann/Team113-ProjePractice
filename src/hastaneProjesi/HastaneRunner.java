package hastaneProjesi;


public class HastaneRunner {

    public static void main(String[] args) {

        String hastaDurumu = String.valueOf(hastaDurumuBul("allerji"));
        System.out.println(hastaDurumu);
        String unvan = doktorUnvan("allerji");
        System.out.println(unvan);
        System.out.println(doktorBul("Immunology"));
        System.out.println(hastaBul("allerji"));

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
