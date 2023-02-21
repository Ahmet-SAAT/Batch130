package proje.Cesitli;

import java.util.Scanner;

public class YiyecekOtomati {
    public static void main(String[] args) {

        int elma=15;
        int armut=17;
        int sakiz=1;
        int kiraz=20;
        int seker=35;
        System.out.println("elma = "+elma+", armut= "+armut+", sakiz= "+sakiz+", kiraz= "+kiraz+", seker= "+seker);

        Scanner input=new Scanner(System.in);
        System.out.println("Ne arzu edersiniz");
        String urun=input.next().toLowerCase();
        System.out.println("Ne kadar paraniz var");
        int para=input.nextInt();

       switch (urun){
           case "armut":
               if (armut<para){
                   System.out.println(para-armut+" tl para ustu alacaksiniz" );
               } else if (armut==para){
                   System.out.println("Alisverisiniz icin tesekkur ederiz");
               } else {
                   System.out.println(armut-para+" tl daha vermeniz gerekiyor");
           }break;

           case "kiraz":
               if (kiraz<para){
                   System.out.println(para-kiraz+" tl para ustu alacaksiniz" );
               } else if (kiraz==para){
                   System.out.println("Alisverisiniz icin tesekkur ederiz");
               } else {
                   System.out.println(kiraz-para+" tl daha vermeniz gerekiyor");
               }break;

           case "elma":
               if (elma<para){
                   System.out.println(para-elma+" tl para ustu alacaksiniz" );
               } else if (elma==para){
                   System.out.println("Alisverisiniz icin tesekkur ederiz");
               } else {
                   System.out.println(elma-para+" tl daha vermeniz gerekiyor");
               } break;

           case "sakiz":
               if (sakiz<para){
                   System.out.println(para-sakiz+" tl para ustu alacaksiniz" );
               } else if (sakiz==para){
                   System.out.println("Alisverisiniz icin tesekkur ederiz");
               } else {
                   System.out.println(sakiz-para+" tl daha vermeniz gerekiyor");
               }break;

               case "seker":
               if (seker<para){
                   System.out.println(para-seker+" tl para ustu alacaksiniz" );
               } else if (seker==para){
                   System.out.println("Alisverisiniz icin tesekkur ederiz");
               } else {
                   System.out.println(seker-para+" tl daha vermeniz gerekiyor");
               }break;

           default:
               System.out.println("Boyle bir urunumuz bulunmamaktadir");
       }

    }//main
}
