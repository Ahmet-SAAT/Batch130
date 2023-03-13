package advanceJava.Generics.Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GenericMethod {
    public static void main(String[] args) {
     Integer[] intarr={1,23,4,65,9};
     Double[]doubleArr={0.5,2.3,45.9,11.75};
     String[] stringArr={"Java","harika","bir","program","dili :)"};
     printArr(stringArr);
     printArr(doubleArr);
     printArr(intarr);

     printAll(intarr);
     printAll(stringArr);
     printAll(doubleArr);

     getFirst(intarr);
     getFirst(stringArr);
     getFirst(doubleArr);

     printArrayAndObject(intarr,true);
     printArrayAndObject(doubleArr,"ali");
     printArrayAndObject(stringArr,9);

    }


    //arrayleri yazdirmak icin method
    public static void printArr(Integer [] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }
    public static void printArr(Double [] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }
    public static void printArr(String [] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }

    //Generic Method
    public static <T> void printAll (T[] arr ){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }
  //Arrayin ilk elemanini donduren returnlu generic yaz
    public static <T> T getFirst(T[] arr){
       T first=arr[0];
        System.out.println(first);
        System.out.println();
       return first;

    }
    //Birden fazla generic tip parametresi alan metod
    //Metodun iki farkli parametresinin data tip
    public static <S,U> void printArrayAndObject(S[] arr,U object){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println(object);
        System.out.println();
    }
    public static <S,U> void addObjectToArray(S[] arr,U object){
      // arr[0]=object;//cte cunku object ve arr data tipi farkli.Object data tipi de S olsa hata vermez
    }
}
