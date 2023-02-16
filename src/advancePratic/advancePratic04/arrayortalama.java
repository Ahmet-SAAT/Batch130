package advancePratic.advancePratic04;

public class arrayortalama {
    public static void main(String[] args) {
//Ortallamadan buyuk elemanlari yaz.
    int[] arr={5,9,15,0,11,3};
    int top=0;
    for (int w:arr){
        top=top+w;
    }
     int ortalama=top/arr.length;
        System.out.println("ortalama = " + ortalama);
        System.out.print("Ortalamadan Buyuk Elementler = ");
        for (int w:arr){
         if (w>ortalama){
             System.out.print(w+" ");
         }
     }



    }//main
}
