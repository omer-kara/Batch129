package day07ifstatements;

import java.util.Scanner;

public class IfStatement02Tekrar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num = input.nextInt();

        if(num%2==0) {
            System.out.println("Sayi cift...");
        }
        if (num%2!=0){
            System.out.println("Sayi Tek...");}

        if(num%2==0){
            System.out.println("Sayi cift...");
        }else if (num%2!=0){
            System.out.println("Sayi Tek...");
        }else {
            System.out.println("Sayi degildir...");
        }


    }
}
