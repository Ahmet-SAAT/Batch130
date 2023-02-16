package advancePratic.advancePratic09;

import java.time.LocalTime;
import java.util.Scanner;

public class ZarSaniye {
    //İki zar atıp sonucunu atıldığı saniyeye göre 2 veya 5 ile çarpıp pc puanıyla karşılaþtıran bir method .
    //Zarın atıldığı saniye 5'in katı ise zar sayısı 5 ile çarpılıp puana eklenecek,
    // çiftse zar sayısı iki ile çarpılıp puana eklenecek,tekse zar sayısı puana eklenecek.

    public static void main(String[] args) {
        zarAt();
    }

    public static void zarAt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Zar Atmak icin Z giriniz");
        String secim = input.next();
        if (secim.equalsIgnoreCase("z")) {
        } else {
            zarAt();
        }
        int zarOyuncu = (int) (Math.random() * 6) + 1;
        int puanOyuncu = 0;
        int oyuncuSaniye = LocalTime.now().getSecond();
        if (oyuncuSaniye % 5 == 0) {
            puanOyuncu += zarOyuncu * 5;
        } else if (oyuncuSaniye % 2 == 0) {
            puanOyuncu += zarOyuncu * 2;
        } else {
            puanOyuncu += zarOyuncu;
        }
        System.out.println("zarOyuncu = " + zarOyuncu);
        System.out.println("oyuncuSaniye = " + oyuncuSaniye);
        System.out.println("puanOyuncu = " + puanOyuncu);
        int pcZar = (int) (Math.random() * 6) + 1;
        int puanpc = 0;
        int pcSaniye = oyuncuSaniye + 1;
        if (pcSaniye % 5 == 0) {
            puanpc += pcZar * 5;
        } else if (pcSaniye % 2 == 0) {
            puanpc += pcZar * 2;

        }
        else {
            puanpc += pcZar;
        }
        System.out.println("pcZar = " + pcZar);
        System.out.println("pcSaniye = " + pcSaniye);
        System.out.println("puanpc = " + puanpc);
        if (puanOyuncu>puanpc){
           System.out.println("puanOyuncu ="+puanOyuncu+" puanpc = "+puanpc+" KAZANDINIZ");
       } else if (puanpc==puanOyuncu) {
           System.out.println("puanOyuncu ="+puanOyuncu+" puanpc = "+puanpc+" BERABERE");
       }else {
           System.out.println("puanOyuncu ="+puanOyuncu+" puanpc = "+puanpc+" KAYBETTINIZ");
       }

    }

}
