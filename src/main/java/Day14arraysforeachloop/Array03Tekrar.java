package Day14arraysforeachloop;

import java.util.Arrays;

public class Array03Tekrar {
    public static void main(String[] args) {

        //Example 1: String bir array olusturunuz, 6 tane eleman yerlestiriniz,
        // character sayisi 5 den cok olan elemanlari siliniz.

        String brr[] = new String[6];

        brr[0]= "Miami";
        brr[1]= "Istanbul";
        brr[2]= "Frankfurt";
        brr[3]= "Dhaka";
        brr[4]= "Athena";
        brr[5]="berlin";

        int counter =0;

        for (String w:brr){
            if (w.length()<=5){
                counter++;

            }


        }
        System.out.println((counter));

        int idx =0;
String newCounter[] = new String[counter];

        for (String w:brr){

            if (w.length()<=5){

                newCounter[idx]=w;
                idx++;

            }

        }System.out.println(Arrays.toString(newCounter));
    }
}
