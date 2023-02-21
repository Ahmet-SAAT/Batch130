package day38Lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {
        //1den x ekadar(x dahil) int degerleri akisi alip toplamini return et
        birdenXeKadarToplam(5);//15

        //1den x ekadar(x dahil) int tek sayi degerleri akisi alip toplamini return et
        birdenXeKadarTekSayiToplam(5);//9

        // 1den sonsuza kadar giden tek sayilardan ilk x tanesini topla return et
        birdenSonsuzaKadardanIstedigimTekSayilarToplami(3);//9

        // 2den sonsuza kadar giden cift sayilardan ilk x tanesini topla return et
         ikidenSonsuzaKadardanIstedigimTekSayilarToplami(5);//30
        // 5den sonsuza kadar giden kuvvetlerden ilk x tanesini topla return et
       bestenSonsuzaKadarKuvvetlerdenIlkKuvTop(4);//780

        //x sayisinin faktoriyelni bulunuz
          faktoriyel(5);
          faktoriyel2(5);
    }

    private static void faktoriyel(int x) {
       int sonuc= IntStream.
                rangeClosed(1,x).
                reduce(1,(a,b)->a*b);
        System.out.println(sonuc);
    }
    private static void faktoriyel2(int x) {
        OptionalInt sonuc= IntStream.
                rangeClosed(1,x).
                reduce(Math::multiplyExact);

        System.out.println(sonuc);
    }

    public static int birdenXeKadarToplam(int x) {
        int sonuc = IntStream.
                range(1, x + 1).//2. deger dahil degil
                        sum();
        System.out.println(sonuc);
        return sonuc;
    }

    public static int birdenXeKadarTekSayiToplam(int x) {
        int sonuc = IntStream.
                rangeClosed(1, x).//2.deger dahil
                        filter(t -> t % 2 != 0).
                sum();
        System.out.println(sonuc);
        return sonuc;
    }

    public static int birdenSonsuzaKadardanIstedigimTekSayilarToplami(int x) {
        int sonuc = IntStream.
                iterate(1, t -> t + 2).//sonsuza kadar 1 den sonra 2 artira artira/iterator ile karistirma
                        limit(x).
                         sum();
        System.out.println(sonuc);
        return sonuc;
    }
    public static int ikidenSonsuzaKadardanIstedigimTekSayilarToplami(int x) {
        int sonuc = IntStream.
                iterate(2, t -> t + 2).//sonsuza kadar 2 den sonra 2 artira artira/iterator ile karistirma
                        limit(x).//lk x degeri toplayacak
                sum();
        System.out.println(sonuc);
        return sonuc;
    }
public static int bestenSonsuzaKadarKuvvetlerdenIlkKuvTop(int x){
        int sonuc=IntStream.
                iterate(5,t->t*5).
                limit(x).
                sum();
    System.out.println(sonuc);
    return sonuc;
}

}