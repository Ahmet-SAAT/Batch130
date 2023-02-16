package proje.Browsers;

public class Edge extends Browser{
    String  adresCubugu;

   public Edge(String adresCubugu) {
        this.adresCubugu = adresCubugu;
    }

    public Edge() {
    }

    @Override
    public void searc() {
        System.out.println("Edge Arame Yapar");
    }

    @Override
    public void sifreKaydetme() {
        System.out.println("Edge Sifre Kaydeder");
    }


}

