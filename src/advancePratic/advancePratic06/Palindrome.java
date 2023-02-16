package advancePratic.advancePratic06;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //Bir String Degeri Polindrom mudur?
        Scanner input=new Scanner(System.in);
        System.out.println("Bir String Yaziniz");
        String str=input.nextLine().replaceAll(" ","");
        String strReverse="";
        for (int i =str.length()-1; i >0 ; i--) {
            strReverse+=str.charAt(i);

        }
        System.out.println("strReverse= "+strReverse);
        if (str.equals(strReverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome Degil");
        }
        String a="Ali";
        System.out.println(a.toLowerCase());//ALI
        System.out.println(a);//Ali  method orjinal degeri degistirmez



    }
}
