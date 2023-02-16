package advancePratic.advancePratic06;

import java.util.Random;
import java.util.Scanner;

public class RastgeleSifreOlusturma {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.

    Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Karakter Sayisini Giriniz");
        int karaktersayisi=input.nextInt();
        String karakterler ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int maxindex=karakterler.length();
        String sifre="";
        for (int i =0; i <karaktersayisi ; i++) {
         int rastgeleindex=(int) (Math.random()*maxindex);//0 ile 1 arasinda bir sayi ile maxindexin intini aldim
        sifre+= karakterler.charAt(rastgeleindex);//rastgele int caharat ile chari sifreye koydum.For kacsa okadar

        }
        System.out.println("Sifre = " +sifre);

        System.out.println("Lutfen bir daha giriniz");
        int sifre2=input.nextInt();
        Random random = new Random();
        String password = "";

        for (int i = 0; i<sifre2; i++){

            char ch = (char) (random.nextInt(127-48)+48);//ascii degerlerini yazdim.Nicin -48 li bak
            password +=ch;

        }
        System.out.println("Password: "+password);



    }//main
}
