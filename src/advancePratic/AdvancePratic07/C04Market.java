package advancePratic.AdvancePratic07;

import java.time.LocalDate;

public class C04Market {
    String urununAdi;
    double urununFiyati;//eger Double yaparsak non-primitivelerin defaultu null oldugu icin deger verilmezse null olur
    String sonKullanmaTarifi;

    C04Market(String isim, double fiyat, int aySonra) {
        this.urununAdi = isim;
        if (fiyat > 99) {
            fiyat = fiyat * 0.9;
        }
        this.urununFiyati = fiyat;
        this.sonKullanmaTarifi = LocalDate.now().plusMonths(aySonra).toString();//int degeri stringe cevirdim

    }

    C04Market(String isim, double fiyat) {
        this.urununAdi = isim;
        if (fiyat > 99) {
            fiyat = fiyat * 0.9;
        }
        this.urununFiyati = fiyat;
        sonKullanmaTarifi = "SKT Yoktur";

    }
    C04Market(){

    }

    @Override
    public String toString() {
        return
                "urunun Adi='" + urununAdi + '\'' +
                        ", urunun Fiyati=" + urununFiyati +
                        ", son Kullanma Tarifi='" + sonKullanmaTarifi + '\'' +
                        '}';
    }
}//Class
