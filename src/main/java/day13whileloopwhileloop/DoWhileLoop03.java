package day13whileloopwhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {

        /*
        Username = 'admin' ve Password = "pwd123" dur.

        Kullanicidan username ve password alin. Username ve password dogruysa "Hesabiniza hos geldiniz" yazdirin
        username ve password  yalnis ise 4 kere "Username ve password unuzu giriniz" mesaji versin.
         username ve password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz

         */
        Scanner input = new Scanner(System.in);




        int counter =0;//giris sayisi

        do {
            if (counter == 4) {
                System.out.println("Hesabiniz bloke olmustur!");
                break;

            }
            System.out.println("Usernameyi giriniz...");
            String username = input.next();

            System.out.println("Passwordu giriniz...");
            String password = input.next();

            if (username.equals("admin") && password.equals("pwd123")) {
                System.out.println("Hesabiniza hosgeldiniz");
                break;


            }
            counter++;
        }while(true);



    }
}
