package day10switchloops;

import java.util.Scanner;

public class Switch03Tekrar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ulke adini giriniz");

        String isim = input.nextLine();

        switch (isim.toLowerCase()){
            case "america":
                System.out.println("US");
                break;
            case "englan":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("US");
                break;
            case "spain":
                System.out.println("SP");
                break;
            case "bulgaria":
                System.out.println("BG");
            default:
                System.out.println("Lutfen gecerli bir ulka adi giriniz");
        }
    }
}
