package advanceJava.Serialization;

import java.io.*;

//ObjectOutputStream java objelerini kodlar ve karsilik gelen akislari olusturur.
//Bu isleme serialization denir.
public class Serialization_Deserialization {
    //Serialization java objelerinin byte koda cevrilmesi deserialization ise tam ters
    public static void main(String[] args) {
    // writeObjects();
        readObjects();

    }
    //objeleri dosyaya yazdirma
    public static void writeObjects(){
        System.out.println("User objeleri olusturuluyor");
        User user1=new User(1L,"Ferit","556633366600");
        User user2=new User(2L,"Necmi","556633366600");
        User user3=new User(3L,"Saban","556633366600");
        User user4=new User(4L,"Mahmut","556633366600");
      //objelerin yazilacagi dosyaya yazmak icin
        try {
            FileOutputStream fos=new FileOutputStream("user.txt");
            //objeleri yazmak icin ise
            ObjectOutputStream output=new ObjectOutputStream(fos);
            //OOS objeleri yazdrabilmesi icin objelerin Classi serializable interfeceini implements etmelididir.
            //Cunku oncelikle objelerin serilesmeleri gerekiyor.Biz de user classini serializable e implements ettik.
            output.writeObject(user1);
            output.writeObject(user2);
            output.writeObject(user3);
            output.writeObject(user4);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

//objeleri dosyadan okuma=deserialization
    public static void readObjects(){
        //okuyacagimiz dosyay oncelikle belitmeliyiz
        FileInputStream fis= null;
        try {
            fis = new FileInputStream("user.txt");
            ObjectInputStream input=new ObjectInputStream(fis);
            User user1=(User)input.readObject();
            User user2=(User)input.readObject();
            User user3=(User)input.readObject();
            User user4=(User)input.readObject();
            System.out.println(user1);
            System.out.println(user2);
            System.out.println(user3);
            System.out.println(user4);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    }




