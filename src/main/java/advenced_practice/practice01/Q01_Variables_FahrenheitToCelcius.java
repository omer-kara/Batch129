package advenced_practice.practice01;

import java.text.DecimalFormat;
import java.util.Scanner;

// Fahrenheit değeri, Celsius değere çeviren kod yazınız.
// formül: c = (f-32)*5/9

public class Q01_Variables_FahrenheitToCelcius {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Fahrenheit degerini giriniz");

        double f = input.nextDouble();

        double c = (f-32)*5/9;
        System.out.println("Celcius : " + c);

        //Ondalik kismi belirli bir formata donusturmek icin:
        //1. Yol :DecimalFormat class

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String formattedCelsius = decimalFormat.format(c);
        System.out.println("formattedCelsius = " + formattedCelsius);

        //2.Yol :printf ile;
        //printf==> formati  String ile veriyi nasil yazilmasi gerektigini icin kullaniliyor
        //% herhangi bir sayi demektir// 3f basamakli demek
        //Printf ==> asagi yazdirmaz
        System.out.printf("Printf ile :"  + "%.3f",c );


    }


}
