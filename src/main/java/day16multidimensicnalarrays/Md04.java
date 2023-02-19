package day16multidimensicnalarrays;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {



    //Ex 1: Bir multidimensional array olusturunuz ve bir diesionalli array donusturunuz
    //      [[2, 5], [4, 7, 11]] ==> [2, 5, 4, 7, 11]

    int a[][] = {{2, 5}, {4, 7, 11}};

    //"a" arrayindeki toplam eleman sayisini bulunuz
    int totalElement = 0;

    for (int[] w : a) {

        totalElement = totalElement + w.length;
    }
        //"b" isimli tek dimensional 'li bir array olusturunuz

        int b[] = new int[totalElement];
        System.out.println(Arrays.toString(b));//[0, 0, 0, 0, 0]

        //"a" array indeki elemanlarin "b" arrayine transfer ediniz.
        int idx =0;

        for (int [] w : a){

            for (int  k : w ){
                b[idx] = k;

                idx++;
            }

        }
        System.out.println(Arrays.toString(b));//[2, 5, 4, 7, 11]==> tek boyutlu array olusturduk



    }

}
