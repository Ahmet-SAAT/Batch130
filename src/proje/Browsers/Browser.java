package proje.Browsers;

public class Browser {

    public static void main(String[] args) {
String adresCubugu="Her Browser icin adres cubgu vardir";
            Edge edge=new Edge();
            edge.searc();
            edge.sifreKaydetme();
            edge.get();
            Edge edge2=new Edge(adresCubugu);
        System.out.println(edge2.adresCubugu);


    }
    public void get(){
        System.out.println("Browserlar web sayfasina gider");
    }
    public void searc(){
        System.out.println("Browserlar aratma yapar");
    }
    public void sifreKaydetme(){
        System.out.println("Browserlar istenildiginde sifre kaydeder");
    }
}
