package advancePratic.advancePratic06;

public class MethodOverloadingHacim {//Küp, kare prizma ve dikdörtgen prizmanın hacmini

public static int hacimHesap(int a){
    int hacim=a*a*a;
    System.out.println("kupunhacmi="+hacim);
    return hacim;
}
    public static void hacimHesap(int a,int b){
        int hacim=a*a*b;
        System.out.println("kareprizmaninhacmi="+hacim);
    }
    public int hacimHesap(int a,int b, int c){
        int hacim=a*b*c;
        System.out.println("dikdortgenprizmaninhacmi="+hacim);
    return hacim;
    }

}
