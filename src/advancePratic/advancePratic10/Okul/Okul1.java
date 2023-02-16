package advancePratic.advancePratic10.Okul;

import java.util.ArrayList;
import java.util.List;

public class Okul1 {
    private String okulAdi;
    private int maxOgrenci;
    private List <Ogrenci1> ogrenciListesi=new ArrayList<>();


    public Okul1() {
    }

    public Okul1(String okulAdi, int maxOgrenci, List<Ogrenci1> ogrenciListesi) {
        this.okulAdi = okulAdi;
        this.maxOgrenci = maxOgrenci;
        this.ogrenciListesi = ogrenciListesi;
    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public int getMaxOgrenci() {
        return maxOgrenci;
    }

    public void setMaxOgrenci(int maxOgrenci) {
        this.maxOgrenci = maxOgrenci;
    }

    public List<Ogrenci1> getOgrenciListesi() {
        return ogrenciListesi;
    }

    public void setOgrenciListesi(List<Ogrenci1> ogrenciListesi) {
        this.ogrenciListesi = ogrenciListesi;
    }

    public void addToList(Ogrenci1 ogrenci){
       this.ogrenciListesi.add(ogrenci);
    }



    @Override
    public String toString() {
        return
                "okulAdi='" + okulAdi + '\'' +
                ", maxOgrenci=" + maxOgrenci +
                ", ogrenciListesi=" + ogrenciListesi;
    }
}
