package day38Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {


        Apartman da01 = new Apartman("Dogu", 1, 7000);
        Apartman da02 = new Apartman("Bati", 2, 10000);
        Apartman da03 = new Apartman("Guney", 3, 12000);
        Apartman da04 = new Apartman("Dogu", 5, 15000);

        List<Apartman> daireler = new ArrayList<>(Arrays.asList(da01, da02, da03, da04));

        //Tum dairelerin kiralari 5000den buyukse true yap
        tumDaireKirasi5000denBuyukmu(daireler);//true

        //Dairelerden en az birinin katsayisi 2 ise return true yap
        enAzBirDaireninKatsayisiIkiMi(daireler);//true

        //Dairelerden cephesi dogu olanlarin sayisini return et yazdir
        cephesiDoguOlanlar(daireler);//2

        //Daireleri kat sayisina gore buyukten kucuge sirala
        buyuktenKucugeSirala(daireler);//cephe='Dogu', katsayi=5, kira=15000}, Apartman{cephe='Guney', katsayi=3, kira=12000}, Apartman{cephe='Bati', katsayi=2, kira=10000}, Apartman{cephe='Dogu', katsayi=1, kira=7000}

        //Katsaysi 2 den fazla olan daireleri kiraya gore buyukten kucuge siral en buyuk kiralisini lsit halinde return et
        daire2DenFazlaEnBuyukKira(daireler);//[15000]

        //Katsaysi 3 den az olan daireleri kiraya gore  kucukten buyuge gore sirala en kucuk kiralisi list halinde return et
        katSayi3denAzEnKucukKira(daireler);//[7000]

    }


    public static boolean tumDaireKirasi5000denBuyukmu(List<Apartman> list) {
        Boolean sonuc = list.
                stream().
                allMatch(t -> t.getKira() > 5000);
        System.out.println(sonuc);
        return sonuc;
    }

    public static boolean enAzBirDaireninKatsayisiIkiMi(List<Apartman> list) {
        Boolean sonuc = list.
                stream().
                anyMatch(daire -> daire.getKatsayi() == 2);
        System.out.println(sonuc);
        return sonuc;
    }

    public static long cephesiDoguOlanlar(List<Apartman> list) {

        long sonuc = list.
                stream().
                filter(t -> t.getCephe().contains("Dogu")).
                count();
        System.out.println(sonuc);
        return sonuc;
    }

    public static List<Apartman> buyuktenKucugeSirala(List<Apartman> list) {

        List<Apartman> sonuc=list.
                stream().
                sorted(Comparator.comparing(Apartman::getKatsayi).
                        reversed()).
                collect(Collectors.toList());
        System.out.println(sonuc);
        return sonuc;
    }
    public static List<Integer> daire2DenFazlaEnBuyukKira(List<Apartman> list) {

         List<Integer> sonuc=list.
                stream().
                 filter(t->t.getKatsayi()>2).
                sorted(Comparator.comparing(Apartman::getKira).
                        reversed()).
                 limit(1).
                 map(t->t.getKira()).
                 collect(Collectors.toList());

        System.out.println(sonuc);
       return sonuc;
    }
    public static List<Integer> katSayi3denAzEnKucukKira(List<Apartman> list) {
   List<Integer> sonuc=list.
           stream().
           filter(t->t.getKatsayi()<3).
           sorted(Comparator.comparing(Apartman::getKira)).
           limit(1).
           map(t->t.getKira()).
           collect(Collectors.toList());
        System.out.println(sonuc);
    return sonuc;
    }

}
