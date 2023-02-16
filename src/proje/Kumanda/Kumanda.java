package proje.Kumanda;

public class Kumanda {
    private  double genislik;
    private  double yukseklik;
    private  double ekranbuyuklugu;
    private int maxVolume=100;
    private  int ses=10;
    private boolean guc;

    public Kumanda(double genislik, double yukseklik, double ekranbuyuklugu) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
        this.ekranbuyuklugu = ekranbuyuklugu;
    }//cons

  public double kanalDegistirme(int kanal){
        switch (kanal){
            case 1:
                return 30.56;
            case 2:
                return 50.70;
            case 3:
                return 88.90;
        }
        return 0;
  }
public void gucDugmesi(){
        this.guc=!guc;

    }

    public int sesAzaltma(){
        if (ses>0){
            ses--;
        }
        return ses;
    }
    public int sesArtirma(){
        if (ses<100){
            ses++;
        }
        return ses;
    }


}
