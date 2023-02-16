package day34HashMap;

import java.util.Hashtable;
import java.util.TreeMap;

public class TreeMap01 {
    /*
    1-TreeMap entry`leri keylere gore natural ordera koyar
    2-TreeMap cok yavastir.Cunku natural order yapar.
    3-TreeMap thread-safe ve synchronized degildir.
    4-Siralama onemli ise treemap thread-safe onemliyse hashtable kullanilir.
    5)TreeMap'lerin "key" lerinde "null" kullanilamaz. Cunku "key" lere gore siralama yaptigi icin "null"ı
  koyacak bir yer olmaz. Ama "value" lardanistediginiz kadar kullanabilirsiniz.
     */
    public static void main(String[] args) {

   long one=System.nanoTime();
    TreeMap<String,Integer>stdAges=new TreeMap<>();
    stdAges.put("Ali",21);
    stdAges.put("Kemal",19);
    stdAges.put("Ayse",25);
    stdAges.put("Murat",22);
    //keylere gore alfabetik sira yapti.
        System.out.println(stdAges);
long two=System.nanoTime();
        Hashtable<String,Integer>stdhash=new Hashtable<>();
        stdhash.put("Ali",21);
        stdhash.put("Kemal",19);
        stdhash.put("Ayse",25);
        stdhash.put("Murat",22);
        System.out.println(stdhash);
    long three=System.nanoTime();
        Hashtable<String,Integer>stdhash1=new Hashtable<>();
        stdhash.put("Ali",21);
        stdhash.put("Kemal",19);
        stdhash.put("Ayse",25);
        stdhash.put("Murat",22);
    //  TreeMap<String,Integer>stdhas2=new TreeMap<>();
      //  System.out.println(stdhas2);
       long four=System.nanoTime();


        System.out.println(two-one);
        System.out.println(three-two);
        System.out.println(four-three);

    }
}
