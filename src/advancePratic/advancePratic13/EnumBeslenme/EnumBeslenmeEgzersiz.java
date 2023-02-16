package advancePratic.advancePratic13.EnumBeslenme;

public class EnumBeslenmeEgzersiz  {
    public static void main(String[] args) {
        //Aylara göre sebze ve meyve tavsiyesi içeren ve toplam yapılması gereken egzersiz saatlerini söyleyen bir kod yazınız.
        //20 saat üstü egzersiz yapılacak ayları ekrana yazdırınız.
       for (BeslenmeEgzersiz w:BeslenmeEgzersiz.values()){
           if (w.toplamEgzersizSaati>25){
               System.out.println(w);//aylari yazdim.w.sebzeler desem o ayin sebzesini verirdik
           }
       }
    }
}
