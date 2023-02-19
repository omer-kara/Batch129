package day13whileloopwhileloop;

import java.util.Scanner;

public class WhileLoop01Tekrar {

    public static void main(String[] args) {
        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        //      3==> 3x1=3  3x2=6 .........3x10=30
//
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = input.nextInt();

        for (int i = 1; sayi >=i ; i++) {

            int t =(i *3);
            System.out.print(t + " ");

        }
        System.out.println();
        int i = 1;



        while(sayi>=i){

            ;
        System.out.print(sayi*i);

        i++;}
        //Ex 2: Verilen bir Stringte her harfin sonrasina * sembolunu ekleyiniz.
        //      Java==> J*a*v*a

        System.out.println("Bir kelime giriniz");
        String word = input.next();

        int k=0;
        String m="";

        while (k<word.length()){

            m=m+word.charAt(k)+"*";
            k++;
        }


        System.out.println(m);

        }

    }

