package day03scanner;

import java.util.Scanner;

public class Scanner01 {

    //Kullanicidan data alip kodlarimizda kullanacagiz

    // Object ismini "input" yaptim. cunku bu object  kullanicidan alinan data´yi benim kodlarimin icine koyacak.!!
    // System.in : sistemiin icine koy demek.
    //System.out.println() kodlarimi disari yazdir demek
    //nextByte



    public static void main(String[] args) {

        //1.adim: Scanner Class dan object olustur
        Scanner input =  new Scanner(System.in);

        //2.adim: Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("lütfen yasinizi giriniz...");

        //3.adim: Uygun methodu kullanarak kullanicinin verdigi datayi memory e yerlestiriniz.
        byte age = input.nextByte();
        System.out.println(age);
    }
}
