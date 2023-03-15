package advanceJava.Threads;

/*
Bir öğrencinin banka hesabı için para yatırma(deposit) ve çekme işlemleri(withdraw) için uygulama
Hesapta para yoksa para yatırılması(bakiyenin artması) beklensin.
Bakiye artınca(yeterli olunca) para çekme gerçekleşsin.
*/
public class WaitNotify {
    public static int balance = 0;

    public static void main(String[] args) {
        WaitNotify waitNotify=new WaitNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                waitNotify.withdraw(1000);

            }
        });
        thread1.setName("Ogrenci");
        thread1.start();

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                waitNotify.deposit(2000);

            }
        });
        thread2.setName("Veli");
        thread2.start();


    }


    //para cekme icin method
    public synchronized void withdraw(int amaunt) {
        System.out.println(Thread.currentThread().getName() + " Para cekmek istiyor");
        if (balance < amaunt || balance < amaunt) {
            System.out.println("Bakiyeniz yetersiz...Mevcut bakiye = " + balance);
            System.out.println("Bakiyenin guncellenmesini bekliyor");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        if (balance >= amaunt) {
            balance -= amaunt;
            System.out.println("Para cekme islemi gereceklesti.Mevcut Bakiye = " + balance);
        } else {
            System.out.println("Bakiye yetersiz...Mevcut bakiye = " + balance);
        }
    }

    //para yatirma islemi yapalim
    public  synchronized void deposit(int amaunt) {
        System.out.println(Thread.currentThread().getName() + " Para yatirmak istiyor");
        balance += amaunt;
        System.out.println("Para yatirma islemi basariyla gerceklesti...Bakiye = " + balance);
        notify();
        System.out.println();

    }
}
