package advancePratic.advancePratic04;

public class VarArgsKullaniciBilgisi {
    public static void main(String[] args) {

bilgiler("Ahmet","SAAT","30","Diyarbakir","Konya","Rize");
bilgiler2("Ahmet","SAAT","30","Rize","Diyarbakir","Konya");
    }//Main
public static void bilgiler(String ad,String soyad, String yas, String...sehirler){
    System.out.println("ad = " + ad);
    System.out.println("soyad = " + soyad);
    System.out.println("yas = " + yas);
    System.out.println("Yasanilan Sehirler");
    for (String w:sehirler){
        System.out.println(w);

    }

    }

public static void bilgiler2(String...bilgiler){
        for (int i=0; i<bilgiler.length;i++){
            if (i==0){
                System.out.println("Ad: "+bilgiler[i]);
            } else if (i==1) {
                System.out.println("Soyad: "+bilgiler[i]);

            } else if (i==2) {
                System.out.println("Yas: "+bilgiler[i]);
                System.out.print("Yasanilan Sehirler ");
            }else {
                System.out.print(bilgiler[i]+" ");

            }
        }

}



}
