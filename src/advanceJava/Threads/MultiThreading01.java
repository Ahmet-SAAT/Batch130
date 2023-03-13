package advanceJava.Threads;

public class MultiThreading01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        CounterWithoutMultiThread counter1 = new CounterWithoutMultiThread("Ahmet");
        CounterWithoutMultiThread counter2 = new CounterWithoutMultiThread("Ebubekir");

        counter1.countMe();
        System.out.println("--------------------------------------");
        counter2.countMe();
        long finish = System.currentTimeMillis();
        long sonuc = finish - start;
        System.out.println("Without Multithrading olmadan gecen sure " + sonuc);

        long start2 = System.currentTimeMillis();
        CounterWithMultiThread counter3 = new CounterWithMultiThread("Ali");
        CounterWithMultiThread counter4 = new CounterWithMultiThread("Ayse");
        counter3.start();
        counter3.setName("Ali");
        //counter3.join(); boyle yapsak once counter3 bitecek sonra counter4 e gececek.Isimleri onc ali bitirecek sonra ayse baslayacak
        System.out.println("--------------------------------");
        counter4.start();
        counter4.setName("Ayse");

        try {
            counter3.join();//main threadde counter3 calismasi bitene kadar bekle demek
            counter4.join();//main threadde counter3 calismasi bitene kadar bekle demek
            //sonra main threade katil
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        long finish2 = System.currentTimeMillis();
        long sonuc2 = finish2 - start2;
        System.out.println(" Multithrading ile gecen sure " + sonuc2);

    }

}

//Thread kullanmadan 1 den 10 kadar yazdiran method
class CounterWithoutMultiThread {
    public String name;

    public CounterWithoutMultiThread(String name) {
        this.name = name;
    }

    public void countMe() {

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("i : " + i + " - " + name);
        }
    }

}

//thread ile ekrana 1 den 10 kadar yazdirma
class CounterWithMultiThread extends Thread {
    public String name;

    public CounterWithMultiThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Threadi Calismaya basladi");
        countMe();
    }

    public void countMe() {

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("i : " + i + " - " + name);
        }
    }

}