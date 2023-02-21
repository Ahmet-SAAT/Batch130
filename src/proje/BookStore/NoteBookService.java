package proje.BookStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteBookService implements ProductService {
    Scanner input = new Scanner(System.in);
    List<NoteBook> noteBooks = new ArrayList<>();

    public NoteBookService() {
        NoteBook notebook1=new NoteBook("Kareli","50",100,"yaprak",100,"10");
        NoteBook notebook2=new NoteBook("Cizgili","45",50,"yaprak",100,"20");
        NoteBook notebook3=new NoteBook("Cizgisiz","40",20,"ressam",50,"30");
        this.noteBooks.add(notebook1);
        this.noteBooks.add(notebook2);
        this.noteBooks.add(notebook3);
    }

    @Override
    public void processMenu() {
        int choice;
        do {
            System.out.println(".................");
            System.out.println("1-Defterleri Listele");
            System.out.println("2-Defter ekle");
            System.out.println("3-Defter sil");
            System.out.println("4-Koda gore filtrele");
            System.out.println("0-Geri don");
            System.out.println("Seciminiz");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    listProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    System.out.println("Kod : ");
                    String publisher = input.nextLine();
                    filterProducts(publisher);
                case 0:
                    System.out.println("Ana menuye yonlendiriliyorsunuz");
                    break;
                default:
                    System.out.println("Hatali Giris");
                    break;

            }
        } while (choice != 0);


    }

    @Override
    public void listProduct() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-2s | %-20s | %-15s | %-10s | %-4s | %-10s | %-3s\n",
                "ID", "Defter Adı", "Fiyat", "Stok", "Marka", "Sayfa Sayisi", "Kod");
        System.out.println("--------------------------------------------------------------------------");
        this.noteBooks.forEach(noteBook -> System.out.printf("%-2s | %-20s | %-15s | %-10s | %-8s | %-10s | %-3s\n",
             noteBook.getId() , noteBook.getName(), noteBook.getPrice(),noteBook.getStock(),noteBook.getBrand(),noteBook.getSheet(),noteBook.getCode()));
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();

    }

    @Override
    public void addProduct() {
        System.out.println("Code: ");
       String cod = input.nextLine();
        boolean isExist = false;
        for (NoteBook notebook : this.noteBooks) {
            if (notebook.getCode().equals(cod)) {
                System.out.println("Bu defter sistemde zaten kayitli,lutfen urun guncelleme yapiniz");
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Defter adi: ");
            String name = input.nextLine();
            System.out.println("Fiyati: ");
            String price = input.nextLine();
            System.out.println("Stock : ");
            int stock = input.nextInt();
            input.nextLine();
            System.out.println("Marka : ");
            String brand = input.nextLine();
            System.out.println("Kod : ");
            String code=input.nextLine();
            System.out.println("Sayfa Sayisi : ");
            int sheet = input.nextInt();
            input.nextLine();
            NoteBook newNoteBook = new NoteBook(name,price,stock,brand,sheet,code);
            this.noteBooks.add(newNoteBook);
        }
        listProduct();



    }

    @Override
    public void deleteProduct() {
        boolean isExist = true;
        System.out.println("Silmek istediginiz urunun id nosunu giriniz");
        int id = input.nextInt();
        for (NoteBook noteBook : this.noteBooks) {
            if (noteBook.getId() == id) {
                isExist = true;
                this.noteBooks.remove(noteBook);
                System.out.println(noteBook.getName() + " Isimli Urun silindi");
                break;
            } else {
                isExist = false;
            }
        }
        if (!isExist) {
            System.out.println("Urun bulunamadi");
        }

    }

    @Override
    public void filterProducts(String filter) {
        int counter = 0;
        for (NoteBook noteBook : this.noteBooks) {
            if (noteBook.getCode().equals(filter)) {
                System.out.printf("%-2s | %-20s | %-15s | %-10s | %-8s | %-10s | %-3s\n",
                        noteBook.getId() , noteBook.getName(), noteBook.getPrice(),noteBook.getStock(),noteBook.getBrand(),noteBook.getSheet(),noteBook.getCode());
            }
        }
        if (counter == 0) {
            System.out.println("Urun bulunamadi");
        }



    }
}
