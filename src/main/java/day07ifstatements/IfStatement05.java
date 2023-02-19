package day07ifstatements;

import java.util.Scanner;

public class IfStatement05 {

    public static void main(String[] args) {

        //Example 1:Ay isimlerini girilince kacinci ay oldugunu yazan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir ay ismi giriniz...");
        String monthName = input.next();

        //"==" esiitir yerine Stringlerde "equals" yazilir.
        // buyuk harf kucuk harf onemli degilse equalsIgnareCase yazilmalidir

        if(monthName.equalsIgnoreCase("January")){
            System.out.println(1);
        }else if(monthName.equalsIgnoreCase("February")) {
            System.out.println(2);
        }else if(monthName.equalsIgnoreCase("March")) {
            System.out.println(3);
        }else if(monthName.equalsIgnoreCase("April")) {
        System.out.println(4);
        }else if(monthName.equalsIgnoreCase("May")) {
            System.out.println(5);
        }else if(monthName.equalsIgnoreCase("June")) {
            System.out.println(6);
        }else if(monthName.equalsIgnoreCase("July"))
        {   System.out.println(7);
        }else if(monthName.equalsIgnoreCase("August")) {
            System.out.println(8);
        }else if(monthName.equalsIgnoreCase("September")) {
            System.out.println(9);
        }else if(monthName.equalsIgnoreCase("October")) {
            System.out.println(10);
        }else if(monthName.equalsIgnoreCase("November")) {
            System.out.println(11);
        }else if(monthName.equalsIgnoreCase("December")) {
            System.out.println(12);
        }else {
            System.out.println(13);
        }

        /*
        Note : String lerin esitliklerini kontrol ederken "==" yerine "equals()" kullaniriz.
            Niye!
         Stack (Small) memoryde;
         i) Primitive Datalar depolanir.
         II) Non-Primitivelerin adresileri depolanir.(Reference)

         Heap(Huge) Momory den Non Primitivler depolanir.

         NOte:
         1)s==t
         i)Adressleri karsilastir==>farkli
         ii)Degerleri karsilastirir==>farkli

         2)s.equels(t)==> i)Deger==> farkli

         Cunku:"==" sembolu iki Stringi karsilastirirken hem adres'lerine hemde degerlerine bakar,
         ikisi de ayni ise siz String ler esittir der ama biz code yazarken genellikle Stringlerin
         adresleri ile degil degerler ile ilgileniriz.Bu yuzden String karsilastirmalarinda "==" kullanmayiz.

        "equals()" metho'u ise iki String'i karsilastirirken sadece degerlerine bakar, degerler ayni ise
        bu iki String esittir der degerler farkli ise bu iki String farklidir der ki bu bizim kod yazarken
        ihtiyac duydugumuz seydir.

         */

        String s ="Tom";
        String t = "Terry";
        String r = new String("Tom");
        String m = "Tom";

        System.out.println(s==t);//false cunku; adresler ve degerler farkli

        System.out.println(s.equals(t));//false cunku; degerler farkli

        System.out.println(s==r);//false cunku adresler farkli

        System.out.println(s.equals(r));//true cunku equals() method degerlere bakar. "s" ve "r" nin degerleri ayni oldugundan true verir

        System.out.println(s==m);

        System.out.println(s.equals(m));


    }
}
