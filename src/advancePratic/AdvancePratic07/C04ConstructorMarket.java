package advancePratic.AdvancePratic07;

public class C04ConstructorMarket {
    public static void main(String[] args) {

    C04Market obj1=new C04Market("Cikolata",20,6);
        System.out.println(obj1);//Generate==>ToString yaptigim icin tum variable leri yansitacak
   C04Market obj2=new C04Market("Peynir",100,3);
        System.out.println(obj2);

   C04Market obj3=new C04Market("Deterjan",200);
        System.out.println(obj3);

        C04Market obj4=new C04Market();
        System.out.println(obj4);//null 0.0 null  double Double olsydi 0.0 da null olurdu.

    }//main







}//class
