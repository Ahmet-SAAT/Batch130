package advancePratic.advancePratic11.Interface_maas_hesapla;

public class MaasHesapla implements MaasArtir,Vergi{


    @Override
    public double yillikextra(int calismaYili) {
        return calismaYili*100;
    }

    @Override
    public  double saatextra(int calismasaati) {
        if (calismasaati>160) {
            return (calismasaati - 160) * 10;
        }else {
            return 0;
        }
    }

    @Override
    public double vergi(int calismaYili, double BrutMaas) {
     if (calismaYili>=10){
         return BrutMaas*0.3;
     }else {
         return BrutMaas*0.2;
     }
    }
    public double netmaas(double brutmaas,int calismaYili,int calismasaati){
        return brutmaas+yillikextra(calismaYili)+saatextra(calismasaati)+vergi(calismaYili,brutmaas);
    }
}
