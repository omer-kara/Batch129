package practice.practice02;

import java.util.Scanner;

public class C01_NestedLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfenagacin tac uzunlugunu yaziniz...");

        int tac = input.nextInt();

        String yaprak = "^";

        for (int i=0 ; i<tac ; i++){//Satir kontrolu yaptim
            yaprak+= "^";
            System.out.println(yaprak);

        }

        for (int i=0 ; i<5 ; i++){
            System.out.println("|||");

        }

    }



}
