package advanceJava.Threads;
/*
//olumcul kilitleme:Iki veya daha fazla threadin islemleri tamamlamak icin birbirinin kilitlemis
oldugu kaynaklara erismek istemesi gibi durumlarda olusur.
Buda uygulamayi olumsuz etkiler.Sunucu cevap veremez hale gelir.
Genellikler icice synchronized block kullanildiginda yasanir.
 */
//Bu ornekte thread2 de obj1 ile baslarsa sorun cozulebilir.
public class DeadlockDemo {
    public static void main(String[] args) {
       String obj1="kahve";
       String obj2="seker";
       Thread thread1=new Thread(new Runnable() {
           @Override
           public void run() {
               synchronized (obj1){
                   System.out.println(Thread.currentThread().getName()+" "+obj1+" kullaniyor");
                   try {
                       Thread.sleep(2000);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   System.out.println(Thread.currentThread().getName()+" "+obj2+" istiyor");
                   synchronized (obj2){
                       System.out.println(Thread.currentThread().getName()+" "+obj2+" kullaniyor");

                   }
               }
               System.out.println(Thread.currentThread().getName()+" kahvesini bitirdi");

           }
       });
       thread1.setName("Sylwester");
       thread1.start();

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj2){
                    System.out.println(Thread.currentThread().getName()+" "+obj2+" kullaniyor");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName()+" "+obj1+" istiyor");
                    synchronized (obj1){
                        System.out.println(Thread.currentThread().getName()+" "+obj1+" kullaniyor");

                    }
                }
                System.out.println(Thread.currentThread().getName()+" kahvesini bitirdi");

            }
        });
        thread2.setName("Tweety");
        thread2.start();


    }
}
