package proje.Kumanda;

public class KumandaRunner {
    public static void main(String[] args) {

        Kumanda tv = new Kumanda(11.5, 7, 9.8);
        tv.gucDugmesi();
        System.out.println("tv.kanalDegistirme(2) = " + tv.kanalDegistirme(2));
        System.out.println("tv.sesAzaltma() = " + tv.sesAzaltma());
        System.out.println("tv.sesArtirma() = " + tv.sesArtirma());

    }
}
