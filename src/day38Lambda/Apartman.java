package day38Lambda;

public class Apartman {
    private String cephe;
    private int katsayi;
    private int kira;

    public Apartman() {
    }

    public Apartman(String cephe, int katsayi, int kira) {
        this.cephe = cephe;
        this.katsayi = katsayi;
        this.kira = kira;
    }

    public String getCephe() {
        return cephe;
    }

    public void setCephe(String cephe) {
        this.cephe = cephe;
    }

    public int getKatsayi() {
        return katsayi;
    }

    public void setKatsayi(int katsayi) {
        this.katsayi = katsayi;
    }

    public int getKira() {
        return kira;
    }

    public void setKira(int kira) {
        this.kira = kira;
    }

    @Override
    public String toString() {
        return "Apartman{" +
                "cephe='" + cephe + '\'' +
                ", katsayi=" + katsayi +
                ", kira=" + kira +
                '}';
    }
}
