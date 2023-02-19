package day09incrimentdecrementternaryswitch;

public class NestedTernary01 {//Icice Ternary demek

    public static void main(String[] args) {

        /*
        Example 1: Verilen yilin "Artik yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
        1) yil 100'e bolunurse 400'e de bolunmelidir.==> 1600==> Leap  1800==> Leap degildir
        2) Yil 100'e bolunmuyorsa 4'e bolunmelidir.2004==>Leap    2005==>Leap degildir.

         */
        int year = 2010;
        String result = year%100==0 ? (year%400==0 ? "Leap" : "Not Leap") :  (year%4==0 ? "Leap" : "Not Leap");
        System.out.println(result);





    }
}
