package miniproje.minibokkstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2-a:bookla ilgili işlemler
public class BookService implements ProductService {
    Scanner inp = new Scanner(System.in);
    //3-bookları saklamak için list oluştur
    List<Book> books = new ArrayList<>();

    //4:başlangıç sistemde mevcut kitaplar olsun:test etmek için
    public BookService() {
        Book book1 = new Book("Fareler ve İnsanlar", "120 Lira", 15, "J.Steinbeck", "Penguin");
        Book book2 = new Book("Sefiller", "150 Lira", 5, "V.Hugo", "Penguin");
        Book book3 = new Book("Suç ve Ceza", "120 Lira", 15, "Dostoyevski", "Dream");
        this.books.add(book1);
        this.books.add(book2);
        this.books.add(book3);
    }

    //5:işlem menüsü
    @Override
    public void processMenu() {
        int choice;
        do {
            System.out.println("----------------------------");
            System.out.println("1-Kitapları listele");
            System.out.println("2-Kitap ekle");
            System.out.println("3-Kitap sil");
            System.out.println("4-Yayınevine göre filtrele");
            System.out.println("0-Geri Dön");
            System.out.println("Seçiminiz:");
            choice = inp.nextInt();
            inp.nextLine();
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
                    System.out.println("Yayınevi :");
                    String publisher = inp.nextLine();

                    break;
                case 0:
                    System.out.println("Ana menüye yönlendiriliyorsunuz...");
                    break;
                default:
                    System.out.println("Hatalı giriş!!");
                    break;
            }

        } while (choice != 0);

    }

    //6:kitapları formatla yazdıralım
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
    //7: Yeni kitap ekle
    @Override
    public void addProduct() {
        System.out.println("ISBN :");
        String isbn=inp.nextLine();
        boolean isExists=false;
        for (Book book:this.books){
            if (book.getIsbn().equals(isbn)){
                System.out.println("Bu kitap sistemde zaten kayitli, lutfen urun guncelleme yapiniz.");
                isExists=true;
                break;
            }
        }

        if (!isExists){
            System.out.println("Kitap adi:");
            String name=inp.nextLine();
            System.out.println("Yazar adi:");
            String  autor=inp.nextLine();
            System.out.println("Yayinevi:");
            String publisher=inp.nextLine();
            System.out.println("Birim fiyati:");
            String price=inp.nextLine();
            System.out.println("Stok :");
            int stock=inp.nextInt();
            inp.nextLine();
            Book newBook=new Book(name,price,stock,publisher,isbn);
            this.books.add(newBook);
        }
        listProduct();
    }
    //updateProduct(guncelleme)stok artirma/azaltma, birim fiyat:ODEV

    //8:Kullanicidan alinan id ile urununu bulacagiz ve listeden silelim

    @Override
    public void deleteProduct() {
        boolean isExists=true;  //isExists==> var mi()
        System.out.println("Kitap id: ");
        int id=inp.nextInt();
        for (Book book:this.books){
            if (book.getId()==id){
                isExists=true;
                this.books.remove(book);
                System.out.println("Urun silindi");
                break;
            }else {
                isExists=false;
            }
        }
        if (!isExists){
            System.out.println("Urun Bulunamadi.");
        }
    }
    //9:Kitaplari yayinevine gore filtreleme

    @Override
    public void filterProduct(String filter) {
//        this.books.stream().
//                filter(book -> book.getPublisher().equalsIgnoreCase(filter)).
//                forEach(book -> System.out.printf("%-2s | %-20s | %-15s | %-10s | %-4s | %-10s | %-3s\n",
//                        book.getId(), book.getName(), book.getAuthorName(), book.getPublisher(), book.getIsbn(), book.getPrice(), book.getStock()));
        int counter=0;

        for (Book book:this.books){
            if (book.getPublisher().equalsIgnoreCase(filter)){
                System.out.printf("%-2s | %-20s | %-15s | %-10s | %-4s | %-10s | %-3s\n",
                        book.getId(), book.getName(), book.getAuthorName(), book.getPublisher(), book.getIsbn(), book.getPrice(), book.getStock());
                counter++;
            }
        }
        if (counter==0){
            System.out.println("Urun bulunamadi");
        }
    }


}