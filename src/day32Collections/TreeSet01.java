package day32Collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {

       //Her data tipi ile clisan methodlara Generic Method denir.Java E olarak gosterir



        long one = System.currentTimeMillis();
        TreeSet<Integer> ts = new TreeSet<>();//natural order
        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);

        long two = System.nanoTime();
        HashSet<Integer> hs = new HashSet<>();//Random order
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);
        TreeSet<Integer> hts = new TreeSet<>(hs);//treeset icine hashset ile ekleneni koyarsak daha hizli olur.
        long three = System.nanoTime();

        System.out.println("TreeSet Uygulama Suresi = " + (two - one));
        System.out.println("HashSet Uygulama Suresi = " + (three - two));

        /*
        -TreeSet eleman eklemede cok yavas hashSet ise cok hizlidir.
        -TreeSetin bu negatif yonunden kurtulmak icin Hashset olusturur elemanlari ekler.
        -Ve HashSeti TreeSete ceviririz.
         */

        System.out.println("ts.first() = " + ts.first());//Ilk eleman.En Kucugu
        System.out.println("ts.last() = " + ts.last());//son eleman.En buyugu

        ts.floor(15);//15 elemanlardan biri degil. oyuzden ondan bir oncekini var olan yazdirir
        ts.floor(15);//12 elemanlardan biri oldugu icin kendisini verir.
        //"Floor" methodunda kullanilabilecek sayi en kucuk elemandan az olamaz.Kendisi olabilir.
        ts.ceiling(15);//floorun ters mantigi.Kendisi varsa kendisi kendisi yoksa kendinden sonra buyuk olan ilk  eleman
        // oda yoksa null verir.Yani "ceiling()" method'unda kullanabilceginiz sayi en buyuk elemandan fazla olamaz.

       SortedSet<Integer> tailset1=ts.tailSet(12);//o eleman ve ondan buyuk elemanlari verir.Eleman yoksa buyuklerini
        System.out.println(tailset1);//[12, 25, 32]
        SortedSet<Integer> tailset2=ts.tailSet(15);
        System.out.println(tailset1);//[25,32]
        NavigableSet<Integer> tailset3= ts.tailSet(12,false);
        //bu methodda fark sudur=Dahil olani gormek istiyorsak true istemiyorsak false deme imkanimiz var.
        SortedSet<Integer> headset1=ts.headSet(12);
        //tailset ile ayni ama dahil olani varsa da dahil olani vermez ve oncekileri gosterir.
        //Dahil olani gormek istersem 2 parmetreli headsette true deriz.
        Integer higher=ts.higher(12);//12den sonraki ilk buyugu verir.Ceeling de kendi varsa kendini verirdi.
           Integer lower=ts.lower(12);//12den bir kucugunu verir

    }
}
