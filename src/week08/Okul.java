package week08;

public class Okul {
    // Okul bilgileri Okul class'inda tutulacak ve constant(degistirilemez) olmalidir
    // Okul bilgilerine prohe icerisinden her class'dan ulasilabilmelidir
    // Okul Class'i SINGLETON PATTERN'e sahip olmalidir(Obje olusturulmasini izin vermemelidir)
    static final String okulIsmi = "Yildiz Koleji";
    static final String adres = "Cankara / Ankara";
    static final String telefon = "0312 1266554";

    private Okul() {

    }
}
