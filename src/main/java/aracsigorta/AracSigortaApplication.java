package aracsigorta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AracSigortaApplication {
    public static void main(String[] args) {
        /*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk
       Tarife dönemi:Aralık 2022,Haziran 2022
       1.dönemi                             2.dönem
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750
        Hatalı girişte hesaplama başarısız uyarsı verip tekrar menü gösterilsin.
 */
        start();

    }
    public static void start(){
        Scanner input = new Scanner(System.in);
        //hatali giriste veya yeni islem icin menu tekrar gosterilsin:while/ do while

        boolean isFail; //hesaplamanin durumunu kontrol etmek icin bir bayrak(flag) degeri tanimliyoruz

        do {
            isFail=false;   //baslangic degeri dogru girilirse loop kirilsin diyoruz
            System.out.println("-----Zorunlu Sigorta Primi Hesaplama-----");
            System.out.println("Tarife donemi seciniz:");
            System.out.println("1. Haziran 2022");
            System.out.println("2.Aralik 2022");
            int term =0;
            //exception handle etme
            try {
                input.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Gecersiz giris, lutfen sayi giriniz.");
            }
            input.nextLine();   //hatali giristen dolayi basa donderdik

            //Girilen donem gecerli mi?
            if (term==1 || term==2){
                Arac arac = new Arac();
                String ternName = term == 1 ? "Haziran 2022" : "Aralik 2022";
                System.out.println("Arac tipini giriniz:");
                System.out.println("otomobil, kamyon, otobüs, motosiklet");
                String select = input.next();   //kamyon
                arac.type=select;
                arac.countPrim(term);
                if (arac.prim>0){
                    //Sonuc yazdirma
                    System.out.println("Hesaplama basarili bir sekilde tamamlandi");
                    System.out.println("Arac tipi : " + arac.type);
                    System.out.println("Tarife donemi: " + ternName);
                    System.out.println("Aracinizin ilgili donem sigorta primi: "  + arac.prim);
                    isFail = isAgain(input);
                }else {
                    System.out.println("Hesabiniz basarisiz, Tekrar deneyiniz!!!");
                    isFail=isAgain(input);

                }


                //Sonuc yazdirma
                System.out.println("Hesaplama basarili bir sekilde tamamlandi");
                System.out.println("Arac tipi : " + arac.type);
                System.out.println("Tarife donemi: " + ternName);
                System.out.println("Aracinizin ilgili donem sigorta primi: "  + arac.prim);
                isFail = isAgain(input);

            }else {
                System.out.println("Hatali giris!!! Lutfen 1 veya 2 giriniz");
                isFail=true;    //yanilis giris yapilirsa tekrar geri donsun diyoruz
            }


        }while (isFail);

    }

    private static boolean isAgain(Scanner input) {
        boolean isFail;
        System.out.println("Yeni islem icin 1, cikis icin herhangi bir sayi giriniz:");

        int choice= input.nextInt();
        if (choice==1)
            isFail=true;
        else
            isFail=false;
        return isFail;
    }

}
