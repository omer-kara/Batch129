package day16multidimensicnalarrays;//coklu boyutlu dizi

import java.util.Arrays;

public class Md01 {

    public static void main(String[] args) {

        //MultiDimensional Array nasil olusturulur
        int a [][] = new int[3][2];

        //MultiDimensional Array nasil yazdirilir?
        System.out.println(Arrays.deepToString(a));//[[0, 0], [0, 0], [0, 0]] defolt degerler icinde bir sey yoksa

        //MultiDimensional Array lere eleman nasil eklenir?
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        //Note :Arraylere non -primitive data konulamaz
        //      Arraylere primitive data veya reference konuluru.
        //      Ama siz bir arrayi yazdirmak istadiginizde Java adresler yardimi ile non-primitive dataya ulasir.
        //      ve o non-primitive data yi icindeymis gibi gosteriri.

        //MultiDimensional Array lerdeki belli elemanlara nasil ulasilir?
        System.out.println(Arrays.toString(a[2]));//[123, 0]
        System.out.println(a[1][0]);//81

        System.out.println(Arrays.toString(a[0]));//[5, 12]
        System.out.println(a[2][1]);//0


    }
}
