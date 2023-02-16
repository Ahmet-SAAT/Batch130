package advancePratic.AdvancePratic07;

public class C03StaticSirket {

    public static void main(String[] args) {
        //Basit bir şirket bütçesi kodu yazınız.

        C03Sirket dep1 = new C03Sirket();

        dep1.kasadanButceyeParaAl(50000);
        System.out.println("Sirket.kasa = " + C03Sirket.kasa);
        System.out.println("dep1.departmanbutcesi = " + dep1.departmanbutcesi);


        C03Sirket.kasadanParaHarca(2500);
        System.out.println("Sirket.kasa = " + C03Sirket.kasa);
        System.out.println("dep1.departmanbutcesi = " + dep1.departmanbutcesi);

        dep1.departmanHarcamasi(5000);
        System.out.println("Sirket.kasa = " + C03Sirket.kasa);
        System.out.println("dep1.departmanbutcesi = " + dep1.departmanbutcesi);

        C03Sirket dep2 = new C03Sirket();

        dep2.kasadanButceyeParaAl(10000);
        System.out.println("Sirket.kasa = " + C03Sirket.kasa);
        System.out.println("dep2.departmanbutcesi = " + dep2.departmanbutcesi);

        C03Sirket.paraKazan(1000000);
        System.out.println("Sirket.kasa = " + C03Sirket.kasa);
        System.out.println("dep1.departmanbutcesi = " + dep1.departmanbutcesi);
        System.out.println("dep2.departmanbutcesi = " + dep2.departmanbutcesi);
    }//main
}
