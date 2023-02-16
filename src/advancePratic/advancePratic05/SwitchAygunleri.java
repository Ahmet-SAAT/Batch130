package advancePratic.advancePratic05;

import java.util.Scanner;

public class SwitchAygunleri {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Ay Giriniz");
        int ay=input.nextInt();
        System.out.println("Lutfen Yil Giriniz");
        int yil=input.nextInt();
    switch (ay) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12: {
            System.out.println("Girdiginiz Ayin Gun SAyisi 31 Gundur");
            break;
        }
        case 4:
        case 6:
        case 9:
        case 11:
        {
            System.out.println("Girdiginiz Ayin Gun Sayisi 30 Gundur");
            break;
        }
        case 2:{
            if ((yil%4==0 && yil%100!=0) ||yil%400==0) {
                System.out.println("Girdiginiz Ayin Gun Sayisi 29 Gundur");
            }else {
                System.out.println("Girdiginiz Ayin Gun Sayisi 28 Gundur");
            }
            break;
        }
    }







    }//main
}
