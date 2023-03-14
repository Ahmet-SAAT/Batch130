package advanceJava.Threads;

//Method icerisinde istenmeyen sonuca sebep olmayan kodlar da varsa ne yapilir
//Bütün metodu kilitlemek yerine,metot icerisinde kilitlemek istedigimiz yeri bir scope araligina alip
// synchronized (this) keyword unu kullaniyoruz.
//this keywordu bu classtan uretilen objeyi temsil ediyor.bloga erisen thread islemi bitirene kadar objeyi kilitler.
public class SynchronizedKeyword {
    public static void main(String[] args) {
        Brackets2 bracker2 = new Brackets2();

        long strt = System.currentTimeMillis();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 10; i++) {
                    bracker2.generateBrackets();
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 10; i++) {
                    bracker2.generateBrackets();
                }
            }
        });
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        long finish = System.currentTimeMillis();
        System.out.println("Gecen sure " + (finish - strt));
    }
}


class Brackets2 {
    //[[[[[]]]]] seklini ekrana yazdiran bir method olustur
    public void generateBrackets() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                if (i <= 5) {
                    System.out.print("[ ");
                } else {
                    System.out.print("] ");
                }
            }
            System.out.println(Thread.currentThread().getName());
        }

        //Asenkron calismasinda problem olmayan kodlar
        for (int i = 1; i <= 5; i++) {
            //baska kodlar
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
