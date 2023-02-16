package day34HashMap;

import java.util.HashMap;

public class HashMapMechanism {
    public static void main(String[] args) {

        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Istanbul",17000000);
        hm.put("Miami",5000000);
        hm.put("Moscow",18000000);
        hm.put("New Delhi",3100000);


 /*
        1)Siz HashMap olusturmak icin "HashMap<String, Integer> hm = new HashMap<>();" kodunu yazdiginizda Java
          16 tane "bucket(kova)" olusturur ve bu "bucket" lari 0 dan 15 e kadar index'ler.
        2)Siz eleman eklemek icin "hm.put("Istanbul", 17000000);" kodunu yazdiginizda Java;
          i)"key" icin "hashCode" uretir.
          ii)"hashCode" u 16 ya boler
          iii)Kalani index olarak kullanip, index'i kalana esit olan bucket'a bu "entry" i yerlestirir.
          iv)Bucket'a "entry" eklenirken, Java o bucket icinde "LinkedList" yapisini kullanir.

     */
//Hashmaplerde java keyin hascodeunu 16ya boler kalan kac ise o indekse koya.
        //Baska bir entryin keyin kalani da ayn cikarsa linkedlist gibi nedle seklinde o indekste siralama yapar.
        //ilk 16 nin yuzde 75 i dolarsa bir 16 daha eklenir.
        //2.16 olusturma yavaslama ihtimalini azaltir.Cunku indeks artar.

    }
}
