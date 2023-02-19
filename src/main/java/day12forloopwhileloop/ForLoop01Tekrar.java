package day12forloopwhileloop;

import src.School;

import java.util.Scanner;

public class ForLoop01Tekrar {
    public static void main(String[] args) {

        String a= "I love Java";

        for (int i = 0;  i<= a.length() ; i++) {

            if (a.charAt(i)=='a'){

                break;

            }
            System.out.print(a.charAt(i));
        }
        System.out.println();
        String s= "Germany";

        for (int i = s.length()-1;  i>=0 ; i--) {

            if (s.charAt(i)=='a'){
                break;

            }
            System.out.print(s.charAt(i));
        }

        System.out.println();
        String r = "Tranvay";

        for (int i = 0; r.length() >i ; i++) {

            if (r.charAt(i)=='a'){
                continue;



            }
            System.out.print(r.charAt(i));
        }
        System.out.println();
//        Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
//        X X X X X
//        X X X X X
//        X X X X X
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini yazdiriniz");
        int row =input.nextInt();
        System.out.println("Lutfen sutun sayisini yazdiriniz");
        int column =input.nextInt();


        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                System.out.print("X ");

            }
            System.out.println();
        }

    }
}
