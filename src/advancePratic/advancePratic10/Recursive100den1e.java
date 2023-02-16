package advancePratic.advancePratic10;

public class Recursive100den1e {
    //100 den 1 e kadar rakamlari loop ve sayi kullanmadan yazdiran method yaziniz
    public static void main(String[] args) {

        // System.out.println(((char) 101)); asci degeri kabul eder e verir.
        // System.out.println(((int) 'e')); asci degeri kabul eder 101 verir.
   sayilariYazdir('d');

    }

    public static void sayilariYazdir(char ch) {
       if (ch>='a'/'a'){
           System.out.print(ch*1);//chari matematik islemine tutunca ascii verir.
           ch--;
           sayilariYazdir(ch);
       }

    }
}
