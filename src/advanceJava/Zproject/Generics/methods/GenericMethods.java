package advanceJava.Zproject.Generics.methods;

import java.util.Arrays;

public class GenericMethods {
    public static void main(String[] args) {
        String[] stdList={"Bilal","Ebubekir","Nesrin"};
        Double [] pointList={95.4,54.3,40.2};
        Character [] gradeList={'A','B','C','D'};

        //Listeleri  Ekrana Basma
        printArray(stdList);
        printArray(pointList);
        printArray(gradeList);
       //Listeleri Data turune gore siralayarak
        System.out.println(Arrays.toString(printArrayByOrdering(stdList)));
        System.out.println(Arrays.toString(printArrayByOrdering(gradeList)));
        System.out.println(Arrays.toString(printArrayByOrdering(pointList)));


    }
    public static <S> void printArray(S[] array){
        for (int i =0; i <array.length ; i++) {
            System.out.print(array[i]+" ");


        }
        System.out.println();
    }
    public static <T extends Comparable<T>> T[] printArrayByOrdering(T[] array){
        for (int i =0; i < array.length ; i++) {
            for (int j =0; j <array.length; j++) {
               if (array[i].compareTo(array[j])>0){//i j den buyukse 1 doner esitse 0 kucuke -1
                T temp=array[i];
                array[i]=array[j];
                array[j]=temp;

               }

            }

        }
        return array;
    }

}
