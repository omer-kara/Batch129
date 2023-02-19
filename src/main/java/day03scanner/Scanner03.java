package day03scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Kullanicidan adresini aliniz ve ekrana yazdiriniz?

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz...");

        //nextline() methodu kullanicidan cok kelimeli String almak icin kullanilir. Kullanicinin girdigi tum satiri alir.
        String address = input.nextLine();

        System.out.println(address);

        Scanner intup = new Scanner(System.in);

        System.out.println("Ilk isminiyi giriniz...");
        String firstName = input.next();

        System.out.println("Soy isminizi giriniz...");
        String lastName = input.next();

        System.out.println(firstName + " " + lastName);




    }
}
