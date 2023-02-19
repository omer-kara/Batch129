package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        /*
        Example 1:Asagidaki kurallara gore kullanicinin girdigi password'u konrol ediniz.
        i) En az 8 character olsun,
        ii) Space kcharactreri olmasin
        iii) En az bir tane buyuk harf osun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane sembol olsun
        vi)En az bir tane rakam olsun

        Sifre Ac123?Sd kullandik

        ^ ==> -den farkli demek!

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        //i) En az 8 character olsun,
        boolean first = pwd.length()>7;
        System.out.println(first);

        //ii) Space kcharactreri olmasin
        //Space charecteri icermesin "!" kullanilir.
        boolean second = !pwd.contains(" ");
        System.out.println(second);

        //iii) En az bir tane buyuk harf olsun
        //NOte: Buyuk harf olmayanlari sil,  kalan karakter sayisina bak# character sayisi 0 ise buyuk harf yok demektir.
        // 0 dan buyukse buyuk harf var demektir.
        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;// Method lari ayni satirda yanyana kulanmaya method "method chain" denir.


        //iv)En az bir tane kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println(fourth);

        //v)En az bir tane sembol(harf ve rakamlar haric her sey) olsun
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]", "").length()>0;
        System.out.println(fifth);

        //vi)En az bir tane rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println(sixth);

        System.out.println("Password gecerli mi?" + (first && second && third && fourth && fifth && sixth));


    }
}
