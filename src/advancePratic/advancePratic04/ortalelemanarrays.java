package advancePratic.advancePratic04;

import java.util.ArrayList;
import java.util.List;

public class ortalelemanarrays {
    public static void main(String[] args) {

 // İki Array'de ortak bulunan elementleri ayrı bir List içerisine ekleyen bir kod yazınız.

        String[] arr = {"John","Brad","Angel","Sofia","Emily"};
        String[] brr = {"sofia","brad","grace","emily","hazel"};
        List<String>NewList=new ArrayList<>();
        for (String w:arr ) {
            for (String m:brr){
                if (w.equalsIgnoreCase(m))
                {
                        NewList.add(w);
                }

            }
            System.out.println(NewList);
        }





    }//main
}
