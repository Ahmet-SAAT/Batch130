package advanceJava.Zproject.MultiThread.Creation;

public class ThreadCreation3 {
    public static void main(String[] args) {
        //anonymous class ile thrad olusumu
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Fare");
                String name=Thread.currentThread().getName();
                for (int i =1; i <=100 ; i++) {
                    System.out.println(name+" : kaciyorum...");
                }
            }
        });



   // lambda expression ile thread olustur
    Thread thread2=new Thread(()->{
        Thread.currentThread().setName("Kedi");
        String name=Thread.currentThread().getName();
        for (int i =1; i <=100 ; i++) {
            System.out.println(name+ " : yakalayacagim...");
        }
    });

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();



    }
}
