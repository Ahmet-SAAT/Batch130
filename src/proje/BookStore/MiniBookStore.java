package proje.BookStore;
/*
Proje: Mini Book Store
        Online bir kitap market için ürün yönetim uygulaması yapınız.
        Kitap markette kitap ve defter satışı olacak, ancak ileride yeni ürün çeşidi eklenebilir olmalı.

        Kitap özellikleri: id, isim, birim fiyat, stok, yazar adı, yayınevi,isbn no
        Defter özellikleri: id, isim, birim fiyat, stok, marka, yaprak sayısı,ürün kodu

        Kullanıcı ilgili kategorideki ürünleri listeleyebilmeli
        Kullanıcı kategoriye göre ürün ekleyebilmeli,ürün mevcutsa uyarı verilmeli
        Kullanıcı ürünleri benzersiz numaralarına(id) göre silebilmeli.
        Kullanıcı ürünleri marka(defter)  veya yayınevine(kitap) göre filtreleyip listeleyebilmeli.

        NotebookService:ÖDEV
        updateProduct:opsitonel ödev

        */
import java.util.Scanner;

public class MiniBookStore {
    public static void main(String[] args) {
        enter();
    }

    private static void enter() {

        Scanner input=new Scanner(System.in);
        int select;
        System.out.println("Mini Book Store");
        do {
            System.out.println("Urun Yonetim Plani");
            System.out.println("1-Kitaplar");
            System.out.println("2-Defterler");
            System.out.println("0-Cikis");
            System.out.println("Seciminiz");
            select=input.nextInt();
            input.nextLine();//dummy
          ProductService service;//ProductService data tipinde variable olusturdum.Polimorpfism ornegi
            switch (select){
                case 1:
               service=new BookService();//Bir obje olusturdum.Kisi secim yapinca obje olusacak.Ayrica daha esnek olacak/
               service.processMenu();
                break;
                case 2:
                   service=new NoteBookService();
                   service.processMenu();
                    break;
                case 0:
                    select=0;
                    System.out.println("Iyi Gunler");
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz");
                    break;
            }
        }while (select!=0);
    }
}
