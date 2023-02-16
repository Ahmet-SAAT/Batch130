package advancePratic.advancePratic08;

public class Kutuphane {


    //Kütüphaneye  kitapları, adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.

    String kitapAdi;
    String yazarAdi;
    String sayfaSayisi;
    String seriNumarasi;
   static int kitapsayi;

   public Kutuphane(String kitapAdi, String yazarAdi, String sayfaSayisi) {
        kitapsayi++;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        seriNumarasi=kitapAdi.substring(0,2)+yazarAdi.substring(0,2)+kitapsayi;
        kitapBilgileri();
    }
public void kitapBilgileri(){
    System.out.println("Kitap Adi = "+kitapAdi+"\nYazar Adi = "+yazarAdi+"\nSayfa Sayisi = "+sayfaSayisi+"\nSeri Numarasi = "+seriNumarasi);
}
}
