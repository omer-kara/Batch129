package miniproje.minibokkstore;

import java.util.Scanner;

public class MiniBookStore {
   /* Proje: Mini Book Store
    Online bir kitap market için ürün yönetim uygulaması yapınız.
    Kitap markette kitap ve defter satışı olacak, ancak ileride yeni ürün çeşidi eklenebilir olmalı.

    Kitap özellikleri: id, isim, birim fiyat, stok, yazar adı, yayınevi,isbn no
    Defter özellikleri: id, isim, birim fiyat, stok, marka, yaprak sayısı,ürün kodu

    Kullanıcı ilgili kategorideki ürünleri listeleyebilmeli
    Kullanıcı kategoriye göre ürün ekleyebilmeli,ürün mevcutsa uyarı verilmeli
    Kullanıcı ürünleri benzersiz numaralarına göre silebilmeli.
    Kullanıcı ürünleri marka(kitap) veya yayınevine göre filtreleyip listeleyebilmeli.

    NotebookService:Odev
    update
            */

    public static void main(String[] args) {
        enter();
    }
    //1-product, book, notebook,
    public static void enter(){
        Scanner inp  =new Scanner(System.in);
        int select;
        System.out.println("-----------Mini Book Store-----------------");
        do {
            System.out.println("Urun Yonetim Paneli");
            System.out.println("1-Kitaplar");
            System.out.println("2-Defterler");
            System.out.println("2-Defterler");
            System.out.println("0-CIKIS");
            System.out.println("Seciminiz");
            select=inp.nextInt();
            inp.nextLine();
            ProductService service;
            switch (select){
                case 1:
                    service=new BookService();
                    service.processMenu();
                    break;
                case 2:
                    service=new NoteBookService();
                    service.processMenu();
                    break;
                case 0:
                    System.out.println("Iyi gunler");
                    break;
                default:
                    System.out.println("Hatali giris");
            }

        }while (select!=0);

    }
}
