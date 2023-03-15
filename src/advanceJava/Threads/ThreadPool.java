package advanceJava.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Threadler maliyetli yapilardir.
Cpu memoryde kaynak ayirir.
Bu sebeple aktif olan thread sayisini azaltmak gerekebilir.

 */
public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        //Threadleri hazirlama
        ThreadCreator thread1 = new ThreadCreator("A");
        ThreadCreator thread2 = new ThreadCreator("B");
        ThreadCreator thread3 = new ThreadCreator("C");
        ThreadCreator thread4 = new ThreadCreator("D");
        ThreadCreator thread5 = new ThreadCreator("E");
        ThreadCreator thread6 = new ThreadCreator("F");

        //threadleri aktif hale getirelim
        //  thread1.start();
        // thread2.start();
        // thread3.start();
        // thread4.start();
        // thread5.start();
        //thread6.start();

        service.execute(thread1);
        service.execute(thread2);
        service.execute(thread3);
        service.execute(thread4);
        service.execute(thread5);
        service.execute(thread6);


        service.shutdown();//havuzdaki threadler is icin beklemeye devam eder.
    }

}

class ThreadCreator extends Thread {
    private String name;

    public ThreadCreator(String name) {
       this.name=name;
    }

    @Override
    public void run() {

        String threadname = Thread.currentThread().getName();
        System.out.println(threadname + " Basladi");
        System.out.println(threadname + " " + name + " Isini yapiyor");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadname + " Isini bitirdi");
    }
}