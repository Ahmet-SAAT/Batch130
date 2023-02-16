package advancePratic.advancePratic09.Overriding;


public class Kredirunner {
    public static void main(String[] args) {
        EmekliKredisi emekli1=new EmekliKredisi();
        System.out.println("emekli1.faizHesapla(100) = " + emekli1.faizHesapla(100));
        isciKredisi isci1=new isciKredisi();
        System.out.println("isci1.faizHesapla(100) = " + isci1.faizHesapla(100));
        MemurKredisi memur1=new MemurKredisi();
        System.out.println("memur1.faizHesapla(100) = " + memur1.faizHesapla(100));
        BankaKredi banka=new BankaKredi();
        System.out.println("banka.faizHesapla(100) = " + banka.faizHesapla(100));
    }
}
