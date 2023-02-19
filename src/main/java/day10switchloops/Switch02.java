package day10switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Example 1:Kullanicidan iki sayi ve yapilacak islemi alan ve +,-,*,/,% islemlerini yapan kodu yaziniz.

        double a = input.nextInt();
        double b = input.nextInt();

        System.out.println("Yapilacak islemi giriniz +,-,*,/,% dan birini seciniz");

        char opr = input.next().charAt(0);

        switch (opr){
            case '+':
                System.out.println(a + "+" + b + "=" + (a+b));
                break;
            case '-':
                System.out.println(a + "-" + b + "=" + (a-b));
                break;
            case '*':
                System.out.println(a + "*" + b + "=" + (a*b));
                break;
            case '/':
                System.out.println(a + "/" + b + "=" + (a/b));
                break;
            case '%':
                System.out.println(a + "%" + b + "=" + (a*b/100));
                break;
            default:
                System.out.println("Bu islem tanimlanmamistir...");


        }
    }
}
