package day05typecastingstringmanipulations;

import java.util.SortedMap;

public class StringManipulations02 {

    public static void main(String[] args) {

        String s ="Learn Java earn money";

        //Example 1: "s" Stringinin money ile bitip bitmedigini kontrol ediniz.
        //Space bir karekterdir.
        //"" arada bosluk yoksa hictir.
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);//true

        //Example 2: "s" Stringindeki money kelimesini dollar kelimesine ceviriniz.
        //replace : yerine koy demek
        String s1 = s.replace("money", "dollar");
        System.out.println(s1);

        //Example 2: "s" Stringindeki "earn" kelimesini "win" kelimesine ceviriniz.
        String s2 = s.replace("earn", "win");
        System.out.println(s2);//Lwin Java win money

        //Example 2: "s" Stringindeki "a" kelimesini "*" kelimesine ceviriniz.
        String s3 = s.replace("a", "*");
        System.out.println(s3);//Le*rn J*v* e*rn money

        //Example 3: "s" String`indeki "earn" kelimesini "win" kelimesine ceviriniz.
        String s4 = s.replace("earn","win" );
        System.out.println(s4);//Lwin Java win money

        //Example 4: "s" String`indeki "a" harflerini "*" 'a ceviriniz.
        //Note: replace() method'unda coklu character ile calisirsaniz mecbur cift tirnak kullacaksiniz
        //      Ama tek character ile calisirsaniz cift tirnak veya tek tirnak kullanabilirsiniz.
        String s5 = s.replace('a','*');
        System.out.println(s5);//Le*rn J*v* e*rn money

        //Note: Ama ya ikiside cift tirnak olmalidir, ya da ikiside tek tirnak olmalidir.
        //Example 5: "s" String`indeki "n" harflerini "XXX" 'a ceviriniz.
        String s6 = s.replace("n", "XXX");
        System.out.println(s6);//LearXXX Java earXXX moXXXey

        //Example 6: "s" String`indeki tum "e" harflerini siliniz.
        String s7 = s.replace("e", "");
        System.out.println(s7);

        String t = "Ali 13 yasindadir!...";

        //Example 7: "t" String`indeki tum rakamlari (0,1,2,3,4,5,6,7,8,9) "*" a ceviriniz.
        //Note: Bir grup data'yı değiştirmek için replaceAll() kullanılır
        //[] tum araligi secmek icin kullanilir.
        //Bir grup data yi ifade etmek icin "Regular Expressions" (Regex) kullaniliriz.
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);

        /*
                    Meşhur Regex'ler (Regular Expressions)
        1)Tüm rakamlar ==> [0-9]
        2)Tüm küçük harfler ==> [a-z]
        3)Tüm Büyük harfler ==> [A-Z]
        4)Tüm küçük harfler ve büyük harfler  ==> [a-zA-Z]
        5)Tüm harfler ve rakamlar ==> [a-zA-Z0-9]
        6)Tum noktalama isaretleri ==> \\p{Punct}
        7)Tum sesli harfler ==> [aeiouAEIOU]
        x, q, w harfleri ==> [xqw]
        8)Kucuk harflerden farkli tum characterler ==> [^a-z] (-den farkli demek)
        9)Tum harflerden farkli tum characterler ==> [^a-zA-Z]

         */


        //Example 8: "t" String`indeki tum rakamlari ve harfleri  "!" a ceviriniz.
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);

        //Example 9: "t" String`indeki tum sesli harfleri  "?" a ceviriniz.
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);

        //Example 10: "t" String`indeki kucuk harfler disindaki tum characterleri   "<>" a ceviriniz.
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);

        //Example 11: "t" String'indeki tüm harfler dışındaki tüm karakterleri "+" çeviriniz
        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);//Ali++++yasindadir++++

        //Example 12: "t" Stringindeki space'ler disindaki tum characterleri "+" e ceviriniz.
        String t6 = t.replaceAll("[^ ]", "+");
        System.out.println(t6);//+++ ++ ++++++++++++++

        //Example 13: "t" Stringindeki sesli harfler disindaki tum characterleri "&" e ceviriniz.
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);//A&i&&&&&a&i&&a&i&&&&&








    }
}
