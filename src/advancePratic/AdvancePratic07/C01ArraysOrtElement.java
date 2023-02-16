package advancePratic.AdvancePratic07;

import java.util.Arrays;
import java.util.Scanner;

public class C01ArraysOrtElement {
    public static void main(String[] args) {
      /*  Elementlerini kullanıcandan aldığınız bir integer array içindeki orta elementi bulan bir kod yazınız.
                Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10   */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Array limitini  Giriniz");
        int limit=input.nextInt();
        int arr[]=new int[limit];

        for (int i =0; i <limit; i++) {
            System.out.println("Lutfen"+(i+1)+". elementi  sayi olarak giriniz");
            int element=input.nextInt();
            arr[i]=element;
        }
        Arrays.sort(arr);
        if (limit%2==1){
            System.out.println("ortanca sayi="+ arr[limit/2]);
        }else {
            System.out.println("ortanca sayi="+ (arr[limit/2]+arr[(limit/2)-1])/2.0);//bolumu dounle yaptim buyugu verir.
        }





    }//main
}
