package advancePratic.advancePratic04;

import java.util.Scanner;

public class harfdegistir {
    public static void main(String[] args) {
        /*Kullanıcıdan alınan bir String'de bulunan her bir karakteri alfabetik sırada bir sonraki karakter ile değiştirerek
    şifreleyen bir method ve şifreli ismi çözen ayrı bir method yazınız. (foreach loop kullanınız)*/

        System.out.println(sifreleme());


    }//main


    public static String sifreleme(){
        Scanner input=new Scanner(System.in);
        System.out.println("Bir String Giriniz");
        String [] arr=input.nextLine().split("");
    String sifrelistring="";
        for (String w:arr){
       sifrelistring+= (char)(w.charAt(0)+1);
    }
    return sifrelistring;
    }

    public static String sifrecoz(){
        Scanner input=new Scanner(System.in);
        System.out.println("Bir String Giriniz");
        String [] arr=input.nextLine().split("");
        String sifrelistring="";
        for (String w:arr){
            sifrelistring+= (char)(w.charAt(0)-1);
        }
        return sifrelistring;
    }


}//claa
