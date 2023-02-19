package day08nestedifternary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        //Example 1: Kullanicidan iki sayi aliniz "buyuk olmayan" (kucuk veya esit olan ) sayiyi yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Iki sayi giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();

        if(a<b) {
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        //2.Yol: Ternary(Uclu)  (?) soru isareti sonra 1 bolum : b;

        //              Condition(Kural) ?  Kural true ise calisir      :     Kural false ise calisir
        double result =    a<b           ?              a              :                b;
        System.out.println(result);





    }
}
