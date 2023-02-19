package day13whileloopwhileloop;

import java.util.Scanner;

public class DoWhileLoop02Tekrar {
    public static void main(String[] args) {

                /*

        Kullanicidan bir tam sayi aliniz
        Tam sayi 100 den kucuk ise kullaniciya "Kaybettiniz" mesaji verrek oyunu sonlandiriniz.
        Tam sayi 100 den buyuk ise kullaniciya "Kazandiniz" mesaji verrek oyunu devam ettiriniz.
        */

        //scoop ==> kapsam demek

        Scanner input = new Scanner(System.in);
        int num=0;



        do {
            System.out.println("Lutfen bir sayi giriniz");
            num = input.nextInt();

            if (num >= 100) {
                System.out.println("Kazandiniz");
            }

            }while (num >= 100);
                System.out.println("Kaybettiniz");
        }




}
