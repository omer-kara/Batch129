package Practice06;

import java.util.Scanner;

public class Q01_Ascii_Karakterler {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ilk karakteri giriniz");
        char ch1 = input.next().charAt(0);
        System.out.println("ikinci karakteri giriniz");
        char ch2 = input.next().charAt(0);//char matematik isleminde kullanirsan ascii deger verir.
                                            // ancahk kendini yazdirirsan harf verir

        int ilk = Math.min(ch1,ch2);//hangisi kucukse 1 karakter olarak, buyuk olan 2 karakter olarak alacak
        int ikinci = Math.max(ch1,ch2);


        for (int i = ilk+1; i <ikinci ; i++) {
            System.out.print((char)+ i+ " ");//(char) yazmazsak ascii degeri yazdirir.

        }


    }
}
