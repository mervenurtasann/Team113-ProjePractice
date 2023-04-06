package week06;

public class Inek extends Hayvan {
    public Inek() {
        isim = new StringBuilder("inek");
        ses = new StringBuilder("möö");
    }

    @Override
    void hareket() {
        System.out.println("az hareket eder");

    }

    @Override
    boolean isYenir() {
        return true;
    }

    @Override
    protected boolean isDogruTahmin(StringBuilder tahmin) {
        return tahmin.compareTo(isim) == 0;
    }
}
