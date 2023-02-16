package advancePratic.advancePratic10.Okul;

public class Ogrenci1 {
    private String ad;
    private String soyAd;
    private int yas;

    public Ogrenci1() {
    }

    public Ogrenci1(String ad, String soyAd, int yas) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.yas = yas;
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return
                "{"+"ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas+"}";
    }
}
