package day03scanner;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli
        //bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu giriniz

        Scanner input = new Scanner(System.in);

        System.out.println("5 basamakli bir sayi giriniz...");

        //bir sayinin sonn rakamini almak icin 10 a bolun kalan a bakin=
        // bir tamsayiyi bir tam sayiyi bolerseniz java sonucu kesilikle tam sayi yapar. Java sonucu nasil tam sayi yapar?
        //Ondalik kismi iptal eder. Java yuvarlama yapmaz.


        //son rakami al
        int number = input.nextInt();
        int lastDigit = number%10;

        System.out.println(lastDigit);


        //Sayiyi kucult
        number = number/10;
        System.out.println(number);
    }
}
