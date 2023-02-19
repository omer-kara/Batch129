package day03scanner;

import java.util.Scanner;

public class Scanner01Tekrar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen yasinizi giriniz...");

        byte age = input.nextByte();
        System.out.println(age);
    }
}
