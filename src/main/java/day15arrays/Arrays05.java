package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {
    public static void main(String[] args) {


        //Ex 1: String Array elemanlarini uzunluklarina gore kucukten buyuge suralayiniz
        //      ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Tom","Ajda", "Thomas","Michael"]

        String arr[] = {"Michael", "Ajda", "Thomas", "Tom"};
        System.out.println(Arrays.toString(arr));

        // "::" ==> Method Reference==> Stringteki length metodunu kullan demek.
        Arrays.sort(arr, Comparator.comparingInt(String::length));//Comparator==> karsilastir demek

        System.out.println(Arrays.toString(arr));

        //Ex 2: String Array elemanlarii character sayisina gore buyukten kucuge siralayiniz.
        //   ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Michael", "Thomas", "Cuneyt", "Ajda", "Tom"]

        String brr[] = {"Michael", "Ajda", "Thomas", "Tom", "Cuneyt"};
        System.out.println(Arrays.toString(brr));//[Michael, Ajda, Thomas, Tom, Cuneyt]

        //reversed==> tersine cevir demek
        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));//[Michael, Thomas, Cuneyt, Ajda, Tom]

        //Ex 2: String Array elemanlarii character sayisina gore buyukten kucuge siralayiniz.
        //  Ayni character sayisinda olanlarida alfebetik siraya koyunuz.
        //   ["Michael", "Ajda", "Gabriel", "Reyhane" "Thomas", "Tom", "Ali", "Cin", "Cem"] ==>
        //   ["Michael", "Thomas", "Cuneyt", "Ajda", "Tom"]

        String crr[] = {"Michael", "Ajda", "Gabriel", "Reyhane", "Thomas", "Tom", "Ali", "Cin", "Cem"};
        System.out.println(Arrays.toString(crr));

        //thenComparating ==> ictekileri siraya gore diz demek.
        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));

    }
}
