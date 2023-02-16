package advancePratic.advancePratic09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Manav {
    /*  Basit bir 5 ürünlü manav alışveris programı yazınız.
     * 1. Adim : Ürün ve fiyat listesi oluştur.
     * 2. Adim : Ürün listesinden kod ile ürün seçtir ve kaç kilo olduğunu sor.
     * 3. Adim : Müşteri her ürün seçtiğinde, aldığı ürünün fiyatını toplam fiyata ekle.
     * 4. Adim : Alışveriş bitince ödemesi gereken tutarı göster.
     * 5. Adim : Başka bir ürün almak isteyip istemediğini sor.
     * 			 İstemiyorsa ödenecek tutarı göster, istiyorsa tekrar ürün seçtir.
     * 			 Bu islemi alışveriş bitene kadar tekrarla.
     */
    static List<String> urunListesi = new ArrayList<>();

    public static void main(String[] args) {
        urunListesi.add("Domates-UrunKodu 1-Fiyati: 20");
        urunListesi.add("Biber-UrunKodu 2-Fiyati: 25");
        urunListesi.add("Patates-UrunKodu 3-Fiyati: 9");
        urunListesi.add("Elma-UrunKodu 4-Fiyati: 15");
        urunListesi.add("Muz-UrunKodu 5-Fiyati: 30");
        System.out.println("urunListesi = " + urunListesi);


        musteriSecimi();
    }

   static int toplamOdeme = 0;
    public static void musteriSecimi() {
        Scanner input = new Scanner(System.in);
        System.out.println("Urunun Kodunu Giriniz");
        int kod = input.nextInt();
        System.out.println("Kiloyu Giriniz");
        int kilo = input.nextInt();
       toplamOdeme+=(Integer.valueOf(urunListesi.get(kod-1).split(" ")[Integer.valueOf(urunListesi.get(kod-1).split(" ").length-1)]))*kilo;
        System.out.println("toplamOdeme = " + toplamOdeme);
        System.out.println("Alisverise devam icin d kasa icin herhangi bir tusa basiniz");
        if (input.next().equalsIgnoreCase("d")){
            musteriSecimi();
        }else {
            System.out.println("toplamOdemeniz = " + toplamOdeme+"Tldir");
            toplamOdeme=0;
        }
    }
}
