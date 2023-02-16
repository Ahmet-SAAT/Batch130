package day32Collections;

import java.util.LinkedHashSet;

public class LinkHashSet01 {
    public static void main(String[] args) {

        LinkedHashSet<String> artist = new LinkedHashSet<>();
        LinkedHashSet<String> actrist = new LinkedHashSet<>();

        artist.add("Ajda");
        artist.add("Tom");
        artist.add("Brad");
        artist.add("Angelina");
        //Setler tekrarsiz eleman icerirler.Ayni elemani tekrar tekrar yazarsak java hata vermez.
        //Fakat sskisi elemanin uzerine kopyalar.Buna overWriting denir
        artist.add("Tom");
        //Uzerine yazma isine overwrite denir.
        System.out.println(artist);

        actrist.add("Ajda");
        actrist.add("Angelina");

        //artist.remove("Tom");ilk gordugunu siler ama zaten sette tekrar yok.
        artist.removeAll(actrist);//List icinden list sildim/



    }
}
