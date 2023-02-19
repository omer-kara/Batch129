package advenced_practice.practice01;

import java.util.Arrays;

public class Q05_ForEach_Eurodolar {
    /*
   Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarını bulan bir kod yazınız.
   Örnek:
    String str ="$1 $12 €34 €56 $45 €78";
     dolarToplami: 58
     euroToplami: 168
    */
    public static void main(String[] args) {

        String str ="$1 $12 €34 €56 $45 €78";

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));//[$1, $12, €34, €56, $45, €78]


        //Eger $ isareti iceriyorsa int dolara ekledemek
        int dolarToplam =0;
        int euroToplam =0;

        for (String w:arr){

            //contains "$" isaretin disindakileri
            if(w.contains("$")){

                //dolarToplam +  ==> dolarToplamini ekle demek
                //String bir karakteri "parselInt" sayisal bir degere ceviriyor
                //"\\D" sayi disindakileri degirtir demek.

                dolarToplam +=Integer.parseInt(w.replaceAll("\\$", ""));

            }else {
                euroToplam +=Integer.parseInt(w.replaceAll("€", ""));
            }

        }
        System.out.println("dolarToplam = " + dolarToplam);
        System.out.println("euroToplam = " + euroToplam);
    }
}
