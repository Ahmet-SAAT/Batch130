package day34HashMap;

import java.util.*;

public class Iterator01 {
    public static void main(String[] args) {
      /*
   Iterator'lar Loop'ların yaptığı işi yapar.Iteratorslar tıpkı loop'ta olduğu gibi elemanı alarak işleme sokar.
   Javanın Iterators'ları ortaya çıkarma sebebi infinite Loop riskini bitirmektir.
   Iterator'larda sonsuz loop yoktur.Iterator'lar Java tarafından sonradan oluşturulmuşlardır.
    Loop'ların yaptıkları bütün işlemleri yaparlar.
    Itirator ve looplarin Performans farklari yoktur.Hiz farklari yok yani
    Bneden list silmek istediklerinde iterator dusunulebilir.
    Elemanlari silme ve update etmede iterator daha basarilidir.
    Sonsuz Loop'lar memory dolana kadar çalışmaya devam eder. Application bu süreçte donar.(fire of day)
 */
        /*
        Iki tip Iterator vardir:
        1)Iterator
        -Sadece elemanlari remove edebilirsiniz.
        -Sadece soldan saga calisir.Yani tek yonludur(ForLoop gibi)
        2)List Iterator
        -Elemani remove etme ve update etme ve add  yapabilirsiniz
        -Hem soldan saga hem sagdan sola calisibilir.Yani cift yonludur.(for i gibi)
         */
//Listler mutableder.Method sonrasinda orjinal list degisir.
//    Iterator'larin update etme ozelligi olmadigi icin degistirilmesini istemedigimiz datalari bu sekilde kullanabiliriz
        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        Iterator<String> itr1 = list1.iterator();
        while (itr1.hasNext()) {
            itr1.next();
            itr1.remove();
        }
        System.out.println(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Ali");
        list2.add("Can");
        list2.add("Aliye");
        ListIterator<String> listItr = list1.listIterator();
        while (listItr.hasNext()) {
            String el = listItr.next();
            listItr.set(el + "!");
        }
        System.out.println(list2);

        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");

        ListIterator<String> listitr2 = list3.listIterator();
        while (listitr2.hasNext()) {//Once en sona gidiyoruz/Pointer en sona aliniyor.
            listitr2.next();
        }
        while (listitr2.hasPrevious()){//en sondan basa geliyoruz
            String el=listitr2.previous();
            System.out.println(el+"<<==");

        }
        System.out.println(list3);



    }
}
