package advancePratic.advancePratic05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listortustunotlar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Integer> notlar = new ArrayList<>();
        String karar;
        do {
            System.out.println("Lutfen Not Giriniz");
            notlar.add(input.nextInt());
            System.out.println("Lutfen Not Girisi Yapiniz.Cikis Icin Q ye Basiniz");
            karar=input.next();

        } while (!karar.equalsIgnoreCase("q"));
      //ort bul

        double top=0;
        for ( double w:notlar){
            top=top+w;
        }
        double ort=top/notlar.size();
        System.out.println(ort);

        //ort ustu say
        int counter=0;
        for (double w:notlar){
            if (w>ort){
                counter++;
            }
        }
        System.out.println("Ortalamanin Uzerinde "+counter+" kisi var");

    }//main
}
