package day05typecastingstringmanipulations;

import java.util.SortedMap;

public class SwapValues {

    public static void main(String[] args) {

        //Swap: Yer degistirmek. 1. Kap:Patates 2. Kap:Domates ==> 1.Kap:Domates 2.Kap:Patates

        int a = 12;
        int b = 5; //Swap'den sonra ==> a=5 ve b=12

        //temp: Gecici sezlere temp denir.
        int temp = 0;

        System.out.println("a: " + a);
        System.out.println("b:" + b);



        //i.Adim:
        temp = a;

        //ii.Adim:
        a = b;

        //iii.Adim:
        b = temp;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // 1. Adim
        temp = a; // a'daki degeri temp'e koyarak a'yi bosalttik.
        // 2. Adim
        a = b; // b'deki degeri, bosalan a'ya koyduk.
        // 3. Adim
        b = temp; // a'daki degeri temp'e koymustuk. Bu sefer de temp'teki a'nin ilk degerini b'ye aktardik.
        // Swap (yer degistirme) islemi bu adimlar sonunda tamamlandi.

        //2.Yol:

        int x = 12;
        int y = 5;

        x = x + y; //12 + 5 =17=x

        y = x - y; //17 - 5 =12=y

        x = x - y; //17 - 12 =5=x

        // 1. Adim
        temp = a; // a'daki degeri temp'e koyarak a'yi bosalttik.
// 2. Adim
        a = b; // b'deki degeri, bosalan a'ya koyduk.
// 3. Adim
        b = temp; // a'daki degeri temp'e koymustuk. Bu sefer de temp'teki a'nin ilk degerini b'ye aktardik.
// Swap (yer degistirme) islemi bu adimlar sonunda tamamlandi.
    }
}
