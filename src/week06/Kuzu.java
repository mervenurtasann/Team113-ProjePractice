package week06;

public class Kuzu extends Hayvan {
    public Kuzu() {
        isim = new StringBuilder("kuzu");
        ses = new StringBuilder("mee");
    }

    @Override
    void hareket() {
        System.out.println("toslar ve tirmanir");
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
