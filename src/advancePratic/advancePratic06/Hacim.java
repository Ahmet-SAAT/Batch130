package advancePratic.advancePratic06;

public class Hacim {
    public static void main(String[] args) {
        MethodOverloadingHacim obje=new MethodOverloadingHacim();
        obje.hacimHesap(5,2,6);
        MethodOverloadingHacim.hacimHesap(5);
        MethodOverloadingHacim.hacimHesap(8,5);
       /* MethodOverloadingHacim  Classinda hacimHesap isimli 3 adet metod olusturdum
       2 si static 1 i instance isi
       static olanlara class ismiyle ulastim.
       Instance olana o classin adiyla obje olusturup o obje ile ulastim.
       Metotlardan birini void yapmistim sonuc degismedi.
       overlaiding icin isim ve parametre onemlidir.
        */
    }
}
