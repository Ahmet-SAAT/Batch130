package advancePratic.advancePratic09.Overriding;

public class isciKredisi extends BankaKredi {
    @Override
    public double faizHesapla(double alinacakKredi) {
        return alinacakKredi*0.15;
    }
}
