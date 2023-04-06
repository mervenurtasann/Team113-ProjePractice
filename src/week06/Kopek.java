package week06;

public class Kopek extends Hayvan {
    public Kopek() {
        isim = new StringBuilder("kopek");
        ses = new StringBuilder("hav hav");
    }

    @Override
    void hareket() {
        System.out.println("hizli hareket eder");
    }

    @Override
    boolean isYenir() {
        return false;
    }

    @Override
    protected boolean isDogruTahmin(StringBuilder tahmin) {
        return tahmin.compareTo(isim) == 0;
    }
}
