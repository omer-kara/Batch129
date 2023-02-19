package practice.practiceDTNT;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

/*
Kullanicidan bir gun alin, eger gun cuma ise "Muslumanlar icin Kutsal gun";
Eger gun Cumartesi ise "Yahudiler icin Kutasal gun"
Eger gun pazar ise "Hristiyanlar icin Kutsal Gun"

yazdiran kodu olusturunuz
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz...");
        String gun = input.next().toLowerCase();//Kucuk harfe cevirdik.(Cuma)

        if(gun.equals("cuma")){
            System.out.println("Muslumanlar icin Kutsal gun");
        }else if(gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin Kutsal gun");
        } else if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin Kutsal Gun");
            }else
                System.out.println("Kutsal gun degildir");//else geri kalan hersey (Sayi, yazi vb.)demek.

    }
}
