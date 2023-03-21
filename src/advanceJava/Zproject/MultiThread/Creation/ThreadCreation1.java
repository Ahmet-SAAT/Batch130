package advanceJava.Zproject.MultiThread.Creation;

public class ThreadCreation1 {
    /*
    1-Multithreadinf programlama nedir?
    -Ayni processde iki veya daha fazla is parcaciginin(thread) ayni anda calisma surecidir
    2-Threadler 2 sekilde olusturulur.
    Thread sinifindan extend eden alt sinif olusturup onun run metodu override edilir.
    -Runnable interfaceini implement eden bir alt sinif olusturup run metodu override edilir.
    ardindan Thread sinifinin constructorina nesne olarak gonderilir.
        */

    public static void main(String[] args) {
  //thread sinifini extend eden sayac isiminde sinif olustur.
        //bu sinifta sayilari 1 den 100 e kadar gosteren 2 thread olusturun
        Sayac thread1=new Sayac("Ronaldo");
        Sayac thread2=new Sayac("ArdaGuler");
        thread1.start();
        thread2.start();

    }
}
