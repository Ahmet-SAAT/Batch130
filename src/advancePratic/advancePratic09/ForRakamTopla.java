package advancePratic.advancePratic09;

import java.util.Scanner;

public class ForRakamTopla {
    /*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
     Örn:
     input : J4\/4 1$ 34$¥
     output : 16
     İpucu:
     Character.isDigit()
     Integer.valueOf()
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String str=input.nextLine();

       int top=0;
      for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i)))
          {
             top+=Integer.parseInt(String.valueOf(str.charAt(i)));
             //parseint ve valuof string metodudur.Char ile ascii verir.Bu yuzden chari valuof ile string yaptim.
              //Stringide valuof ile integera cevirdim.
            }

        }
        System.out.println(top);
    }
}
