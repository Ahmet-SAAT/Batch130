package advanceJava.Threads;

public class ThreadCreationWays {
    public static void main(String[] args) {
        //ilk calisan thread main threaddir,Gorelim:
        System.out.println("Current thread : " + Thread.currentThread().getName());

        //Thread classini extends ederek
        MyThread thread1=new MyThread();
        thread1.start();//thread olusturmak istiyorsak method start methodu kullanimalidir.
        //class basa clasi da extend edecekse 2. yontem tercih edilmeli

        /*
        1-Start methodu thread olusturur ve override edilen run methodunu cagirir.
        2-Dogrudan run methodu cagrildiginda method icindeki islemler yapilir ancak thread olusmaz.
        Yani run methodu main thread icinde calisir yeni bir thread olusmaz.
         3-implementte sinir olmadiginda implemen eden class baska classi extend edecekse bu yontem kullanilmalidir*/



        //Runnable interface implement edilerek
        MyRunnable myRunnable=new MyRunnable();
        Thread thread2=new Thread(myRunnable);
        System.out.println("Current thread : "+Thread.currentThread().getName());
        thread2.start();

    //anonymous class ile thread olusturma 2. yolun daha kisa halidir.
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);//5 saniye threadi beklettik
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Current thread : "+Thread.currentThread().getName());
                System.out.println("Bu thread isimsiz class ile olusturuldu");
            }
        });
        thread3.start();
        thread3.setName("Anonim Thread");

        //anonymous class ile thread olusturmanin 2. yolu (2. yolun daha kisa halidir.)

        Thread thread4=new Thread(()-> {
            Thread.currentThread().setName("Harika");
            System.out.println("Current thread : "+Thread.currentThread().getName());
            System.out.println("Bu thread lambda ile olusturuldu");}
        );
        thread4.start();

        Thread thread5=new Thread(()-> {
            Thread.currentThread().setName("Harika");
            System.out.println("Current thread : "+Thread.currentThread().getName());
            System.out.println("Bu thread lambda ile olusturuldu");}
        );
        thread5.start();
        System.out.println("Main methodun islemi burada bitti");


    }
}

//Thread olusturmanin 1.Yolu Thread classini extends etme
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread thread`i calisiyor.");
    }
}

//2.YOL Runnable interfaceini implements etmek
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("MyRunnable ile oluturdugumuz thread calisiyor");
    }
}
