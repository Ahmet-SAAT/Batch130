package day33Maps01;

import java.util.*;

public class HashMaps02 {
    public static void main(String[] args) {
        /*
        Size verilen cumledeki her bir kelimenin kcar kere kullnildigini gostern kod
         */
        //"Java is easy.Java is OOP.OOP makes java easy.
        String sentence = "Java is easy. Java is OOP. OOP makes Java easy.";
        sentence = sentence.replaceAll("\\p{Punct}", "");
        String[] wordArray = sentence.split(" ");
        System.out.println(Arrays.toString(wordArray));
      HashMap<String,Integer> worsMap=new HashMap<>();
      for (String w: wordArray){
          Integer numOfOccurence=worsMap.get(w);

          if (numOfOccurence==null){
              worsMap.put(w,1);
          }else {
              worsMap.put(w,numOfOccurence+1);
          }
      }
        System.out.println(worsMap);




    }


}
