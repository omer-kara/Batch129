package day16multidimensicnalarrays;

public class Star {
    public static void main(String[] args) {

        /*Asagidaki sekli cizen kodu yaziniz.
             *
            *  *
           *    *
          *      *
         *  *  *  *

         */

        int row = 5;//row = satir

        for (int i = 1; i <= row; i++) {

            for (int k = i; k < row; i++) {
                System.out.print(" ");//burada bosluk satiri yazdirdik
            }

            for (int m = 1; m <= 2 * i - 1; m++) {
                if (m == row || m == 1 || m == 2 * i - 1) {
                    System.out.print("*");

                } else {
                    System.out.println(" ");

                }


                System.out.println();

            }

        }
    }
}
