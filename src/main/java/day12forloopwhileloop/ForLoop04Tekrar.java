package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop04Tekrar {

    public static void main(String[] args) {

     /*
        Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
        9 - 14 ==> 10  12  14
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic degerini giriniz");
        int baslangic = input.nextInt();

        System.out.println("Bitis degerini giriniz");
        int bitis= input.nextInt();

        if (baslangic>bitis){
            System.out.println("Baslangic bitisten buyuk olamaz");
        }else {

            for (int  i = baslangic;  bitis>=i ; i++) {

                if (i%2==0){
                    System.out.println(i + " ");
                }

            }
        }



    }
}
