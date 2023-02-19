package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03Tekrar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();


        boolean first = pwd.length()>0;
        System.out.println(first);

        boolean second = !pwd.contains(" ");
        System.out.println(second);

        boolean triht = pwd.replaceAll("[^A-Z]", "").length()>0;
        System.out.println(triht);



    }
}
