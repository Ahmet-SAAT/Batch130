package advancePratic.advancePratic11.abstraction_alan_hesapla;

public class Runner {
    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)
    public static void main(String[] args) {

        DokdortgenAlan dk=new DokdortgenAlan();
        System.out.println(dk.alanHesapla(5, 8));
        UcgenAlan ucg=new UcgenAlan();
        System.out.println(ucg.alanHesapla(8, 9));



    }

}
