package day32Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.UnaryOperator;

public class Queue01 {
    public static void main(String[] args) {


   /*
     1-Queue kuyruk demek.
     2-Queue`larda ilk giren ilk isleme girer.First in First Out==>FIFO
     3-Bazen de son gelen ilk isleme girer.Last in First Out==>LIFO
     4-Lifo ve Fifo icin Deque(Double Enden Queue) kullanilir.Iki uclu calisir.
    */
//queue bir interacedir.Bu yuzden object olustururken new keywordundon sonra kullanilamaz.
        //Ya linkedlist deriz.Ya da PriorityQueue kullanilir.
        //Yani data tipi queue constructoru ise linkedlist ya da priorityQueue kullanilabilir.
        Queue<String> myQueue = new LinkedList();
        myQueue.add("Milk");
        myQueue.add("Butter");
        myQueue.add("Jam");
        myQueue.add("Egg");
        myQueue.add("Luxury water");
        System.out.println(myQueue.peek());//ilk elamani silmeden verir.Eleman yoksa null verir.
        System.out.println(myQueue);
        System.out.println(myQueue.poll());//ilk elemani siler ve verir
        System.out.println(myQueue);
        System.out.println(myQueue.element());//peek ile ayni fakat eleman yoksa throw atar
        System.out.println(myQueue);

        /*
        myQueue.poll();//cut paste yapar. ilk elemanı verir. boşsa null verir.
        myQueue.remove();//cut paste yapar. ilk elemanı verir. boşsa exception atar.
        myQueue.peek();//copy paste yapar.ilk elemanı verir.boşsa null verir.
        myQueue.element();//copy paste yapar.ilk elemanı verir.peek metodundan farkı boş olduğunda exception atmasıdır.
        p`ler null verir.
         */

        boolean b = myQueue.offer("Avacado");
        System.out.println(b);//true
        //Avacado liteye eklendi.add`den farki nedir.
        //add`de kosulsuz ekler.offerda ise kisitlama yoksa ekler.Boolean return eder.
        /*
        Queue olustururken PrioriytQueue consu kullanirsam elemanlari istedigim sekilde siralama hakkim olur.
        Siralamada kural olusturmayi lamdada gorecegiz.
         */
    }

}