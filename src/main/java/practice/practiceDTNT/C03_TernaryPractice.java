package practice.practiceDTNT;

import java.util.Scanner;

public class C03_TernaryPractice {

    public static void main(String[] args) {

        /*
TASK :
 Kullanicidan bir character girmesini isteyiniz
 Character harf ise kucuk harf olup olmadigini kontrol ediniz
 Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
 Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
 Harf degilse ekrana "Harf degil" yazdiriniz
 97:a  122:z ascii değeri
 */

    /*
    Ascii degerler verilmeseydi
    char a='a';
    System.out.println(a+0);
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz");
        char ch = input.next().charAt(0);

        System.out.println("********************TERNARY********************");

        boolean harfMi= (ch<'z' && ch>'a') || (ch<='Z' && ch>='A');
        boolean kucukHarf = (ch<='y' && ch<='a');

        String result = (harfMi) ? (kucukHarf ? "Kucuk Harf" : "Buyuk Harf")  :   "Harf degil"  ;

        System.out.println("result: " + result);





    }
}
