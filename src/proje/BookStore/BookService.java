package proje.BookStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService implements ProductService {
    Scanner input = new Scanner(System.in);
    List<Book> books = new ArrayList<>();
   
    public BookService(){
        Book book1=new Book("Fareler ve İnsanlar","120 Lira",15,"J.Steinbeck","Penguin","A111");
        Book book2=new Book("Sefiller","150 Lira",5,"V.Hugo","Penguin","A222");
        Book book3=new Book("Suç ve Ceza","120 Lira",15,"Dostoyevski","Dream","A333");
        this.books.add(book1);
        this.books.add(book2);
        this.books.add(book3);
    }

    @Override
    public void processMenu() {
        int choice;
        do {
            System.out.println(".................");
            System.out.println("1-Kitaplari Listele");
            System.out.println("2-Kitap ekle");
            System.out.println("3-Kitap sil");
            System.out.println("4-Yayinevine gore filtrele");
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
                    System.out.println("Yayinevi : ");
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
                "ID", "Kitap Adı", "Yazar Adı", "Yayınevi", "ISBN", "Birim Fiyat", "Stok");
        System.out.println("--------------------------------------------------------------------------");
        this.books.forEach(book -> System.out.printf("%-2s | %-20s | %-15s | %-10s | %-4s | %-10s | %-3s\n",
                book.getId(), book.getName(), book.getAuthorName(), book.getPublisher(), book.getIsbn(), book.getPrice(), book.getStock()));
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();

    }

    @Override
    public void addProduct() {
        System.out.println("ISBN: ");
        String isbn = input.nextLine();
        boolean isExist = false;
        for (Book book : this.books) {
            if (book.getIsbn().equals(isbn)) {
                System.out.println("Bu kitap sistemde zaten kayitli,lutfen urun guncelleme yapiniz");
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Kitap adi: ");
            String name = input.nextLine();
            System.out.println("Yazar adi: ");
            String author = input.nextLine();
            System.out.println("Yayinevi : ");
            String publisher = input.nextLine();
            System.out.println("Birim Fiyati : ");
            String price = input.nextLine();
            System.out.println("Stok : ");
            int stock = input.nextInt();
            input.nextLine();
            Book newBook = new Book(name, price, stock, author, publisher, isbn);
            this.books.add(newBook);
        }
        listProduct();
    }

    @Override
    public void deleteProduct() {
        boolean isExist = true;
        System.out.println("Silmek istediginiz urunun id nosunu giriniz");
        int id = input.nextInt();
        for (Book book : books) {
            if (book.getId() == id) {
                isExist = true;
                this.books.remove(book);
                System.out.println(book.getName() + " Isimli Urun silindi");
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
     /*  this.books.
               stream().
               filter(book->book.getPublisher().equalsIgnoreCase(filter)).
               forEach(book -> System.out.printf("%-2s | %-20s | %-15s | %-10s | %-4s | %-10s | %-3s\n",
                       book.getId(), book.getName(), book.getAuthorName(), book.getPublisher(), book.getIsbn(), book.getPrice(), book.getStock()));  */
        int counter = 0;
        for (Book book : books) {
            if (book.getPublisher().equalsIgnoreCase(filter)) {
                System.out.printf("%-2s | %-20s | %-15s | %-10s | %-4s | %-10s | %-3s\n",
                        book.getId(), book.getName(), book.getAuthorName(), book.getPublisher(), book.getIsbn(), book.getPrice(), book.getStock());
            }
        }
        if (counter == 0) {
            System.out.println("Urun bulunamadi");
        }


    }
}
