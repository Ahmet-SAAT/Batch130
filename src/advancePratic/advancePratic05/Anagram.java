package advancePratic.advancePratic05;


import day14ArraysForEachLoop.Arrays03;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
     //iki kelimenin anagram olup olmadigini kontrol eden metod yaz
      anagram("Asya","Yasa");



    }//main
public static void anagram (String a,String b){


    String arr[]=a.toLowerCase().trim().split("");
    String brr[]=b.toLowerCase().trim().split("");

    Arrays.sort(arr);
    Arrays.sort(brr);

    if (Arrays.equals(arr,brr)){
        System.out.println("Bu iki String Anagramdir.");
    }else {
        System.out.println("Anagram Degillerdir");
    }


}



}
