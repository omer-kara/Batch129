package day12forloopwhileloop;

import java.util.Scanner;

public class ForLopp01T {
    public static void main(String[] args) {

        //        Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
//        X X X X X
//        X X X X X
//        X X X X X

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini belirtiniz");
        int satir = input.nextInt();

        System.out.println("Lutfen sutun sayisini belirtiniz");
        int sutun = input.nextInt();

        for (int i = 0; i <satir ; i++) {

            for (int j = 0; j <sutun; j++) {

                System.out.print("X ");

            }

            System.out.println();
        }
    }
}
