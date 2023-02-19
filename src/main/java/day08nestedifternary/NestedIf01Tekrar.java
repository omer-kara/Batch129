package day08nestedifternary;

import java.util.Scanner;

public class NestedIf01Tekrar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin henar uzunluklari icin 3 tane uzunluk giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean ucgenmi = (a + b > c && c > Math.abs(a - b)) && (a + c > b && b > Math.abs(a - c)) && (a + c > b && b > Math.abs(a - c));

        //Kullanicidan negatif sayi girmesini affetmiyorsaniz.

        if (a <= 0 || b <= 0 || c <= 0) {

            System.out.println("Ucgenin kenarlari negatif olamaz");

        } else if (ucgenmi) {

            if (a == b && b == c && a == c) {
                System.out.println("Ucgen hem de eskenar ucgen...");
            } else {
                System.out.println("Ucgen ama eskenar degil...");
            }

        } else {
            System.out.println("Sen ucgen degilsin...");


        }
    }
}