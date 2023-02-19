package practice.practiceDTNT;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {

        System.out.println("******** if ile cozumu**********");
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz: ");

        int sayi = input.nextInt();

        boolean sifirdanBuyukUcBasTer = sayi > 99 && sayi < 1000;
        boolean sifirdanBuyukUcBasOlmayanCiftTer = !(sayi > 99 && sayi < 1000) && sayi % 2 == 0;

        //sart ?   Treu Action   :    False Action


        String sonuc = sayi>0 ? sifirdanBuyukUcBasTer ? ("3 basamakli sayi"): sifirdanBuyukUcBasOlmayanCiftTer ?
                ("3 basamakli olmayan cift sayi") : ("3 basamakli olmayan tek sayi") :
                ("Lutfen pozitif bir tam sayi giriniz");
        System.out.println(sonuc);}



        }



