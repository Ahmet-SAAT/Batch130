package proje.Çesitli;


import java.util.ArrayList;
import java.util.List;

public class ListRemoveMetodu {
    public static void main(String[] args) {

   List <Integer>ages=new ArrayList<>();
   ages.add(5);
   ages.add(3);
   ages.add(7);
   ages.add(6);
   ages.add(2);
   ages.add(17);


   //index metodu silince neyi sildigini yazar.
        //Obje sildiyse evet silmediyse hayir yazar.
        //int degeri index degil de object olarak kullanacaksam nasil yaparim.
        //int rakami java primitive kabul eder.Non primitive yaparsak object olarak kabul eder.
        System.out.println(ages);//[5,3,7,6,2,17]

        System.out.println(ages.remove(2));//index sildim consol sildigi degeri yazdi.Yani 7(2.index)
        System.out.println(ages);//[5,3,6,2,17]

        System.out.println(ages.remove(Integer.valueOf(6)));//true diyecek ve int i girdigim 6 silinecek
        System.out.println(ages);//[5,3,2,17]

        System.out.println(ages.remove((Integer)17));//TRUE DER 17 DE GITTI
        System.out.println(ages);//[5,3,2]

        Integer nonprmitive=2;//silmek istedigim rakami nonprimitive yaptim remove icine yazacagim
        System.out.println(ages.remove(nonprmitive));//True der 2 de gitti
        System.out.println(ages);//[5,3]


    }
}
