package advancePratic.advancePratic08;

public class Matematik {
    double sonuc=1;
    public double carpma(double...x){
        for (double w:x){
            sonuc*=w;
        }
        return sonuc;
    }

    public double karesiniAl(double x){
        return x*x;
    }



}
