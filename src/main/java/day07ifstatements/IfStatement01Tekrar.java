package day07ifstatements;

import java.util.Scanner;

public class IfStatement01Tekrar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz...");
        char ch= input.next().charAt(0);

        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");}
            if (ch>='a' && ch<='z'){
                System.out.println("Kucuk Harf...");}

        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");
        }else if (ch>='a' && ch<='z'){
            System.out.println("Kucuk Harf...");
        }else {
            System.out.println("Harf degil...");
        }
    }
}
