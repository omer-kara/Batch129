package practice.practiceDTNT;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        /*
        Kullanicidan sifirdan buyuk pozitif bir tam sayi girmesini isteyin
        Girilen pozitif tam sayi 3 basamakli ise ekrana "3 basamakli" yaziniz
        3 basamakli degilse cift olup olmadigini kontrol edin
        Cift ise "3 basamakli olmayan cift sayi" yazdirin
        Cift degilse "3 basamakli olmayan tek sayi" yazdirin
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz: ");

        int sayi = input.nextInt();//.nextInt()==> method demek

        System.out.println("******** if ile cozumu**********");


            boolean sifirdanBuyukUcBas = sayi > 99 && sayi < 1000;
            boolean sifirdanBuyukUcBasOlmayanCift = !(sayi > 99 && sayi < 1000) && sayi % 2 == 0;
            if (sayi > 0) {

            if (sifirdanBuyukUcBas) {
                System.out.println("3 basamakli sayi ");

            } else if (sifirdanBuyukUcBasOlmayanCift) {
                System.out.println("3 basamakli olmayan 965 cift sayi");

            } else {
                System.out.println("3 basamakli olmayan pozitif tek sayi!");
                //negatif sayilar icin burasi calisir.
            }


        }
    }
}
