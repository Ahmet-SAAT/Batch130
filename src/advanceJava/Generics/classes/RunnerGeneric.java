package advanceJava.Generics.classes;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class RunnerGeneric {
    public static void main(String[] args) {
        GenericClass<String> genericClass1 = new GenericClass();
        GenericClass<Integer> genericClass2 = new GenericClass();
        GenericClass<Boolean> genericClass3 = new GenericClass();
        genericClass1.setType("Ahmet");
        genericClass2.setType(53);
        genericClass3.setType(true);

        String str = genericClass1.getType();
        Integer i = genericClass2.getType();
        Boolean bl = genericClass3.getType();


        System.out.println(i);
        System.out.println(str);
        System.out.println(bl);

        GenericClassTwoParam<String,Integer> mymap=new GenericClassTwoParam<>();
        mymap.setS("Generic");
        mymap.setU(99);
        System.out.println(mymap.getS()+" "+mymap.getU());




    }
}
