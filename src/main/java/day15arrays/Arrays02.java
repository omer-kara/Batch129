package day15arrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Ex 2: Bir stringteki sesli harflerin sayisini bulan kodu yaziniz.
        //      a-e-i-o-u-A-E-I-O-U

        String s="Java brings you money";
        //1.Yol : use replaceAll ()
        int vowels = s.replaceAll("[^aeiouAEIOU]","").length();

        System.out.println(vowels);

        //2. Yol: use Array - Loop
        
        //split methodu Array verir

        String letters[] = s.split("");
        System.out.println(Arrays.toString(letters));//[J, a, v, a,  , b, r, i, n, g, s,  , y, o, u,  , m, o, n, e, y]
        
        int counter = 0;//counter ==> sayac
        
        for (String w: letters){

            //switch ==> degistirmek
            //case ==> gözetlemek

            switch (w.toLowerCase()){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    
                    counter++;

            }
        }
        System.out.println("counter = " + counter);
    }
}
