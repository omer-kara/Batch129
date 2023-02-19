package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop03Tekrar {
    public static void main(String[] args) {
              /*
    Example 1: Asagidaki sekli cizdiren kodu yaziniz
                * * * *
                * * *
                * *
                *
 */

        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen satir sayisini yazdirin");
        int row =input.nextInt();

        System.out.println(" Lutfen sutun sayisini yazdirin");
        int column =input.nextInt();

        for (int i = 0; i < row; i++) {

            for (int j =column; j >i ; j--) {

                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
