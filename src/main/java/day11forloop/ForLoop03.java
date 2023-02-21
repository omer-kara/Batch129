package day11forloop;

public class ForLoop03 {
    public static void main(String[] args) {


//Ex 1= Size verilen bir String´i tersten yazdiriniz.
        //Util ==> kullanmak demek  (Sik kullananalar deposudur.)

        //Example 1: Size verilen bir String'i tersten yazdiriniz
//           "Java" ==> "avaJ"

        //İnterview sorusu:verilen bir stringin palindrome olup olmadıgını bulunuz:darts:

        String s ="Java";

        String t ="";

        for (int i =s.length()-1 ; i>=0 ; i-- ){
            t = t + s.charAt(i);

            System.out.println(t);
        }
        System.out.println(t);// biz yazdirma istendiginde parantez disinda yazdirilir.


        //Ex 2: Sizi verilen bir Stringin "palindrome"(Soldan saga veya sagdan sola okunan isme denir)
        // (civic, nalan, kucuk, 11211 )olup olmadigini kontrol eden kodo yaziniz


        //Logic (Mantik): Stringi ters cevir sonrada duz hali ile ters halini karsilastir, ayni ise "Palindrome" de.

            String duz ="civic";

            String ters ="";

            for( int i = duz.length()-1 ; i>=0 ; i--){
                ters = ters + duz.charAt(i);

            }

            if (duz.equals(ters)){
                System.out.println(duz + " Bu String palindrome dur");
            }else {
                System.out.println(duz + " Palindrome degildir");
            }







    }
}
