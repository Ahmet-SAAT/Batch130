package advancePratic.AdvancePratic07;

public class C03Sirket {
static  int kasa;
int departmanbutcesi;

public void kasadanButceyeParaAl(int alinacakPara){
    departmanbutcesi+=alinacakPara;
    kasa-=alinacakPara;
    System.out.println("Kasadan "+alinacakPara +"TL Alindi");
}
    public static void paraKazan(int kazanilanPara){
    kasa+=kazanilanPara;
        System.out.println(kazanilanPara+" TL Kazanildi");
    }
    public static void kasadanParaHarca(int harcanacakPara){
    kasa-=harcanacakPara;
        System.out.println("Kasadan "+harcanacakPara+" Harcandi");

    }

    public void departmanHarcamasi(int harcanacakPara){
    departmanbutcesi-=harcanacakPara;
    System.out.println("Departman Butcesinden "+harcanacakPara+" Harcandi");
    }
}//class
