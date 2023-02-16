package advancePratic.advancePratic06;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysIstenenleriSilme {
    //Bir  integer Array'de verilen bir deger dýþýndaki elamanlarý  yeni bir Array olarak yazdýran bir method yazýnýz
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Silmek Istediginiz elemani Giriniz");
        int silinecek=input.nextInt();
        int[] arr ={5,4,8,4,7,9};

        int length=0;
        for (int w:arr){
        if (w!=silinecek){
            length++;
        }
    }
        int brr[]=new int[length];

        int idex=0;
        for (int w:arr){
            if (w!=silinecek){
                brr[idex]=w;
                idex++;
        }
        }
        System.out.println(Arrays.toString(brr));






    }

}
