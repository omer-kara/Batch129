package day07ifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //example 2: Kullanicidan alinan bir sayinin tek mi, cift mi oldugunu yazdiran kodu olusturunuz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz...");
        int num = input.nextInt();

        //1.Yol:

        if(num%2==0){
            System.out.println("Cift Sayi ...");
        }
        if(num%2!=0){
            System.out.println("Tek Sayi...");
        }

        //2.Yol:"else" demek "veya"
        if (num%2==0){
            System.out.println("Cift Sayi ...");
        }else{
            System.out.println("Tek Sayi...");
        }

    }
}
