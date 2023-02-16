package advancePratic.advancePratic09;

import java.util.Arrays;

public class Arraytekraredenlerisil {
    public static void main(String[] args) {
        //Bir array içerisindeki elementleri tekrarsız yazdıran bir kod yazınız.

        int[] arr = {5, 7, 4, 7, 5, 5, 6, 9, 8, 7,};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int idex=0;
//Son elemani kiyaslayacak sayi olmadigindan length-1 diyoruz.
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i]!= arr[i+1]){
                arr[idex]=arr[i];
                idex++;
            }

        } arr[idex]=arr[arr.length-1];

        System.out.println(Arrays.toString(arr));
        int[] arrtekrarsiz=new int[idex+1];
        for (int i =0; i<arrtekrarsiz.length ; i++) {
            arrtekrarsiz[i]=arr[i];
        }
        System.out.println(Arrays.toString(arrtekrarsiz));
    }
}
