package advanceJava.Threads;

//threadler aynı anda aynı kaynağa erişip değişiklik yapmak isterlerse ne olacak?
//multithreading programlamada birden fazla thread aynı kaynağa(critical section) aynı anda erişip değişiklik yapmaya çalışırsa
//istenmeyen sonuçlar olur. Bu durumda threadlere sırayla erişim verilir. Yani ortak kaynağı bir thread kullanırken diğer
//thread beklemelidir. Bu işlem syncronized keywordü ile gerçekleştirlir.
//ilk threade join yapsak ayni isi gorur mu?Join varsa diger thread tum islemler icin bekler.syncronized icin ise sadece ilgili kisimda bekleme olacak.
public class MultiThreading02 {
    public static int counter=0;

    public static void main(String[] args) {
        //iki thread olusturup ayni kaynagi yani counter degiskenine erismesini saglayalim
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Calisti");
                Counter.count();
            }

        });
        thread1.setName("Tom");
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Calisti");
                Counter.count();
            }
        });
        thread2.setName("Jery");
        thread2.start();

    }

}

class Counter {
    public  synchronized static void count() {
        //Bu methoda bir thread ulasirsa o thread'in islemi tamamlanmadan baska bir thread methoda ulasamasin!
        //Synchronized ile threadleri siraya koymus oluruz.Methodu ayni anda birden fazla thread kullanilamaz.
        for (int i =1; i <= 100; i++) {
            MultiThreading02.counter++;
            System.out.println(Thread.currentThread().getName()+"--"+"counter : "+MultiThreading02.counter);
        }

    }
}
