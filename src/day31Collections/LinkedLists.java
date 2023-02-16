package day31Collections;


import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {

        List<String> cityNames=new LinkedList<>();
        LinkedList<String> names=new LinkedList<>();
        names.add("Ahmet");
        System.out.println(names);
        names.addLast("Ali");//addlast add ile ayni ama clean kod oluyor
        System.out.println(names);
        names.addFirst("Veli");
        System.out.println(names);
        names.add("Kale");
        System.out.println(names);
        names.add(2,"Ayse");
        names.add("Ayse");
        System.out.println(names);
        names.remove("Ayse");
        System.out.println(names);
        names.remove();//Ilk elemani Siliyor.Removefirst ile ayni istir.
        System.out.println(names);
        //names.removeFirstOccurrence("Ayse");ilk ayseyi siler remove(o) ile ayni
        //names.removeLastOccurrence("Ayse");Son Ayseyi Siler
       String r2=names.peek();//Retrieves, but does not remove, the head (first element) of this list.
                     //the head of this list, or null if this list is empty
                     //remove cut yapar peek copy yapar.
        System.out.println(names);
        names.poll();//remove bos listte kullanilirsa hata verir.Poll ise hata vermez. null verir.
        System.out.println(names);
        //names.pop();//removefirst ile aynidir.


    }
    /*
 1)Interface'lerden object olusturulamaz cunku interface'lerin constructor'i yoktur.
 2)Abstract Class'larda object olusturulamaz,constructor'lari vardir ama constructor object olusturmada kullanilamaz.
 3)Interface'lerin constructor'lari olmadigindan collection olustururken interface isimleri "new" keyword'unden
 sonra kullanilamaz.
 4)class --> class ==> extends
   class --> interface ==> implements
   interface --> interface ==> extends
   interface-->class olamaz....
   -Ayni olduklarinde extends class interface ise implement ama interface classin childi olamaz.
 -ArrayListler eleman silme ve eleman eklemede basarisizdir.
 -O yuzden eleman silme ve ekleme islemleri coklukla yapilacaksa Arraylist degil Linkedlins tavsiye edilir.
 -Cunku linkedlist index kullanmaz.Dolayisiyla silme ve eklemede indexler yeniden olusmaz.
 -Linkedlistde baslangictaki pointera head sondakine pointiranull eleman ve pointera  node denir.
 -Son eleman null ve degere beraber tail denir.Tren vagonlari gibi.
 -Linkedkistde eleman silme ve ekleme re-index yapmaya gerek yoktur.Cunku index yoktur.
 -Arraylistlerde arama kolay yapili.Cunku indexler adres gibidir.
 -Linkedlist search icinde basarilidir.Cunku headden baslayarak her elemana tek tek bakar.
 */


}
