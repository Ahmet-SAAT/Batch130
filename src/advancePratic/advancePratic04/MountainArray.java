package advancePratic.advancePratic04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MountainArray {
    public static void main(String[] args) {
        /*
        Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
        Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan sonra sürekli azalan Array.
  */
        //En buuj degerini bul oradan bolerek 2 array olustur.
        //Ilk arrayi kucukten buyugu sirala kendisine esitse ve
        //2.Arrayi buyukten kucuge sirala kendisine esitse mountain olur.

        int arr[] = {-100, 5, 7, 8, 9, 52, 7, 6, 2, 0};
        //Arrayi Liste cevirelim.
        List<Integer> list = new ArrayList<>();
        for (int w : arr) {
            list.add(w);
        }
        //Max degeri bul
        int max = list.get(0);
        for (int w : list) {
            if (w > max) {
                max = w;
            }
        }
        System.out.println(max);

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == max) {
                break;
            }
            list1.add(list.get(i));
        }
     System.out.println(list1);

        List<Integer>list2=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if (i<list.indexOf(max)){
                continue;
            }
            list2.add(list.get(i));
        }
        System.out.println(list2);

        //Yedekleyip sirala
        List<Integer>List1copy=new ArrayList<>(list1);
        List<Integer>List2copy=new ArrayList<>(list2);
        Collections.sort(List1copy);
        Collections.sort(List2copy);
        Collections.reverse(List2copy);//Buyukten kucuge dizelim.Ikinci array
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("List2copy = " + List2copy);
        System.out.println("List1copy = " + List1copy);
        if(list1.equals(List1copy) && list2.equals(List2copy) ){
            System.out.println("Mountain Arraydir");
        }else {
            System.out.println("Mountain Array Degil");
        }


    }//Main
}//Class
