package advancePratic.advancePratic05;

public class ArraysToplamiVerilenIkililer {
    public static void main(String[] args) {

   //Toplamalari verilen bir sayiya esit olan iki sayiyi veren metod yazn



      ikisayi(10,7,2,3,5,8,6);

    }//Main

    public static void ikisayi(int a,int... arr){



        for (int i =0; i <arr.length; i++) {
            for (int j =i+1; j <arr.length ; j++) {
                if ((arr[i]+arr[j]==a))  {
                    System.out.println(arr[i]+" ve "+arr[j]+" = "+ a);
                }

            }

        }




    }


}
