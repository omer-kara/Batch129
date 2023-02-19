package day10switchloops;

import java.util.Scanner;

public class Switch02Tekrar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 2 sayi giriniz");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();

        System.out.println("Yapilacak islemlerden +,-,*,/, % birini seciniz");
        char opr =input.next().charAt(0);



        switch (opr){
            case '+':
                System.out.println("Sayi 1: " + sayi1 + " + " + "Sayi 2 : "+ sayi2 + " Sonuc = " + (sayi1+sayi2));
                break;
            case '-':
                System.out.println("Sayi 1: " + sayi1 + " - " + "Sayi 2 : "+ sayi2 + " Sonuc = " + (sayi1-sayi2));
                break;
            case '*':
                System.out.println("Sayi 1: " + sayi1 + " * " + "Sayi 2 : "+ sayi2 + " Sonuc = " + (sayi1*sayi2));
                break;
            case '/':
                System.out.println("Sayi 1: " + sayi1 + " / " + "Sayi 2 : "+ sayi2 + " Sonuc = " + (sayi1/sayi2));
                break;
            case '%':
                System.out.println("Sayi 1: " + sayi1 + " % " + "Sayi 2 : "+ sayi2 + " Sonuc = " + (sayi1%sayi2));
                break;
        }
    }
}
