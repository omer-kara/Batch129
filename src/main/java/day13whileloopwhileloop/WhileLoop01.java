package day13whileloopwhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {

        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        //      3==> 3x1=3  3x2=6 .........3x10=30

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz....");
        int num =input.nextInt();

        int i= 1;

        while (i<num){


                System.out.println(num + "x" + i + "=" + (num*i) );


                i++;

        }

        //Ex 2: Verilen bir Stringte her harfin sonrasina * sembolunu ekleyiniz.
        //      Java==> J*a*v*a

        System.out.println("Bir kelime giriniz");
        String word = input.next();

        int k=0;
        String newWord ="";

        while (k<word.length()){

           newWord = newWord + word.charAt(k) + "*";

            k++;

        }
        System.out.println(newWord);

    }
}
