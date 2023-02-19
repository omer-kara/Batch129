package Day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        //Note: sort() method u sayisal data type larini kucukten büyüge olarak siralar(ascendig order)
        //Note: sort() method u String data type larini alfabetik olarak  siralar(alphabetical order)
        //Note: ascending order order + alphabetical order ==> Natural Order
        // 4: sort ()= methodu array elemanlarini "Natural Order" a gore siralar.

        //Note 5:binarySearch () method'u bir elemanin bir array de olup olmadigini kontrol etmek icin kullanilir.
        //       binarySearch () method'unu kullanmadan once "sort()" method'unu kullanmak zorundayiz.
        //      Sort () methodunu kullanmazsaniz buldugunuz sonuc guvenilir olmaz.

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));

        int num1 = Arrays.binarySearch(colors,"Blue");
        System.out.println(num1);//0 ==> Var hemde indexi sifir.

        int num2 = Arrays.binarySearch(colors,"Oronge");
        System.out.println(num2);//33==> Var hem de index i 3 demek.

        int num3 = Arrays.binarySearch(colors,"Tarik");
        System.out.println(num3);// -6==> "-bende"eksi gormek = bu elaman yok demek.
                                //  "6"  ise olsaydi 6. eleman olurdu demektir.


    }
}
