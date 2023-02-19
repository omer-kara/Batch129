package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {

/*
  -
*/
        Scanner input = new Scanner(System.in);

        System.out.println("Satir (Row) sayisini giriniz...");
        int row = input.nextInt();

        System.out.println("Sutun (column) sayisini giriniz...");
        int column = input.nextInt();

        for (int i = 1; i <=row; i++) {//satir sayisini verir

        for (int k =1 ; k<= column  ; k++){
            System.out.print("X ");
        }
            System.out.println();
        }
    }
}
