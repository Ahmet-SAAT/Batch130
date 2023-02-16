package day33Maps01;

import java.util.*;

public class HashMaps01 {
    public static void main(String[] args) {



/*
  1) Map'lerde "USA = 400,000,000" seklinde data depolamamiz gerektiginde kullanilir.
  2) "USA = 400,000,000" datasinin "USA" kismi "key" olarak adlandirilir ve key'ler "unique" dir
  3) "USA = 400,000,000" datasinin "400,000,000" kismi "value" olarak adlandirilir ve value'lar "tekrarli" olabilir.
  4)Maplerde depoladigimiz her bir dataya entry denir eleman denmez.
  5)Entryler uniquedir.Cunku key kisimlari unique oldugundan entryde uniquedir.
  6))HashMap cok hizlidir.Cunku HashMapler siralama ile ugrasmazlar.
  7) "HashMap" lerde bir tane "key" i "null" yapabilirsiniz.
  8) "HashMap" lerde birden fazla value`yu "null" yapabilirsiniz.
  9)HashMapler multiThread(coklu gorev) kullanilamaz.Ve Synchronization yoktur.
  10)Hashmaplerde siralama randomdir.
 -ulkeler ve nufuslarini depolamamiz lazim burda sol unique sag tekrarli olabilir.
 -okul appimiz var ogrencilerin karne ort  depolayacagiz sol unique sag tekrarli olabilir.
 --map te boyledir soldakiler Unique (yunik) olacak sag taraf tekrarli olabilir de olmayapilir repeatedly
 */
        HashMap<String, Integer> hm = new HashMap<>();
        //Key ve value icin iki data tipi girecegiz.
        //Primitiv olmaz.Non Primitive olmali

        hm.put("USA", 400000000);
        hm.put("Germany", 85000000);
        hm.put("Albania", 3000000);
        hm.put("Albania", 3500000);//Hashmap uniquedir.Uzerine yazar.A
        //Ayni key yazarak overwrite yaparsak value degeri update edilir.
        hm.put(null, 12000000);
        hm.put(null, 18000000);//Iki ayni key olmaz.Unique olmaz.

        System.out.println(hm);
        //hm.putAll(hm2);Yeni bir HashMap eklerSystem.out.println(hm);Sysotem.ut.println(hm.containsKey("USA"));
        Set<String> hmKeys = hm.keySet();//sadece keyleri verir
        //keysey bana keyleri verir.set tekrarsiz o yuzden sete koyar.keysetten aliriz.
        Collection<Integer> hmValue = hm.values();
        int sum = 0;//value toplamlarinin buldum
        for (Integer w : hmValue) {
            if (w != null) {
                sum = sum + w;
            }

        }

        Integer usaPoplation = hm.get("USA");
        System.out.println(usaPoplation);
        //Hashmaplerde belirli bir keyin valuesini get methodu ile aliriz.

        hm.replace("USA", 450000000);//replace ile key verip o keyin degerini degistiririz.
        hm.putIfAbsent("USA", 555555555);//verdigim key yoksa ekle.Varsa dokunma
        hm.putIfAbsent("Turkey", 82000000);

        //Example
        // Yeni ogretmenin maasi standar ucretten 1000 tl fazla.Eski ogretmenin maasi standart ucretten 2000 fazla olsun
        HashMap<String, Integer> salaries = new HashMap<>();

        salaries.put("Ali", 8000);
        salaries.put("Ayse", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);
        String teacherName = "Kemal";

        salaries.putIfAbsent(teacherName, 11000);//Kemal listeye eklenir.
        salaries.putIfAbsent("Tom", 12000);//tom icin calismaz.Value guncellenmez.


        hm.getOrDefault("Turkey", 0);//Turkey varsa degerini verecek yoksa 0 verecek
        //Yani key varsa onun valuesini yoksa 2.parametreye koydugumuz degeri verir.
        Set<Map.Entry<String, Integer>> myEntry = hm.entrySet();
        //Set methodlri kullanabilmek icin entrySet() ile mpi sete cevirebiliriz.
        //!!! Map lerde loop kullanilmaz. Bunun yerine Map'ler Set'e cevrilir ve loop kullanilabilir.
        //Entryset() methodu kullandigimizd elde ettigimiz setin elemanlari map olur.
        //Bu yuzden elemn icin map methodlari kullanilabilir.
        System.out.println();
        //Exm Ulke ismindeki karakter sayisini ulke nufusuna ekle
        for (Map.Entry<String, Integer> w : myEntry)
            if (w.getValue() != null && w.getKey() != null) {
                int son = w.getValue() + w.getKey().length();
                System.out.println(son);
            }
    }

}



