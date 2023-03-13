package advanceJava.Generics.Bounding;

import java.util.ArrayList;
import java.util.List;

public class GenericLowerBoundWildcard {
    //methodlarda da alttan usten sinirlandirma yapabiliriz.

    //integer data tipnin super classlari(parents) ile olusturulan listte eleman ekleyen method
    //intger ustu nedir Integer,Number,Object
    //wildcard (?) bilinmeyen data tipi
    public static void addElements(List<? super Integer> list) {//integer ustu classlarin wildcardi
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
    }

    //upperboundda wildcard kullanimi
    public static void multiplyByTwo(List<? extends Number> list) {
        //list.add(2);//wildcard listte degisiklige izin vermez
        list.
                stream().
                map(t -> 2 * t.doubleValue()).
                forEach(System.out::println);
    }
    //wildcard kisitlamasi  wildcard okunabilirligi artirir.
    // Fakat bazi kisitlamalari var.

    public static void printElements(List<?> listOfUnknown) {
        //listOfUnknown.add("s");//? denen tur bilinmedigi icin add gibi yapida degisiklik yapan methodlara izin vermiyor
        //Okumaya izin verir.
        //Tur bilinmedigi icin turden bagimsiz islemlere izin veriyor.orn size,sprint,clear,remove
        //add methoduna izin vermez farkli null eklersek izin verir.Cunku nullin data tipi yoktur.
        for (Object object : listOfUnknown) {
            System.out.println(object);
        }
    }

    public static void printElementsObject(List<Object> listOfUnknown) {
        for (Object object : listOfUnknown) {
            System.out.println(object);
        }
    }


    public static void main(String[] args) {
        List<Integer> intlist = new ArrayList<>();
        List<Number> numberlist = new ArrayList<>();
        List<Double> doublelist = new ArrayList<>();
        addElements(intlist);
        addElements(numberlist);
        //addElements(doublelist); //cte integerin parentlerini kabul eder.Yani sadece Integer ,Number ve Object

        //wildcard ile ust sinir
        multiplyByTwo(intlist);
        multiplyByTwo(doublelist);
        multiplyByTwo(numberlist);

        List<String> strlist = new ArrayList<>();
        List<Object> objectslist = new ArrayList<>();
        printElements(intlist);
        printElements(strlist);
        printElementsObject(objectslist);
        //printElementsObject(intlist);//kabul etmeyecek Cunku List<Object> List<Integer> in parenti degildir
        //printElementsObject(strlist);//kabul etmeyecek Cunku List<Object> List<String> in parenti degildir


        //T ile ? ayni manada degildir.
    }

}
