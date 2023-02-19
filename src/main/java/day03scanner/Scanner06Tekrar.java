package day03scanner;

import java.util.Scanner;

public class Scanner06Tekrar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("5 basamakli bir sayi giriniz...");

       int number = input.nextInt();

       //son rakami al
       int lastDigit = number%10;
        System.out.println(number);

        //sayiyi kucult
        number = number/10;
        System.out.println(number);

        //sondan ikinci rakami al
        int lastSecondDigit = number%10;
        number = number/10;

        //Sondan ucuncu rakami al
        int lasThirDigit = number%10;
        number = number/10;

        //Sondan dorduncu rakami al
        int lastFoirhtDigit = number/10;

        //Sondan besinci rakami al
        int lastFifthDigit = number%10;


        System.out.println(lastDigit + lastSecondDigit + lastFoirhtDigit + lastFifthDigit);








    }
}
