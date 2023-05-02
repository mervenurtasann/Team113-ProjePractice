package hastaneProjesi;

public class Durum extends Hasta{

    private String aktualDurum;
    private boolean aciliyet;

    public Durum() {
    }

    public String getAktualDurum() {
        return aktualDurum;
    }

    public void setAktualDurum(String aktualDurum) {
        this.aktualDurum = aktualDurum;
    }

    public boolean isAciliyet() {
        return aciliyet;
    }

    public void setAciliyet(boolean aciliyet) {
        this.aciliyet = aciliyet;
    }

    @Override
    public String toString() {
        return "Aktual Durum = " + aktualDurum +
                ", Aciliyet = " + aciliyet;
    }
}
