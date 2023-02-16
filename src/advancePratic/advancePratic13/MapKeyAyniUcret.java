package advancePratic.advancePratic13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapKeyAyniUcret {
    public static void main(String[] args) {
        //Aşağıda verilen fiyat listesinden fiyatı 29.99 olan ürünlerin adlarını yazdırınız.

        Map<String, Double> urunler = new HashMap<>();
        urunler.put("Kemer", 19.99);
        urunler.put("Gomlek", 29.99);
        urunler.put("Kazak", 24.99);
        urunler.put("Pijama", 29.99);
        urunler.put("Ayakkabi", 89.99);
        urunler.put("Kravat", 19.99);
        urunler.put("Terlik", 29.99);


        for (Map.Entry<String, Double> w:urunler.entrySet() ) {
            if (w.getValue()==29.99){
                System.out.println(w);
            }

        }
        urunler.keySet().
                stream().
                filter(t -> urunler.get(t) == 29.99).
                forEach(t -> System.out.print(t+" "));

        System.out.println();
        Collection<Double> fiyatlar=urunler.values();
       Set<String> urunadlari=urunler.keySet();
        for (int i=0;i <fiyatlar.size();i++) {
            if (fiyatlar.toArray()[i].equals(29.99)){
                System.out.print(urunadlari.toArray()[i]+" ");
            }
        }


       }




    }


