package advancePratic.advancePratic08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bakkal {
    /*
    Bakkal günlük gelir programı yazınız.
     -Tüm günlerin gelirlerini gösteren bir method,
     -Haftalık gelir ortalamasını gösteren bir method,
     -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelire eşit olduğunu gösteren bir method oluşturunuz.
     */
    static List<String> gunler = Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar");
    static List<Integer> gunlukkazanc = new ArrayList<>();
    static int toplamkazanc = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gun = 0;
        while (gun < 7) {
            System.out.println(gunler.get(gun) + "Gununun Kazancni Giriniz");
            gunlukkazanc.add(input.nextInt());
            toplamkazanc += gunlukkazanc.get(gun);
            gun++;

        }
        System.out.println("Gunluk Kazanclar: " + gunlukkazanc);
        System.out.println("toplamkazanc = " + toplamkazanc);
        System.out.println("ortalamagelir() = " + ortalamagelir());
        System.out.println("ortalamaustu = " + ortalamaustugunler());
        System.out.println("ortalamaalti = " + ortalamaustugunler());
        System.out.println("ortalamadenk = " + ortalamadenk());
    }//main

    static int ortalamagelir() {
        return toplamkazanc / 7;
    }

    static String ortalamaustugunler() {
        String ortalamaustu = "";
        for (int i = 0; i < 7; i++) {
            if (gunlukkazanc.get(i) > ortalamagelir()) {
                ortalamaustu+=gunler.get(i)+"";
            }
        }

        return ortalamaustu;
    }

    static String ortalamaaltigunler() {
        String ortalamaalti = "";
        for (int i = 0; i < 7; i++) {
            if (gunlukkazanc.get(i) < ortalamagelir()) {
                ortalamaalti+=gunler.get(i)+"";
            }
        }

        return ortalamaalti;
    }

    static String ortalamadenk() {
        String ortalamadenk = "";
        for (int i = 0; i < 7; i++) {
            if (gunlukkazanc.get(i) == ortalamagelir()) {
                ortalamadenk+=gunler.get(i)+"";
            }
        }
        System.out.println("ortalamadenk = " + ortalamadenk);
        return ortalamadenk;
    }


}
