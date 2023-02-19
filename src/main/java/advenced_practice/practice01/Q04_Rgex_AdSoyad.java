package advenced_practice.practice01;

import java.util.Scanner;

public class Q04_Rgex_AdSoyad {
    /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:"ali can"
       Ad: Ali
       Soyad: Can
       */
    public static void main(String[] args) {

        //split medtahodu String bir yapiyi bir cumleyi parcalamak icin kullaniriz
        // "\\s" bir bosluk "\\s+" bir veya birden fazla bosluk anlamina gelir.

        Scanner input = new Scanner(System.in);
        System.out.println("Ad ve soyadinizi aralarinda bir bosluk olacak sekilde giriniz");
        String adSoyad = input.nextLine().replaceAll("[^a-zA-Z]"," ").
                replaceAll("\\s+", " ").trim() .toLowerCase();
        System.out.println("adSoyad =" + adSoyad);

        //split bolmek demek.
        String ad = adSoyad.split(" ")[0];
        String soyad = adSoyad.split(" ")[1];

        //substring ==> alt dizi demek[0,1] 0 ile 1 karakteri arasinda ki harfi degistir demek icin kullananbilir.
        
        String adIlkHarf = ad.substring(0,1).toUpperCase();
        String soyadIlkHarf = soyad.substring(0,1).toUpperCase();

        System.out.println("adIlkHarf = " + adIlkHarf);
        System.out.println("soyadIlkHarf = " + soyadIlkHarf);

        String adFormatli = adIlkHarf + ad.substring(1);
        String soyadFormatli = soyadIlkHarf + soyad.substring(1);

        System.out.println("adFormatli = " + adFormatli);
        System.out.println("soyadFormatli = " + soyadFormatli);


    }
}
