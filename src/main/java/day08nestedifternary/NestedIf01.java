package day08nestedifternary;

import java.util.Scanner;

public class NestedIf01 {

    /*
    Java "Nested If" leri calistiriirken cok zamana ihtiyac duyar.(Time Consuming)
    Bu yuzden, biz mumkun oldugu kadar "Nested If"
     */

    public static void main(String[] args) {

        /*

        Example 1: Kullanicidan 3 tane sayi aliniz.
          Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
          Eger ucgen ise "eskenar"
          Ucgen olma durumunu
          kontrol ediniz.
          INFO :
          Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                           herhangi iki "kenar" farki ucuncu kenardan (kucuk) olmali
           a+b>c>a-b
           a+c>b>a-c
           b+c>a>b-c
           a=b=c ise eskenar ucgen
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz...");

        //Kullanici yanlislila negatif sayi girdi ise kod asagidaki gibi yazilabilir.

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean ucgenmi = (a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));

        //Kullanicinin negatif sayi girmesini affetmiyorsaniz.

        //Math.abs Mutlak deger almak icin kullanilir.
        // Kelimeyi seciniz ve sift tirnak, parantez vb. yapilabilir
        // || or(veya) demek
        // && (ve) kesin dogru olamk zorunda olmak zorunda

        if(a<=0 || b<=0 || c<=0){
            System.out.println("Ucgenin kenarlari negatif olamaz...");

            //Parantez iclerine cok kod yazilmaz.

        }else if(ucgenmi){
            if (a==b && b==c && a==c){
                System.out.println("Ucgen hem eskenar ucgen...");


                }else{
                System.out.println("Ucgen ama eskenar degil");
            }
            System.out.println("Sen ucgensin...");
        }else {
            System.out.println("Sen ucgen degilsin...");
        }
    }
}
