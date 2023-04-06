package week06;

public abstract class Hayvan {
    /*
        HAYVAN TAHMİN OYUNU
        Bir hayvan ismi tahmin etme oyunu yaratalım. Bu oyunda yazacağımız program random class'ından yardım alarak
        kullanıcının göremediği bir hayvan class'ı seçsin. Bu hayvanın özellikleri kullanıcıya verilerek tahmin yürütülmesi istensin.
        Class ilişkisi :
        Parent olan abstract bir Hayvan class'ı ve abstract özellikleri olsun.
        -hayvanın ismi
        -hayvanın hareket özelliği
        -bu hayvanın eti yenilebiliyor mu
        -bu hayvanın sesi
        Bu class'a bağlı kedi, köpek, inek ve kuzu child class'ları olsun.
     */

    protected StringBuilder isim;
    protected StringBuilder ses;

    abstract void hareket();

    abstract boolean isYenir();

    public StringBuilder getSes() {
        return ses;
    }

    protected abstract boolean isDogruTahmin(StringBuilder tahmin);
}

