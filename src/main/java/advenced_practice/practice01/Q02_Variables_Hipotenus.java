package advenced_practice.practice01;

import java.util.Scanner;

public class Q02_Variables_Hipotenus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1. dik kenar uzunlugunu giriniz");
        double a = input.nextDouble();
        System.out.println("2. dik kenar uzunlugunu giriniz");
        double b = input.nextDouble();


        //Math.sqrt ==> Karekok alan Method
        double c =Math.sqrt(a*a+b*b);

        System.out.println("Hipotenus :" + c);
        System.out.printf("Hi : " + c);


    }
}
