package advanceJava.Generics.classes;

public class RunnerNonGeneric {
    public static void main(String[] args) {
        NonGenericClass nonGenericClass1=new NonGenericClass();
        NonGenericClass nonGenericClass2=new NonGenericClass();
           nonGenericClass1.setObject("Advance Java");
           nonGenericClass2.setObject(65);
       String str1=(String) nonGenericClass1.getObject();//Nongenericte cast proplemi
      // String str2=(String) nonGenericClass2.getObject();//cast yanlis yapilirsa cte degil rte verir
        Integer str2=(Integer) nonGenericClass2.getObject();

        System.out.println(str1);
        System.out.println(str2);

    //====================COKLU DATA TIPI ILE GENERIC CLASS//

    }

}
