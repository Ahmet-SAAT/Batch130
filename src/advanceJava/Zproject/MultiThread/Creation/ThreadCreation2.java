package advanceJava.Zproject.MultiThread.Creation;

public class ThreadCreation2 {
    public static void main(String[] args) {
        //runnable interfaceini implement eden counter isimli sinif olustur
        //bu sibif a dan z ye kadar yazan iki tane thread olustur
        //threadler baslaman once yaris baslasin yaris bittiginde bitti desin

        System.out.println("Yaris basladi");
        Counter c1=new Counter("A");
        Counter c2=new Counter("B");

        Thread thread1=new Thread(c1);
        Thread thread2=new Thread(c2);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("yaris bitti");
    }
}
