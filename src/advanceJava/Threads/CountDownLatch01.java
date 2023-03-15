package advanceJava.Threads;

import java.util.concurrent.CountDownLatch;

/*
Birden fazka thread ile calisirken bazi threadlerin daha once calismasini ve main ve diger threadlerin beklemesini
istedigimizde countdownlatch in methodlari ile oncelik verdigimiz threadler icin bir sayac olusturur.
Bu sayac her thread isini tamamladiginda bir azaltilir 0 oldugunda bu threadleri bekleyen diger threadler ve main thread
 calisabilir.

 */
public class CountDownLatch01 {
    public static void main(String[] args) {
        CountDownLatch latch1 = new CountDownLatch(4);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    latch1.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread1 calisiyor");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    latch1.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread2 calisiyor");
            }
        });
        WorkerThreads worker1 = new WorkerThreads("worker-1", 5000, latch1);
        WorkerThreads worker2 = new WorkerThreads("worker-2", 7000, latch1);
        WorkerThreads worker3 = new WorkerThreads("worker-3", 9000, latch1);
        WorkerThreads worker4 = new WorkerThreads("worker-4", 6000, latch1);

        thread1.start();
        thread2.start();
        worker1.start();
        worker2.start();
        worker3.start();
        worker4.start();
        try {
            latch1.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName()+ " Calisiyor");
    }


}

class WorkerThreads extends Thread {
    private int duration;
    private CountDownLatch latch;



    public WorkerThreads(String name, int duration, CountDownLatch latch) {
        super(name);
        this.duration = duration;
        this.latch = latch;
    }

    @Override
    public void run() {
        String threadname = Thread.currentThread().getName();
        System.out.println(threadname + " Basladi");
        try {
            Thread.sleep(duration);
            System.out.println(threadname + " isini bitirdi");
            latch.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}