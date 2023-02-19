package Day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {


        //Example 1: String bir array olusturunuz, 6 tane eleman yerlestiriniz, character sayisi 5 den cok olan elemanlari siliniz.

        String colors [] = new String[6];
        colors[0]= "Red";
        colors[1]= "Orange";
        colors[2]= "Blau";
        colors[3]= "Yellow";
        colors[4]= "Green";
        colors[5]= "Brown";

        System.out.println(Arrays.toString(colors));

        //Logic: Yeni bir array olusturup, character sayisini 5 ve 5 ten kucuk olan
        // elemanlari Yeni array e transfer edecegiz. Boylelikle yeni array'de
        // charachter sayisi 5 den buyuk olan hicbir eleman olmayacak.

        //Soru: Hocam, array olusturmak icin iki sey belirlenmelidir;
//      1) Elemanlarin data type'ı
//      2) Yeni array'de kac tane eleman olacak

//Verilen array'de eleman sayisi 5 ve 5'den kucuk olan kac eleman var bulmaliyiz

        int counter=0;

        for (String w: colors){
            if(w.length()<=5){
                counter++;

            }

        }
        System.out.println(counter);


        //Yeni array olusturma
        String newColors[]  = new String[counter];


        //Character sayisi 5 ve 5 den kucuk olanlari yeni array e transfer et


        int idx = 0;
                            //[Red, Orange, Blau, Yellow, Green, Brown]
        for (String w : colors){

            if(w.length()<=5){
                newColors[idx] =w;
                idx++;


            }
        }
        System.out.println(Arrays.toString(newColors));//[Red, Blau, Green, Brown]

    }
}
