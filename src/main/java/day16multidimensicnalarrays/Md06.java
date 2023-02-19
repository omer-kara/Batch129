package day16multidimensicnalarrays;

import java.util.Arrays;

public class Md06 {
    public static void main(String[] args) {

        //Ex 1: Bir multi dimensional array deki en buyuk ve en kucuk sayinin toplamini console yazdiriniz

        int a[][] = {{21, 5}, {14, 70, 11}};

        int small = a[0][0];//21
        int big = a[0][0];//70

        for (int [] w : a){

            Arrays.sort(w);
            System.out.println(w);

            for (int k :w){

                small = Math.min(small, k);
                big = Math.max(big, k);


            }

        }
        System.out.println(small + big);//75

    }
}
