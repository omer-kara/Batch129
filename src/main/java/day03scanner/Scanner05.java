package day03scanner;

import java.util.Scanner;

public class Scanner05 {


    public static void main(String[] args) {

        // Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //1) alanini hesaplayiniz (Kisa kenar * Uzun kenar
        //2)Cevresini hesaplayiniz 2*Kisa kenar + 2*Uzun kenar

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz...");
        float shortSide = input.nextFloat();

        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz...");
        float longSide = input.nextFloat();

        System.out.println("Alan " + (shortSide * longSide));

        System.out.println("Cevre " + (2*shortSide + 2*longSide));
    }
}
