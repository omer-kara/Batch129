package practice.Practice09;

import java.time.LocalTime;
import java.util.Scanner;

public class Q05_ZarSaniye {
    //İki zar atıp sonucunu atıldığı saniyeye göre 2 veya 5 ile çarpıp bilgisayarın puanıyla karşılaþtıran bir method yazınız.
    //Zarın atıldığı saniye 5'in katı ise zar sayısı 5 ile çarpılıp puana eklenecek, çiftse zar sayısı iki ile çarpılıp puana eklenecek,tekse zar sayısı puana eklenecek.
    public static void main(String[] args) {
        zarAt();

    }


    public static void zarAt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zar atmak icin 'Z' giriniz");
        String secim = scanner.next();

       int zarOyuncu = (int)(Math.random()*6)+1;
        System.out.println("zarOyuncu = " + zarOyuncu);
        int puanOyuncu =0;
        int saniyeOyuncu= LocalTime.now().getSecond();
        System.out.println("saniyeOyuncu = " + saniyeOyuncu);

        if (saniyeOyuncu%5==0){
            puanOyuncu+=zarOyuncu*5;

        } else if (saniyeOyuncu%2==0) {
            puanOyuncu+=zarOyuncu*2;
        }else {
            puanOyuncu+=zarOyuncu;
        }
        System.out.println("puanOyuncu = " + puanOyuncu);

        int zarBilgisayar = (int)(Math.random()*6)+1;
        System.out.println("===========");
        System.out.println("zarBilgisayar = " + zarBilgisayar);
        int puanBilgisayar =0;
        int saniyeBilgisayar= saniyeOyuncu+1;
        System.out.println("saniyeBilgisayar = " + saniyeBilgisayar);

        if (saniyeBilgisayar%5==0){
            puanBilgisayar+=zarBilgisayar*5;

        } else if (saniyeBilgisayar%2==0) {
            puanBilgisayar+=zarBilgisayar*2;
        }else {
            puanBilgisayar+=zarBilgisayar;
        }
        System.out.println("puanBilgisayar = " + puanBilgisayar);


    }



}

/*
package advanced_practice.practice09;

import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class Q05_ZarSaniye {
    //İki zar atıp sonucunu atıldığı saniyeye göre 2 veya 5 ile çarpıp bilgisayarın puanıyla karşılaştıran bir method yazınız.
    //Zarın atıldığı saniye 5'in katı ise zar sayısı 5 ile çarpılıp puana eklenecek, çiftse zar sayısı iki ile çarpılıp puana eklenecek,tekse zar sayısı puana eklenecek.

    public static void main(String[] args) {

        zarAt();
    }

    static int sayac = 0;
    static int puanOyuncu;
    static int puanBilgisayar;

    public static void zarAt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zar atmak için 'Z' giriniz");
        String secim = scanner.next();

        if (secim.equalsIgnoreCase("z")) {
            int zarOyuncu = (int) (Math.random() * 6) + 1;
            System.out.println("zarOyuncu = " + zarOyuncu);

            int saniyeOyuncu = LocalTime.now().getSecond();
            System.out.println("saniyeOyuncu = " + saniyeOyuncu);

            if (saniyeOyuncu % 5 == 0) {
                puanOyuncu += zarOyuncu * 5;
            } else if (saniyeOyuncu % 2 == 0) {
                puanOyuncu += zarOyuncu * 2;
            } else {
                puanOyuncu += zarOyuncu;
            }
            System.out.println("puanOyuncu = " + puanOyuncu);


            int zarBilgisayar = (int) (Math.random() * 6) + 1;
            System.out.println("==========");
            System.out.println("zarBilgisayar = " + zarBilgisayar);

            int saniyeBilgisayar = saniyeOyuncu + 1;
            System.out.println("saniyeBilgisayar = " + saniyeBilgisayar);

            if (saniyeBilgisayar % 5 == 0) {
                puanBilgisayar += zarBilgisayar * 5;
            } else if (saniyeBilgisayar % 2 == 0) {
                puanBilgisayar += zarBilgisayar * 2;
            } else {
                puanBilgisayar += zarBilgisayar;
            }
            System.out.println("puanBilgisayar = " + puanBilgisayar);

        } else {
            System.out.println("Geçersiz bir değer girdiniz");
            zarAt();
        }

        sayac++;

        if (sayac == 1) {
            zarAt();
        } else {

            if (puanBilgisayar < puanOyuncu) {
                System.out.println("Kazandız!! " + puanOyuncu + " <==> " + puanBilgisayar);
            } else if (puanBilgisayar > puanOyuncu) {
                System.out.println("Kaybettiniz!! " + puanOyuncu + " <==> " + puanBilgisayar);
            } else {
                System.out.println("Berabere!! " + puanOyuncu + " <==> " + puanBilgisayar);
            }


        }


    }

}
 */
