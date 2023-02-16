package advancePratic.advancePratic10.Okul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OkulMain1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Okul1 okul = new Okul1();
        System.out.println("Okul Adini Giriniz");
        okul.setOkulAdi(input.nextLine());
        System.out.println("Max Ogrenci Sayisini Giriniz");
        okul.setMaxOgrenci(input.nextInt());

        List<Ogrenci1> ogrenciListesi = new ArrayList<>();
        for (int i = 1; i <= okul.getMaxOgrenci(); i++) {
            Ogrenci1 ogrenci = new Ogrenci1();
            System.out.println(i + ". Ogrencinin Adinini Giriniz");
            ogrenci.setAd(input.next());
            System.out.println("Ogrencinin Soyadini Giriniz ");
            ogrenci.setSoyAd(input.next());
            try {
                System.out.println("Ogrencinin Yasini Giriniz");
                ogrenci.setYas(input.nextInt());
                if (ogrenci.getYas() < 8 || ogrenci.getYas() > 15) {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException e) {
                System.out.println("Ogrenci Yasi 8 15 Arasinda olmalidir");
                continue;
            } catch (Exception e) {
                System.out.println("8-15 Arasinda Bir Sayi Giriniz");
                continue;
            }
            okul.addToList(ogrenci);

        }
        System.out.println(okul);

    }
}
