package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop02Tekrar {

    public static void main(String[] args) {
           /*
                Example 1: Asagidaki sekli cizen kodu yaziniz
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5

         */

        Scanner input = new Scanner(System.in);
        System.out.println(" lutfen satir sayisini yaziniz");
        int row =input.nextInt();
        System.out.println(" lutfen sutun sayisini yaziniz");
        int column =input.nextInt();


        for (int i = 1; i <row ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(j +" ");

            }
            System.out.println();
        }


    }

}
