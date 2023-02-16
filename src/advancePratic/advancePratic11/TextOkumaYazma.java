package advancePratic.advancePratic11;

import java.io.*;

public class TextOkumaYazma {
    //Bir text metodunun her satirini oku ve kelime sayisi ver.
    public static void main(String[] args) throws IOException {
        FileReader fileread = new FileReader("C:/Users/Dell/OneDrive/Masaüstü/HelloWorld.txt");
        BufferedReader bufferedReader = new BufferedReader(fileread);
        String satir = bufferedReader.readLine();
        String yeniDosya = "";
        while (satir != null) {
            yeniDosya += satir + "====> Satir Kelime Sayisi: " + satir.split(" ").length + "\n";
            satir = bufferedReader.readLine();

        }
        System.out.println(yeniDosya);

        FileWriter fileWrite=new FileWriter("C:/Users/Dell/OneDrive/Masaüstü/yazdir.txt");
        fileWrite.write(yeniDosya);
        fileWrite.close();

    }
}
