package advancePratic.advancePratic13.CokluMapAile;

import java.util.*;

public class Aile {

    private Map<Map<String, String>, Map<Integer, List<String>>> aileMap = new HashMap<>();
    private Map<String, String> adSoyad = new HashMap<>();
    private Map<Integer, List<String>> yasKardesler = new HashMap<>();
    private List<String> kardeslerList = new ArrayList<>();

    public Aile(String ad, String soyAd, int yas, String...kardesler){
    adSoyad.put(ad,soyAd);
    Collections.addAll(kardeslerList,kardesler);
    yasKardesler.put(yas,kardeslerList);
    aileMap.put(adSoyad,yasKardesler);
    }

    public Map<Map<String, String>, Map<Integer, List<String>>> getAileMap() {
        return aileMap;
    }

}
