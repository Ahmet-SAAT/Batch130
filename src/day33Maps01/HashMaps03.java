package day33Maps01;

import java.lang.reflect.Array;
import java.util.HashMap;

public class HashMaps03 {
    public static void main(String[] args) {
        //Size verilen cumlede kullanilan harflerin gorunum sayisini gosteren kodu yaziniz.
        String sg = "Java is Java.";
        String s=sg.replaceAll("[^a-zA-Z]","");
        HashMap<Character, Integer> lettersMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))){
                Integer val = lettersMap.getOrDefault(s.charAt(i), 0);
                lettersMap.put(s.charAt(i), ++val);
            }
        }
        System.out.println(lettersMap);


    }
}
