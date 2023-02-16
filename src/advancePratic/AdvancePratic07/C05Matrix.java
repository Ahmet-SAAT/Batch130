package advancePratic.AdvancePratic07;

import java.util.Scanner;

public class C05Matrix {
    public static void main(String[] args) {
       // Kullanıcıdan aldığınız bir sayi kadar satır ve sütun sayısına sahip alttaki rastgele 0 ve 1'lerden oluşan matriksi yazdırın.

        Scanner input=new Scanner(System.in);
        System.out.println("Satir Sayisini Giriniz");
       int sS=input.nextInt();
        for (int i = 0; i <sS ; i++) {
            for (int j =0; j <sS ; j++) {
                System.out.print((int)(Math.random() * 2)+" ");

            }
            System.out.println();

        }












    }

}
