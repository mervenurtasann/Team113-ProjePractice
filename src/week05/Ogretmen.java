package week05;

public class Ogretmen extends Kisi {
    // Öğrenci:  Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
    private String bolum;
    private int sicilNo;

    public Ogretmen(String bolum, String sAd, String tcNo, int sicilNo, String s, int no) {
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen() {
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen : " + super.toString() +
                "bolum : " + bolum +
                ", sicilNo : " + sicilNo;
    }
}
