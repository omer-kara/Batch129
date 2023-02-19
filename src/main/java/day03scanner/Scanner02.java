package day03scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        // Kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdiriniz.
        //next methodu Stringler icin kullanilir

        Scanner input = new Scanner(System.in);

        System.out.println("ilk isminizi giriniz...");

        //next() method kullanicidan String almak icin kullanilir. Tek kelimelik Stringler icin kullanilir.

        String firstName = input.next();

        System.out.println("Soy isminizi giriniz...");
        String lastName = input.next();

        System.out.println(firstName + " " + lastName);

    }
}
