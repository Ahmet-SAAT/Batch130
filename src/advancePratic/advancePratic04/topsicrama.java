package advancePratic.advancePratic04;

import java.util.Scanner;

public class topsicrama {
    public static void main(String[] args) {
/*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Yuksekligi Giriniz");
        double height=input.nextInt();

        int sicramasayisi=0;
        double toplamyol=0;
        do {
           sicramasayisi++;
           toplamyol+=height;//Top yukaridan asagiya inerken olusan yol
           height=height*3/4;//
           toplamyol+=height;//top yerden yukari cikarken olusan yol

        }while (height>=1);

        System.out.println("sicramasayisi = " + sicramasayisi);
        System.out.printf("Toplam Yol= " + " %.2f",toplamyol);//printf ef ile ilk kisimda cikis sartimizi yazdik
        //Burada dedikki 2.f yani virgul sonrasi 2 olsun dedik


    }//Main
}
