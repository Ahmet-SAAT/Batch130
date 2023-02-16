package advancePratic.advancePratic10;

public class ArraysHarfKullanimSayilari {
    //Stringde hangi harf kac kere girilmis yazin
    public static void main(String[] args) {
        String str="Java Is So Good";
        String [] arr=str.split("");
        int kullanimsayisi;
        String sonuc="";
        for (String w:arr){
            kullanimsayisi=0;
            for (String u:arr){
                if (w.equals(u)){
                    kullanimsayisi++;
                }
            }
            if (!sonuc.contains(w)){
                sonuc+=w+kullanimsayisi+" ";
            }
        }
        System.out.println(sonuc);
    }

}
