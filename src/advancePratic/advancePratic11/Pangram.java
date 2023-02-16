package advancePratic.advancePratic11;

public class Pangram {
    /*
    Bir cümlenin pangram olup olamadığını kontrol eden bir kod yazınız.
    Not: Pangram, bir dilin alfabesi içerisindeki tüm harfleri içeren anlamlı cümledir.
    TR: Pijamalı hasta yağız şoföre çabucak güvendi.
    ENG: The quick brown fox jumps over the lazy dog.
    */
    public static void main(String[] args) {
        System.out.println(isPangram("Pijamalı hasta yağız şoföre çabucak güvendi"));

    }

    public static boolean isPangram(String str) {
        String trAlfabe = "abcçdefgğhiıjklmnoöprsştuüvyz";
        str = str.replace(" ", "").toLowerCase();

        for (int i = 0; i < trAlfabe.length(); i++) {
            if (!str.contains("" + trAlfabe.charAt(i))) {
                return false;

            }

        }
        return true;
    }

                //2.YOL
    public static boolean isPangram2(String str) {
        String trAlfabe = "abcçdefgğhiıjklmnoöprsştuüvyz";
        str = str.replace(" ", "").toLowerCase();

        for (char ch='a'; ch <= 'z'; ch++) {
            if (str.indexOf(ch)==-1) {
                return false;

            }

        }
        return true;
    }
}
