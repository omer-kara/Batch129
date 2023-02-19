package orneksorular;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String[] args) {

         /* TASK:
         tas >makas
         makas >kagit
         kagit >tas
    Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.

    Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.

    While dongumuzun icerisinde kullanicidan aldigimiz secimi "secim" isimli degiskene atiyoruz.

    Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.

    Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.

    Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.

    En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa

    dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.*/

        Scanner input = new Scanner(System.in);


        System.out.println("Ilk 3 yapan kazanir!");
        System.out.println("Lutfen birini seciniz\n Tas\n Kagit\n Makas");

        int kullaniciPuan = 0;
        int bilgisayarPuan = 0;

        while (true) {

            int bilgisayarinSecimi = (int) (Math.random() * 3);
            String bilgisayarinSecimiString="";
            String kullanininSecimi = input.next().toLowerCase().trim();
            if (kullaniciPuan==3 || bilgisayarPuan==3){
                System.out.println("Oyun bitti");

                break;
            }

            if (bilgisayarinSecimi == 0) {
                bilgisayarinSecimiString = "tas";
            } else if (bilgisayarinSecimi == 1) {
                bilgisayarinSecimiString = "makas";
            } else {
                bilgisayarinSecimiString = "kagit";
            }

            if (kullanininSecimi.equals("tas") && bilgisayarinSecimiString.equals("makas")) {
                System.out.println("Kullanici kazandi");
                kullaniciPuan++;
            } else if (kullanininSecimi.equals("tas") && bilgisayarinSecimiString.equals("kagit")) {
                System.out.println("bilgisayar kazandi");
                bilgisayarPuan++;
            } else if (kullanininSecimi.equals ("kagit") &&bilgisayarinSecimiString.equals("tas")) {
                System.out.println("kullanici kazandi");
                kullaniciPuan++;

            } else if (kullanininSecimi.equals("kagit") && bilgisayarinSecimiString.equals("makas")) {
                System.out.println("bilgisayar Kazandi");
                bilgisayarPuan++;

            } else if (kullanininSecimi.equals("makas") && bilgisayarinSecimiString.equals("tas")) {
                System.out.println("bilgisayar kazandi");
                bilgisayarPuan++;

            } else if (kullanininSecimi.equals("makas")&& bilgisayarinSecimiString.equals("kagit")) {
                System.out.println("kullanici kazandi");
                kullaniciPuan++;

            }else {;

                System.out.println("beraberlik");

            }
            System.out.println("kullaniciPuan :" + kullaniciPuan + " bilgisayarPuan :" + bilgisayarPuan);
        }
    }
}
