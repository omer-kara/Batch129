package day12forloopwhileloop;

public class WhileLoop01Tekrar {
    public static void main(String[] args) {
        //Example 1: 3'den 10 kadar tam sayilari console yazdiriniz.

        //1.Yol:

        int i = 3;

        while (i<11 ) {
            System.out.println(i);


            i++;


        }

        int k = 23;

        while (k>11 ) {

            if (k%2 == 0)

                System.out.println(k);


                k--;
            }
    }
}

