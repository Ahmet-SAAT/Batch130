package advancePratic.advancePratic09.Overriding;

public class MemurKredisi extends BankaKredi {
    @Override
    public double faizHesapla(double alinacakKredi) {
        return alinacakKredi*0.10;
    }
}
